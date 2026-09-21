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
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\" //'/\\\"44/hi!/44\\\"/'/a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a//\\\"4a////a4\\\"/'/\\\"44/hi!/44\\\"/'/\\\"4a////a4\\\"\\\"4a////a4\\\"a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//ahi!\\\"4a////a4\\\"\\\"4a////a4\\\"a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a\\\"4a////a4\\\"/'/\\\"44/hi!/44\\\"/'///a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a/'/\\\"44/hi!/44\\\"/'// \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" //'/\\\"44/hi!/44\\\"/'/a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a//\\\"4a////a4\\\"/'/\\\"44/hi!/44\\\"/'/\\\"4a////a4\\\"\\\"4a////a4\\\"a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//ahi!\\\"4a////a4\\\"\\\"4a////a4\\\"a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a\\\"4a////a4\\\"/'/\\\"44/hi!/44\\\"/'///a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a/'/\\\"44/hi!/44\\\"/'// \"" + "'", str1, "\" //'/\\\"44/hi!/44\\\"/'/a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a//\\\"4a////a4\\\"/'/\\\"44/hi!/44\\\"/'/\\\"4a////a4\\\"\\\"4a////a4\\\"a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//ahi!\\\"4a////a4\\\"\\\"4a////a4\\\"a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a\\\"4a////a4\\\"/'/\\\"44/hi!/44\\\"/'///a//\\\"4////4\\\"ahi!a\\\"4////4\\\"//a/'/\\\"44/hi!/44\\\"/'// \"");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"///////4/hi!/4///////\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"///////4/hi!/4///////\"/" + "'", str2, "/\"///////4/hi!/4///////\"/");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node23, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"#\\\\\\\"4a////a4\\\\\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"//\\\\\\\"4a////a4\\\\\\\"#\\\"\"", '#', "\"a/4a////a4/a\"", "\"//a////a//\"", "////", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"a/4a////a4/a\"////\"a/4a////a4/a\"#////////////\"a/4a////a4/a\"4a////a4////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"/////////////////////////////\"a/4a////a4/a\"hi!////////////////////////////\"a/4a////a4/a\"/////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"/////////////////////////////\"a/4a////a4/a\"hi!////////////////////////////\"a/4a////a4/a\"/////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"4a////a4////////////\"a/4a////a4/a\"#////\"a/4a////a4/a\"\"a/4a////a4/a\"#" + "'", str6, "#\"a/4a////a4/a\"////\"a/4a////a4/a\"#////////////\"a/4a////a4/a\"4a////a4////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"/////////////////////////////\"a/4a////a4/a\"hi!////////////////////////////\"a/4a////a4/a\"/////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"/////////////////////////////\"a/4a////a4/a\"hi!////////////////////////////\"a/4a////a4/a\"/////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"4a////a4////////////\"a/4a////a4/a\"#////\"a/4a////a4/a\"\"a/4a////a4/a\"#");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"ahi!a\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\"ahi!a\"////" + "'", str2, "////\"ahi!a\"////");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator2.addList(node31, false, context48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator28.addList(node35, false, context37);
        codeGenerator19.addList(node24, false, context37);
        codeGenerator2.addList(node15, true, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(" ////4/hi!/4//// ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" \"" + "'", str1, "\" \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" \"");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"\\\\\"///4/hi!/4///\\\\\"\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\"\\\\\"///4/hi!/4///\\\\\"\"/'/" + "'", str2, "/'/\"\\\\\"///4/hi!/4///\\\\\"\"/'/");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator38.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator38.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator38.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = null;
        codeGenerator55.addList(node56, true, context58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator55.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator55.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator55.addArrayList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator55.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node73, false, context75);
        codeGenerator38.addList(node51, false, context75);
        codeGenerator2.addList(node34, true, context75);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator2.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        java.lang.Class<?> wildcardClass24 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addList(node57, true);
        java.lang.Class<?> wildcardClass60 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator20.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator20.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node42, false, context44);
        codeGenerator20.addList(node37, false, context44);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator20.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator20.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node57, false, context59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator56.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator56.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator56.addAllSiblings(node67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = null;
        codeGenerator73.addList(node74, true, context76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator73.addArrayList(node78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator73.addArrayList(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator73.addArrayList(node82);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context86 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator73.addList(node84, false, context86);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator73.addList(node88, true);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator73.addList(node91, false, context93);
        codeGenerator56.addList(node69, false, context93);
        codeGenerator20.addList(node52, true, context93);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context86 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context86.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator21.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = null;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator39.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator21.addList(node35, false, context52);
        codeGenerator2.addList(node17, true, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator2.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator2.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node62, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/'\"aa////aa\"'/", 'a', "'a\"\\'\\\\\"hi!\\\\\"\\'\"/\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"///4/hi!/4///\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"/\"\\'\\\\\"hi!\\\\\"\\'\"a'", "", "/\"'\\\"hi!\\\"'\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/'a\"\\'\\\\\"hi!\\\\\"\\'\"/\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"///4/hi!/4///\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"/\"\\'\\\\\"hi!\\\\\"\\'\"a'aa////aa'a\"\\'\\\\\"hi!\\\\\"\\'\"/\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"///4/hi!/4///\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"/\"\\'\\\\\"hi!\\\\\"\\'\"a'/a" + "'", str6, "a/'a\"\\'\\\\\"hi!\\\\\"\\'\"/\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"///4/hi!/4///\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"/\"\\'\\\\\"hi!\\\\\"\\'\"a'aa////aa'a\"\\'\\\\\"hi!\\\\\"\\'\"/\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"///4/hi!/4///\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"/\"\\'\\\\\"hi!\\\\\"\\'\"a'/a");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'//\"\"//'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'//\"\"//'" + "'", str1, "'//\"\"//'");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, false, context19);
        codeGenerator2.addList(node12, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = null;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator18.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node29, false, context31);
        codeGenerator2.addList(node14, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addList(node34);
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'/\"44/hi!/44\"/'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//'/\"44/hi!/44\"/'//" + "'", str2, "//'/\"44/hi!/44\"/'//");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"'//\\\"\\\"//'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'//\\\"\\\"//'\"/" + "'", str1, "/\"'//\\\"\\\"//'\"/");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"4a////a4\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/a/hi!/a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a/hi!/a/" + "'", str1, "/a/hi!/a/");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//a///4/hi!/4///a//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//a///4/hi!/4///a//\"" + "'", str1, "\"//a///4/hi!/4///a//\"");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/4/hi!/4/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/4/hi!/4/\\\"\"" + "'", str1, "\"\\\"/4/hi!/4/\\\"\"");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator17.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node35, false, context37);
        codeGenerator2.addList(node13, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator44.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node59, false, context61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator58.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator58.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator58.addList(node67, true, context69);
        codeGenerator44.addList(node54, true, context69);
        codeGenerator2.addList(node40, false, context69);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addAllSiblings(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator2.addArrayList(node75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator21.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = null;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator39.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator21.addList(node35, false, context52);
        codeGenerator2.addList(node17, true, context52);
        java.lang.Class<?> wildcardClass56 = context52.getClass();
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        java.nio.charset.Charset charset5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4, charset5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator6.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator6.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node27, false, context29);
        codeGenerator17.addList(node22, false, context29);
        codeGenerator6.addList(node13, false, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node3, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"4/a/hi!/a/4\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"4/a/hi!/a/4\"/" + "'", str1, "/\"4/a/hi!/a/4\"/");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addList(node52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#\"/", '#', "/hi!/", "/'/\"\\\\\"///4/hi!/4///\\\\\"\"/'/", "/\"#ahi!a#\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#//hi!/#/\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!/#/hi!//#" + "'", str6, "#//hi!/#/\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!/#/hi!//#");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        java.lang.Class<?> wildcardClass19 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a#\"//a/hi!/a//\"\"//a/hi!/a//\"aa////aa\"//a/hi!/a//\"\"//a/hi!/a//\"#a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a#\"//a/hi!/a//\"\"//a/hi!/a//\"aa////aa\"//a/hi!/a//\"\"//a/hi!/a//\"#a/" + "'", str2, "/a#\"//a/hi!/a//\"\"//a/hi!/a//\"aa////aa\"//a/hi!/a//\"\"//a/hi!/a//\"#a/");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/ ahi!a /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "// ahi!a //" + "'", str2, "// ahi!a //");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\\\"hi!\\\"'/// hi! /ahi!a//'\\\"hi!\\\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\\\"hi!\\\"'/// hi! /ahi!a//'\\\"hi!\\\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\"" + "'", str1, "\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\\\"hi!\\\"'/// hi! /ahi!a//'\\\"hi!\\\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\"");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator21.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator36.addList(node37, false, context39);
        codeGenerator21.addList(node32, true, context39);
        codeGenerator2.addList(node17, true, context39);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("///4/a/hi!/a/4///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"///4/a/hi!/a/4///\"" + "'", str2, "\"///4/a/hi!/a/4///\"");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"44/hi!/44\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"44/hi!/44\\\"\"" + "'", str1, "\"\\\"44/hi!/44\\\"\"");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = null;
        codeGenerator26.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator26.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node37, false, context39);
        codeGenerator2.addList(node22, false, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("ahi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" /a///4/hi!/4///a/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ /a///4/hi!/4///a/ /" + "'", str1, "/ /a///4/hi!/4///a/ /");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/ /a///4/hi!/4///a/ /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/ /a///4/hi!/4///a/ /\"" + "'", str1, "\"/ /a///4/hi!/4///a/ /\"");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" //a/hi!/a// ", 'a', "\"a/hi!/a\"", "", "'\"4/hi!/4\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a //a/hi!/a// a" + "'", str6, "a //a/hi!/a// a");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#//\"hi!\"//a/4a////a4/a//\"hi!\"///4a////a4/a/4a////a4/a//\"hi!\"////\"hi!\"//#", 'a', "/\"\"/", "", "##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a#///\"\"/hi!/\"\"///a/4a////a4/a///\"\"/hi!/\"\"////4a////a4/a/4a////a4/a///\"\"/hi!/\"\"//////\"\"/hi!/\"\"///#a" + "'", str6, "a#///\"\"/hi!/\"\"///a/4a////a4/a///\"\"/hi!/\"\"////4a////a4/a/4a////a4/a///\"\"/hi!/\"\"//////\"\"/hi!/\"\"///#a");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/ //ahi!aahi!aahi!a// /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/ //ahi!aahi!aahi!a// /\"" + "'", str1, "\"/ //ahi!aahi!aahi!a// /\"");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator38.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator38.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator38.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = null;
        codeGenerator55.addList(node56, true, context58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator55.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator55.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator55.addArrayList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator55.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node73, false, context75);
        codeGenerator38.addList(node51, false, context75);
        codeGenerator2.addList(node34, true, context75);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator2.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/4ahi!a4/", '#', "#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#", "\"'//\\\"\\\"//'\"", "///4/hi!/4///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/4ahi!a4/#" + "'", str6, "#/4ahi!a4/#");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\"hi!\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node18, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = null;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator11.addList(node18, false, context20);
        codeGenerator2.addList(node7, true, context20);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\"////4/hi!/4////\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\"////4/hi!/4////\"/'" + "'", str1, "'/\"////4/hi!/4////\"/'");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\"hi!\"'/// hi! /ahi!a//'\"hi!\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\"hi!\"'/// hi! /ahi!a//'\"hi!\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4/" + "'", str2, "/4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\"hi!\"'/// hi! /ahi!a//'\"hi!\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4/");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a\"/hi!/\"ahi!a\"/hi!/\"a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a\\\"/hi!/\\\"ahi!a\\\"/hi!/\\\"a\"" + "'", str1, "\"a\\\"/hi!/\\\"ahi!a\\\"/hi!/\\\"a\"");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"ahi!a\"'", '4', "/ ahi!a /", "/'\"a////4/hi!/4/////hi!/////4/hi!/4////a\"'/", "\"//\\\"/hi!/\\\"//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/'\"a////4/hi!/4/////hi!/////4/hi!/4////a\"'// ahi!a /ahi!a/ ahi!a //'\"a////4/hi!/4/////hi!/////4/hi!/4////a\"'/4" + "'", str6, "4/'\"a////4/hi!/4/////hi!/////4/hi!/4////a\"'// ahi!a /ahi!a/ ahi!a //'\"a////4/hi!/4/////hi!/////4/hi!/4////a\"'/4");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'/\\\"\\\"/'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'/\\\\\\\"\\\\\\\"/'\\\"\"" + "'", str1, "\"\\\"'/\\\\\\\"\\\\\\\"/'\\\"\"");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//'/\"/\\\\\"hi!\\\\\"/\"/'//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//'/\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"/'//\"" + "'", str1, "\"//'/\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"/'//\"");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("a/////4/hi!/4/////a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"a/////4/hi!/4/////a\"" + "'", str2, "\"a/////4/hi!/4/////a\"");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator27.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = null;
        codeGenerator36.addList(node37, true, context39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator36.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator36.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator36.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node47, false, context49);
        codeGenerator27.addList(node32, false, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node23, 10, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/", '4', "\"aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa\"", "\"a/////4/hi!/4/////a\"", "'/\"\\\\\"///4/hi!/4///\\\\\"\"/'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/4" + "'", str6, "4/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/4");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator18.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node27, true, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"a////a\\\"\"", 'a', "//\"44/hi!/44\"//", "", " ////4/hi!/4//// ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a" + "'", str6, "a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator28.addList(node35, false, context37);
        codeGenerator19.addList(node24, false, context37);
        codeGenerator2.addList(node15, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addList(node41);
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node34, false, context36);
        codeGenerator19.addList(node29, false, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#/a/hi!/ahi!a/hi!/a/#", 'a', "a#\"//a/hi!/a//\"\"//a/hi!/a//\"aa////aa\"//a/hi!/a//\"\"//a/hi!/a//\"#a", "a/a//\"4////4\"ahi!a\"4////4\"//aahi!aa//\"4////4\"ahi!a\"4////4\"//a/a", "/\" a/hi!/ahi!a/hi!/a \"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a#/a/hi!/ahi!a/hi!/a/#a" + "'", str6, "a#/a/hi!/ahi!a/hi!/a/#a");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//a////a//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///a////a///" + "'", str1, "///a////a///");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node34, 0, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'\"aa////aa\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'\\\"aa////aa\\\"'/\"" + "'", str1, "\"/'\\\"aa////aa\\\"'/\"");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("///'\"hi!\"'///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"///'\\\"hi!\\\"'///\"" + "'", str2, "\"///'\\\"hi!\\\"'///\"");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"//a////a//\"'", '4', "#//hi!/#/\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!/#/hi!//#", "//\"\\\"ahi!a\\\"\"//", "//\"\"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4//\"\\\"ahi!a\\\"\"//#//hi!/#/\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!/#/hi!//#//a////a//#//hi!/#/\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!/#/hi!//#//\"\\\"ahi!a\\\"\"//4" + "'", str6, "4//\"\\\"ahi!a\\\"\"//#//hi!/#/\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!/#/hi!//#//a////a//#//hi!/#/\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!///\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!/hi!/\"#ahi!a#\"//\"#ahi!a#\"//\"#ahi!a#\"//hi!///\"#ahi!a#\"//hi!////\"#ahi!a#\"//hi!/4a////a4/\"#ahi!a#\"//hi!/#/hi!//#//\"\\\"ahi!a\\\"\"//4");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"///4/a/hi!/a/4///\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"///4/a/hi!/a/4///\"'" + "'", str2, "'\"///4/a/hi!/a/4///\"'");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator17.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator17.addList(node31, false, context48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node13, (int) '#', context48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = null;
        codeGenerator2.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = null;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator22.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator40.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator40.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator54.addList(node55, true, context57);
        codeGenerator40.addList(node50, false, context57);
        codeGenerator22.addList(node36, true, context57);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator65.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator65.addArrayList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator65.addList(node72, true);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        java.nio.charset.Charset charset78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77, charset78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator79.addList(node80, false, context82);
        codeGenerator65.addList(node75, false, context82);
        codeGenerator22.addList(node61, true, context82);
        codeGenerator2.addList(node18, false, context82);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator2.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator2.addAllSiblings(node89);
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node17, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = null;
        codeGenerator20.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator2.addList(node16, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator2.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator2.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node32, false, context34);
        codeGenerator17.addList(node27, false, context34);
        codeGenerator2.addList(node13, false, context34);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = null;
        codeGenerator42.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator42.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator42.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator42.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator42.addList(node55, false, context57);
        codeGenerator2.addList(node38, false, context57);
        com.google.javascript.rhino.Node node60 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node60, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("a/44///\"/ahi!a/\"///a////a///\"/ahi!a/\"///44/a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'a/44///\"/ahi!a/\"///a////a///\"/ahi!a/\"///44/a'" + "'", str2, "'a/44///\"/ahi!a/\"///a////a///\"/ahi!a/\"///44/a'");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = null;
        codeGenerator31.addList(node32, true, context34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator31.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator31.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = null;
        codeGenerator47.addList(node48, true, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator47.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator47.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator47.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node58, false, context60);
        codeGenerator31.addList(node43, true, context60);
        codeGenerator17.addList(node27, false, context60);
        codeGenerator2.addList(node13, true, context60);
        com.google.javascript.rhino.Node node65 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator20.addList(node23, true, context25);
        codeGenerator2.addList(node16, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node28, (int) (byte) 10, context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("' \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" '");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "' \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" '" + "'", str1, "' \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" '");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = null;
        codeGenerator2.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/4//'/a\"/hi!/\"ahi!a\"/hi!/\"a/'44/hi!/44'/a\"/hi!/\"ahi!a\"/hi!/\"a/'//4/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node5, true, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"4///44/hi!/44///4\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"a//a/hi!/aa/hi!/a//a\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"a//a/hi!/aa/hi!/a//a\"/'" + "'", str2, "'/\"a//a/hi!/aa/hi!/a//a\"/'");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node18, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#4'" + "'", str2, "'4#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#4'");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/4/'\"aa////aa\"'///'/\"44/hi!/44\"/'/4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/'/\"44/hi!/44\"/'////4/hi!/4///4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/'/\"44/hi!/44\"/'//'/\"44/hi!/44\"/'///'\"aa////aa\"'/4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4/'\"aa////aa\"'///'/\"44/hi!/44\"/'/4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/'/\"44/hi!/44\"/'////4/hi!/4///4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/'/\"44/hi!/44\"/'//'/\"44/hi!/44\"/'///'\"aa////aa\"'/4/" + "'", str1, "/4/'\"aa////aa\"'///'/\"44/hi!/44\"/'/4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/'/\"44/hi!/44\"/'////4/hi!/4///4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/'/\"44/hi!/44\"/'//'/\"44/hi!/44\"/'///'\"aa////aa\"'/4/");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = null;
        codeGenerator20.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator2.addList(node16, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("#a/4/hi!/4/a#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"#a/4/hi!/4/a#\"" + "'", str2, "\"#a/4/hi!/4/a#\"");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"/" + "'", str2, "/\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"/");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'#\"//\\'\\\\\"ahi!a\\\\\"\\'//\" a/hi!/ahi!a/hi!/a \"//\\'\\\\\"ahi!a\\\\\"\\'//\"#'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'#\"//\\'\\\\\"ahi!a\\\\\"\\'//\" a/hi!/ahi!a/hi!/a \"//\\'\\\\\"ahi!a\\\\\"\\'//\"#'/" + "'", str2, "/'#\"//\\'\\\\\"ahi!a\\\\\"\\'//\" a/hi!/ahi!a/hi!/a \"//\\'\\\\\"ahi!a\\\\\"\\'//\"#'/");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node11, true, context13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'//\"ahi!a\"//'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\\'#\"//\\\\\\'\\\\\\\\\"ahi!a\\\\\\\\\"\\\\\\'//\" a/hi!/ahi!a/hi!/a \"//\\\\\\'\\\\\\\\\"ahi!a\\\\\\\\\"\\\\\\'//\"#\\''", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'\\\\'#\\\"//\\\\\\\\\\\\'\\\\\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\'//\\\" a/hi!/ahi!a/hi!/a \\\"//\\\\\\\\\\\\'\\\\\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\'//\\\"#\\\\''\"" + "'", str2, "\"'\\\\'#\\\"//\\\\\\\\\\\\'\\\\\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\'//\\\" a/hi!/ahi!a/hi!/a \\\"//\\\\\\\\\\\\'\\\\\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\'//\\\"#\\\\''\"");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#///\"\\\"ahi!a\\\"\"///aa////4/hi!/4/////hi!/////4/hi!/4////a/a/#4///44/hi!/44///4#hi!#4///44/hi!/44///4#//hi!//#4///44/hi!/44///4#hi!#4///44/hi!/44///4#/ahi!a/#4///44/hi!/44///4#hi!#4///44/hi!/44///4#//hi!//#4///44/hi!/44///4#hi!#4///44/hi!/44///4#/a/a////4/hi!/4/////hi!/////4/hi!/4////aa///\"\\\"ahi!a\\\"\"///#", '#', "//\"\"//", "'\"///\\'\\\\\"hi!\\\\\"\\'///\"'", "//\"\\\"ahi!a\\\"\"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##/////\"\"////\"\\\"ahi!a\\\"\"////\"\"//ahi!a//\"\\\"ahi!a\\\"\"////\"\"////\"\"/////aa////4/hi!/4/////hi!/////4/hi!/4////a/a/#4///44/hi!/44///4#hi!#4///44/hi!/44///4#//hi!//#4///44/hi!/44///4#hi!#4///44/hi!/44///4#/ahi!a/#4///44/hi!/44///4#hi!#4///44/hi!/44///4#//hi!//#4///44/hi!/44///4#hi!#4///44/hi!/44///4#/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/////\"\"////\"\\\"ahi!a\\\"\"////\"\"//ahi!a//\"\\\"ahi!a\\\"\"////\"\"////\"\"/////##" + "'", str6, "##/////\"\"////\"\\\"ahi!a\\\"\"////\"\"//ahi!a//\"\\\"ahi!a\\\"\"////\"\"////\"\"/////aa////4/hi!/4/////hi!/////4/hi!/4////a/a/#4///44/hi!/44///4#hi!#4///44/hi!/44///4#//hi!//#4///44/hi!/44///4#hi!#4///44/hi!/44///4#/ahi!a/#4///44/hi!/44///4#hi!#4///44/hi!/44///4#//hi!//#4///44/hi!/44///4#hi!#4///44/hi!/44///4#/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/////\"\"////\"\\\"ahi!a\\\"\"////\"\"//ahi!a//\"\\\"ahi!a\\\"\"////\"\"////\"\"/////##");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node17, true, context19);
        codeGenerator2.addList(node12, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, false, context38);
        codeGenerator26.addList(node31, false, context38);
        codeGenerator2.addList(node22, false, context38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node31, true, context33);
        codeGenerator17.addList(node26, true, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator17.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator17.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator17.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator17.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator17.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        java.nio.charset.Charset charset51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50, charset51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator52.addList(node53, true, context55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator52.addList(node57, true, context59);
        codeGenerator17.addList(node48, false, context59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node13, (int) (short) 1, context59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = null;
        codeGenerator20.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node31, false, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator2.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        java.nio.charset.Charset charset65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64, charset65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator66.addList(node69, true);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator66.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator66.addArrayList(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator66.addList(node76, false, context78);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node62, (int) (short) -1, context78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = null;
        codeGenerator15.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator15.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator15.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator15.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator15.addList(node28, false, context30);
        codeGenerator2.addList(node11, false, context30);
        java.lang.Class<?> wildcardClass33 = context30.getClass();
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4//#\"\"aa////aa\"\"#///4/hi!/4//\"a///4/hi!/4///a\"\"a///4/hi!/4///a\"/4/hi!/4/hi!\"a///4/hi!/4///a\"\"a///4/hi!/4///a\"/4/hi!/4///4/hi!/4///#\"\"aa////aa\"\"#//4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"\\\"ahi!a\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\\\\\"ahi!a\\\\\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\\\\\"ahi!a\\\\\\\"\\\"//\"");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a#/a/hi!/ahi!a/hi!/a/#a", '4', "////\"ahi!a\"////", "/'/a//\"4////4\"ahi!a\"4////4\"//a/'/", "'/\" a/hi!/ahi!a/hi!/a \"/'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4a#/a/hi!/ahi!a/hi!/a/#a4" + "'", str6, "4a#/a/hi!/ahi!a/hi!/a/#a4");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = null;
        codeGenerator27.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator27.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator27.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node38, false, context40);
        codeGenerator18.addList(node23, false, context40);
        codeGenerator2.addList(node14, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = null;
        codeGenerator48.addList(node49, true, context51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator48.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator48.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator48.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node59, false, context61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator48.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator48.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node75, false, context77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator74.addList(node79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer83 = null;
        java.nio.charset.Charset charset84 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator85 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer83, charset84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator85.addList(node86, false, context88);
        codeGenerator74.addList(node81, false, context88);
        codeGenerator48.addList(node70, true, context88);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node44, (int) (short) 100, context88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4///44/hi!/44///4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4///44/hi!/44///4\"" + "'", str1, "\"4///44/hi!/44///4\"");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        java.lang.Class<?> wildcardClass21 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//4a////a4//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///4a////a4///" + "'", str2, "///4a////a4///");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"///4/hi!/4///\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"///4/hi!/4///\\\"\"//" + "'", str2, "//\"\\\"///4/hi!/4///\\\"\"//");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("a/\"/\\\"hi!\\\"/\"//\"ahi!a\"/\"/\\\"hi!\\\"/\"/hi!\"ahi!a\"/\"/\\\"hi!\\\"/\"///\"/\\\"hi!\\\"/\"/a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a'" + "'", str2, "'a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a'");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator17.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node35, false, context37);
        codeGenerator2.addList(node13, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator44.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node59, false, context61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator58.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator58.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator58.addList(node67, true, context69);
        codeGenerator44.addList(node54, true, context69);
        codeGenerator2.addList(node40, false, context69);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator2.addAllSiblings(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator2.addArrayList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        java.nio.charset.Charset charset80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79, charset80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator81.addList(node82, false, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node77, (int) '4', context84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, false, context19);
        codeGenerator2.addList(node12, false, context19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"//\\\"44/hi!/44\\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'#//\"hi!\"//a/4a////a4/a//\"hi!\"///4a////a4/a/4a////a4/a//\"hi!\"////\"hi!\"//#'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'#//\"hi!\"//a/4a////a4/a//\"hi!\"///4a////a4/a/4a////a4/a//\"hi!\"////\"hi!\"//#'" + "'", str1, "'#//\"hi!\"//a/4a////a4/a//\"hi!\"///4a////a4/a/4a////a4/a//\"hi!\"////\"hi!\"//#'");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        java.lang.Class<?> wildcardClass20 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator34.addList(node35, true, context37);
        codeGenerator20.addList(node30, false, context37);
        codeGenerator2.addList(node16, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator45.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator45.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node60, false, context62);
        codeGenerator45.addList(node55, false, context62);
        codeGenerator2.addList(node41, true, context62);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node17, false, context19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator14.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator14.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator14.addList(node23, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node16, false, context18);
        codeGenerator2.addList(node11, false, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        java.lang.Class<?> wildcardClass25 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" \"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"/44/hi!/44/\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\" ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ \"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"/44/hi!/44/\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\" /" + "'", str2, "/ \"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"/44/hi!/44/\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\" /");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#4#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#//4/hi!/4//#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#4#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#4#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#//4/hi!/4//#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#4#" + "'", str1, "#4#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#//4/hi!/4//#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#4#");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//a\"/hi!/\"ahi!a\"/hi!/\"a//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///a\"/hi!/\"ahi!a\"/hi!/\"a///" + "'", str2, "///a\"/hi!/\"ahi!a\"/hi!/\"a///");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node14, false, context16);
        codeGenerator2.addList(node9, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, false, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator15.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = null;
        codeGenerator33.addList(node34, true, context36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator33.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator33.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator33.addList(node44, false, context46);
        codeGenerator15.addList(node29, false, context46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a/\"/\\\"hi!\\\"/\"//\"ahi!a\"/\"/\\\"hi!\\\"/\"/hi!\"ahi!a\"/\"/\\\"hi!\\\"/\"///\"/\\\"hi!\\\"/\"/a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a\"" + "'", str1, "\"a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a\"");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#", '4', "'/\"\\\\\"///4/hi!/4///\\\\\"\"/'", "/#ahi!a#/", "\"//4ahi!a4//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4" + "'", str6, "4#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = null;
        codeGenerator20.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator2.addList(node16, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node5, true, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\" ahi!a \"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'/\"/4a////a4/\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'/\\\"/4a////a4/\\\"/'\"" + "'", str1, "\"'/\\\"/4a////a4/\\\"/'\"");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"\\\\\"a////4/hi!/4/////hi!/////4/hi!/4////a\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"\\\\\"a////4/hi!/4/////hi!/////4/hi!/4////a\\\\\"\"'" + "'", str1, "'\"\\\\\"a////4/hi!/4/////hi!/////4/hi!/4////a\\\\\"\"'");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4//'/a\"/hi!/\"ahi!a\"/hi!/\"a/'44/hi!/44'/a\"/hi!/\"ahi!a\"/hi!/\"a/'//4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"'/\\\"\\\"/'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\'/\\\\\"\\\\\"/\\'\"'" + "'", str2, "'\"\\'/\\\\\"\\\\\"/\\'\"'");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a//a/hi!/a//a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a//a/hi!/a//a/" + "'", str1, "/a//a/hi!/a//a/");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"4a////a4\\\"\"", 'a', "/\"a////a\"/", "4 hi! 4", "4#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/\"a////a\"/4#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4/\"a////a\"/4a////a44#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4/\"a////a\"//\"a////a\"/a" + "'", str6, "a/\"a////a\"/4#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4/\"a////a\"/4a////a44#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4/\"a////a\"//\"a////a\"/a");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"'\\\"//a////a//\\\"'\"/", 'a', "a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a", "//a\"/hi!/\"ahi!a\"/hi!/\"a//", "#\"\"aa////aa\"\"#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a//a\"/hi!/\"ahi!a\"/hi!/\"a//#\"\"aa////aa\"\"#a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a//a////a//#\"\"aa////aa\"\"#a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a//a\"/hi!/\"ahi!a\"/hi!/\"a//a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a/a" + "'", str6, "a/a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a//a\"/hi!/\"ahi!a\"/hi!/\"a//#\"\"aa////aa\"\"#a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a//a////a//#\"\"aa////aa\"\"#a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a//a\"/hi!/\"ahi!a\"/hi!/\"a//a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a/a");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#4#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#//4/hi!/4//#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#4#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#4#\\\"////\\\"4a////a4\\\"////\\\"//\\\"////\\\"/a//a\\\"////\\\"hi!a//a\\\"////\\\"/\\\"////\\\"//\\\"////\\\"/a//a\\\"////\\\"hi!a//a\\\"////\\\"/\\\"////\\\"//\\\"////\\\"4a////a4\\\"////\\\"#//4/hi!/4//#\\\"////\\\"4a////a4\\\"////\\\"//\\\"////\\\"/a//a\\\"////\\\"hi!a//a\\\"////\\\"/\\\"////\\\"//\\\"////\\\"/a//a\\\"////\\\"hi!a//a\\\"////\\\"/\\\"////\\\"//\\\"////\\\"4a////a4\\\"////\\\"#4#\"" + "'", str1, "\"#4#\\\"////\\\"4a////a4\\\"////\\\"//\\\"////\\\"/a//a\\\"////\\\"hi!a//a\\\"////\\\"/\\\"////\\\"//\\\"////\\\"/a//a\\\"////\\\"hi!a//a\\\"////\\\"/\\\"////\\\"//\\\"////\\\"4a////a4\\\"////\\\"#//4/hi!/4//#\\\"////\\\"4a////a4\\\"////\\\"//\\\"////\\\"/a//a\\\"////\\\"hi!a//a\\\"////\\\"/\\\"////\\\"//\\\"////\\\"/a//a\\\"////\\\"hi!a//a\\\"////\\\"/\\\"////\\\"//\\\"////\\\"4a////a4\\\"////\\\"#4#\"");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node38, true, context40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node42, true, context44);
        codeGenerator2.addList(node33, false, context44);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node51, true, context53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node55, true, context57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator50.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator50.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator50.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator50.addList(node65, false, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node47, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = null;
        codeGenerator25.addList(node26, true, context28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator25.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator25.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator25.addList(node36, false, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator25.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator25.addList(node43, false, context45);
        codeGenerator2.addList(node21, false, context45);
        java.lang.Class<?> wildcardClass48 = context45.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4/" + "'", str2, "/4#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#4/");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("///\"#/a/hi!/ahi!a/hi!/a/#\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'///\"#/a/hi!/ahi!a/hi!/a/#\"///'" + "'", str2, "'///\"#/a/hi!/ahi!a/hi!/a/#\"///'");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node24, false, context26);
        codeGenerator2.addList(node13, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node31, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node18, false, context20);
        codeGenerator2.addList(node7, false, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///\"\\\"ahi!a\\\"\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator38.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator38.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator38.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = null;
        codeGenerator55.addList(node56, true, context58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator55.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator55.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator55.addArrayList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator55.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node73, false, context75);
        codeGenerator38.addList(node51, false, context75);
        codeGenerator2.addList(node34, true, context75);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator2.addAllSiblings(node79);
        java.lang.Class<?> wildcardClass81 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#\"//'\\\"ahi!a\\\"'//\" a/hi!/ahi!a/hi!/a \"//'\\\"ahi!a\\\"'//\"#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#\"//'\\\"ahi!a\\\"'//\" a/hi!/ahi!a/hi!/a \"//'\\\"ahi!a\\\"'//\"#" + "'", str1, "#\"//'\\\"ahi!a\\\"'//\" a/hi!/ahi!a/hi!/a \"//'\\\"ahi!a\\\"'//\"#");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator14.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator14.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, false, context38);
        codeGenerator14.addList(node31, false, context38);
        codeGenerator2.addList(node10, false, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator2.addList(node47);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" //a/hi!/a// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " //a/hi!/a// " + "'", str1, " //a/hi!/a// ");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        java.lang.Class<?> wildcardClass12 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator13.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = null;
        codeGenerator28.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator28.addList(node35, false, context37);
        codeGenerator13.addList(node24, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator13.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator13.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator49.addList(node50, true, context52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator49.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator49.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node63, true, context65);
        codeGenerator49.addList(node58, true, context65);
        codeGenerator13.addList(node45, true, context65);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node9, 10, context65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node17, false, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator16.addList(node25, true, context27);
        codeGenerator2.addList(node12, true, context27);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30);
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'/\"a//a/hi!/aa/hi!/a//a\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'/\\\"a//a/hi!/aa/hi!/a//a\\\"/'\"" + "'", str1, "\"'/\\\"a//a/hi!/aa/hi!/a//a\\\"/'\"");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'\"//\\'\\\\\"hi!\\\\\"\\'//\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"//\\'\\\\\"hi!\\\\\"\\'//\"'/" + "'", str1, "/'\"//\\'\\\\\"hi!\\\\\"\\'//\"'/");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("a##a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"a##a\"" + "'", str2, "\"a##a\"");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'a\"/hi!/\"ahi!a\"/hi!/\"a'", 'a', "/'/\"////4/hi!/4////\"/'/", "a#/a/hi!/ahi!a/hi!/a/#a", "ahi!a", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa#/a/hi!/ahi!a/hi!/a/#aa/'/\"////4/hi!/4////\"/'//hi!//'/\"////4/hi!/4////\"/'/ahi!a/'/\"////4/hi!/4////\"/'//hi!//'/\"////4/hi!/4////\"/'/aa#/a/hi!/ahi!a/hi!/a/#aa" + "'", str6, "aa#/a/hi!/ahi!a/hi!/a/#aa/'/\"////4/hi!/4////\"/'//hi!//'/\"////4/hi!/4////\"/'/ahi!a/'/\"////4/hi!/4////\"/'//hi!//'/\"////4/hi!/4////\"/'/aa#/a/hi!/ahi!a/hi!/a/#aa");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = null;
        codeGenerator26.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator26.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node37, false, context39);
        codeGenerator2.addList(node22, false, context39);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node47, false, context49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator46.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator46.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator46.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = null;
        codeGenerator63.addList(node64, true, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator63.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator63.addArrayList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator63.addArrayList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator63.addList(node74, false, context76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator63.addList(node78, true);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator63.addList(node81, false, context83);
        codeGenerator46.addList(node59, false, context83);
        codeGenerator2.addList(node42, true, context83);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator2.addAllSiblings(node87);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//\"a/hi!/a\"//", 'a', "\"a\\\"/hi!/\\\"ahi!a\\\"/hi!/\\\"a\"", "#\"a/4a////a4/a\"////\"a/4a////a4/a\"#////////////\"a/4a////a4/a\"4a////a4////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"/////////////////////////////\"a/4a////a4/a\"hi!////////////////////////////\"a/4a////a4/a\"/////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"/////////////////////////////\"a/4a////a4/a\"hi!////////////////////////////\"a/4a////a4/a\"/////////////\"a/4a////a4/a\"//////////////\"a/4a////a4/a\"4a////a4////////////\"a/4a////a4/a\"#////\"a/4a////a4/a\"\"a/4a////a4/a\"#", "\"/\\\" ahi!a \\\"/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//\"a\\\"/hi!/\\\"ahi!a\\\"/hi!/\\\"a\"a/hi!/a\"a\\\"/hi!/\\\"ahi!a\\\"/hi!/\\\"a\"//a" + "'", str6, "a//\"a\\\"/hi!/\\\"ahi!a\\\"/hi!/\\\"a\"a/hi!/a\"a\\\"/hi!/\\\"ahi!a\\\"/hi!/\\\"a\"//a");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, false);
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a#/a/hi!/ahi!a/hi!/a/#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator17.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator33.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator33.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator33.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator33.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = null;
        codeGenerator55.addList(node56, true, context58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator55.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator55.addList(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        java.nio.charset.Charset charset67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66, charset67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator68.addArrayList(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator68.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator68.addAllSiblings(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator68.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator68.addList(node77, false, context79);
        codeGenerator55.addList(node64, true, context79);
        codeGenerator33.addList(node51, true, context79);
        codeGenerator17.addList(node29, false, context79);
        codeGenerator2.addList(node13, true, context79);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node13, true, context15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node21, (int) (short) 10, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"//\\\"hi!\\\"//\"", '4', "'\"///4/a/hi!/a/4///\"'", "#4///44/hi!/44///4#", "#a////a////a////a#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4'\"///4/a/hi!/a/4///\"'//#a////a////a////a#'\"///4/a/hi!/a/4///\"'hi!#a////a////a////a#'\"///4/a/hi!/a/4///\"'//'\"///4/a/hi!/a/4///\"'4" + "'", str6, "4'\"///4/a/hi!/a/4///\"'//#a////a////a////a#'\"///4/a/hi!/a/4///\"'hi!#a////a////a////a#'\"///4/a/hi!/a/4///\"'//'\"///4/a/hi!/a/4///\"'4");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator23.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator23.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator23.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node45, false, context47);
        codeGenerator23.addList(node40, false, context47);
        codeGenerator11.addList(node19, false, context47);
        codeGenerator2.addList(node7, false, context47);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator61.addList(node64, true);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator61.addList(node67, true);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator61.addArrayList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator61.addList(node72, false);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator61.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator61.addList(node77, true);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator61.addList(node80, true, context82);
        codeGenerator2.addList(node57, true, context82);
        com.google.javascript.rhino.Node node85 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node85, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"a////4/hi!/4/////hi!/////4/hi!/4////a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/\"" + "'", str2, "\"/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/\"");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'/\"////4/hi!/4////\"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'/\\\"////4/hi!/4////\\\"/'/\"" + "'", str1, "\"/'/\\\"////4/hi!/4////\\\"/'/\"");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = null;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = null;
        codeGenerator32.addList(node33, true, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator32.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator16.addList(node28, true, context45);
        codeGenerator2.addList(node12, false, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addList(node51, true);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node59, false, context61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator58.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator58.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator72.addArrayList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator72.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator72.addAllSiblings(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator72.addList(node79, true, context81);
        codeGenerator58.addList(node68, true, context81);
        codeGenerator2.addList(node54, true, context81);
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" //#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" // \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" //#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" // \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" #/" + "'", str1, "/# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" //#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" // \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" #/");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" \"//\\\"hi!\\\"//\"////\"hi!\"////4a////a4////\"hi!\"////\"//\\\"hi!\\\"//\" ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' \"//\\\\\"hi!\\\\\"//\"////\"hi!\"////4a////a4////\"hi!\"////\"//\\\\\"hi!\\\\\"//\" '" + "'", str2, "' \"//\\\\\"hi!\\\\\"//\"////\"hi!\"////4a////a4////\"hi!\"////\"//\\\\\"hi!\\\\\"//\" '");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator34.addList(node35, true, context37);
        codeGenerator20.addList(node30, false, context37);
        codeGenerator2.addList(node16, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator45.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator45.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node60, false, context62);
        codeGenerator45.addList(node55, false, context62);
        codeGenerator2.addList(node41, true, context62);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        java.nio.charset.Charset charset69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68, charset69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator70.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        java.nio.charset.Charset charset80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79, charset80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator81.addList(node82, false, context84);
        codeGenerator70.addList(node77, false, context84);
        codeGenerator2.addList(node66, true, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4a/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"#ahi!a#\\\"\"\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"hi!\"\\\"#ahi!a#\\\"\"\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"//\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"ahi!a\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"#ahi!a#\\\"\"\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"hi!\"\\\"#ahi!a#\\\"\"\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/hi!\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"ahi!a\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"#ahi!a#\\\"\"\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"hi!\"\\\"#ahi!a#\\\"\"\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"///\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"#ahi!a#\\\"\"\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"hi!\"\\\"#ahi!a#\\\"\"\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//a/hi!/a//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"#\\\\\"4a////a4\\\\\"//\\\\\"/\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"/\\\\\"//\\\\\"/\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"/\\\\\"//\\\\\"4a////a4\\\\\"#\"/'" + "'", str2, "'/\"#\\\\\"4a////a4\\\\\"//\\\\\"/\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"/\\\\\"//\\\\\"/\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"/\\\\\"//\\\\\"4a////a4\\\\\"#\"/'");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"//'\\\\\\\"hi!\\\\\\\"'//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"//'\\\\\\\"hi!\\\\\\\"'//\\\"/\"/" + "'", str1, "/\"/\\\"//'\\\\\\\"hi!\\\\\\\"'//\\\"/\"/");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a/" + "'", str2, "/a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a/");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = null;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = null;
        codeGenerator32.addList(node33, true, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator32.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator16.addList(node28, true, context45);
        codeGenerator2.addList(node12, false, context45);
        java.lang.Class<?> wildcardClass49 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = null;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator11.addList(node18, false, context20);
        codeGenerator2.addList(node7, true, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node27, false, context29);
        codeGenerator2.addList(node16, true, context29);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = null;
        codeGenerator40.addList(node41, true, context43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator40.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator40.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator40.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node51, false, context53);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node37, context53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator17.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator17.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node32, false, context34);
        codeGenerator2.addList(node13, true, context34);
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node37, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node27, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator17.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator35.addList(node38, true, context40);
        codeGenerator17.addList(node31, true, context40);
        codeGenerator2.addList(node13, true, context40);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator48.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator48.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node57, false, context59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node44, (int) (byte) -1, context59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//'a/\"a//a/hi!/aa/hi!/a//a\"//a\"//\\'\\\\\"hi!\\\\\"\\'//\"/hi!/\"//\\'\\\\\"hi!\\\\\"\\'//\"ahi!a\"//\\'\\\\\"hi!\\\\\"\\'//\"/hi!/\"//\\'\\\\\"hi!\\\\\"\\'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a'//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//'a/\\\"a//a/hi!/aa/hi!/a//a\\\"//a\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"/hi!/\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"ahi!a\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"/hi!/\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"a//\\\"a//a/hi!/aa/hi!/a//a\\\"/a'//\"" + "'", str1, "\"//'a/\\\"a//a/hi!/aa/hi!/a//a\\\"//a\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"/hi!/\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"ahi!a\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"/hi!/\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"a//\\\"a//a/hi!/aa/hi!/a//a\\\"/a'//\"");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node21, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node36, false, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node47, false, context49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator46.addList(node53, false, context55);
        codeGenerator35.addList(node42, false, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node31, (-1), context55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//'\"a////4/hi!/4/////hi!/////4/hi!/4////a\"'//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//'\\\"a////4/hi!/4/////hi!/////4/hi!/4////a\\\"'//\"" + "'", str1, "\"//'\\\"a////4/hi!/4/////hi!/////4/hi!/4////a\\\"'//\"");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a/" + "'", str1, "/a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a/");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"'//\\\"\\\"//'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"'//\\\"\\\"//'\"//" + "'", str1, "//\"'//\\\"\\\"//'\"//");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a#a#\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"aa////aa\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"#a#a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a#a#\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"aa////aa\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"#a#a/" + "'", str1, "/a#a#\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"aa////aa\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"//a/hi!/a//\"//////4/hi!/4//////\"//#ahi!a#//#ahi!a#//\"//////4/hi!/4//////\"#a#a/");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = null;
        codeGenerator20.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator2.addList(node16, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node27, false, context29);
        codeGenerator2.addList(node16, true, context29);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = null;
        codeGenerator20.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator2.addList(node16, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator2.addArrayList(node38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" /a\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/hi!/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"ahi!a\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/hi!/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"a/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ /a\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/hi!/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"ahi!a\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/hi!/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"a/ /" + "'", str1, "/ /a\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/hi!/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"ahi!a\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"/hi!/\"\\\"\\\\\\\"ahi!a\\\\\\\"\\\"\"a/ /");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addArrayList(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//'\"ahi!a\"'//", 'a', "a/\"/\\\"hi!\\\"/\"//\"ahi!a\"/\"/\\\"hi!\\\"/\"/hi!\"ahi!a\"/\"/\\\"hi!\\\"/\"///\"/\\\"hi!\\\"/\"/a", "'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'", "///4a////a4///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'a/\"/\\\"hi!\\\"/\"//\"ahi!a\"/\"/\\\"hi!\\\"/\"/hi!\"ahi!a\"/\"/\\\"hi!\\\"/\"///\"/\\\"hi!\\\"/\"/aahi!aa/\"/\\\"hi!\\\"/\"//\"ahi!a\"/\"/\\\"hi!\\\"/\"/hi!\"ahi!a\"/\"/\\\"hi!\\\"/\"///\"/\\\"hi!\\\"/\"/a'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'//a" + "'", str6, "a//'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'a/\"/\\\"hi!\\\"/\"//\"ahi!a\"/\"/\\\"hi!\\\"/\"/hi!\"ahi!a\"/\"/\\\"hi!\\\"/\"///\"/\\\"hi!\\\"/\"/aahi!aa/\"/\\\"hi!\\\"/\"//\"ahi!a\"/\"/\\\"hi!\\\"/\"/hi!\"ahi!a\"/\"/\\\"hi!\\\"/\"///\"/\\\"hi!\\\"/\"/a'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'//a");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/4//'/a\"/hi!/\"ahi!a\"/hi!/\"a/'44/hi!/44'/a\"/hi!/\"ahi!a\"/hi!/\"a/'//4/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/4//\\'/a\"/hi!/\"ahi!a\"/hi!/\"a/\\'44/hi!/44\\'/a\"/hi!/\"ahi!a\"/hi!/\"a/\\'//4/'" + "'", str2, "'/4//\\'/a\"/hi!/\"ahi!a\"/hi!/\"a/\\'44/hi!/44\\'/a\"/hi!/\"ahi!a\"/hi!/\"a/\\'//4/'");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"#\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"//\\\"/hi!/\\\"//\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"44/hi!/44//\\\"/hi!/\\\"//\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"//\\\"/hi!/\\\"//\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"44/hi!/44//\\\"/hi!/\\\"//\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"#\"" + "'", str1, "\"#\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"//\\\"/hi!/\\\"//\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"44/hi!/44//\\\"/hi!/\\\"//\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"#\"");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node18, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        java.lang.Class<?> wildcardClass22 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node27, false, context29);
        codeGenerator2.addList(node16, true, context29);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'4#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#4'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'4#\\\"4a////a4\\\"//\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"//\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"//\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"//\\\"4a////a4\\\"#4'\"" + "'", str1, "\"'4#\\\"4a////a4\\\"//\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"//\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"//\\\"/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\"//\\\"4a////a4\\\"#4'\"");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4////\"hi!\"//\"hi!\"////4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4////\"hi!\"//\"hi!\"////4" + "'", str1, "4////\"hi!\"//\"hi!\"////4");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/44/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/44/\"" + "'", str2, "\"/44/\"");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = null;
        codeGenerator15.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator15.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = null;
        codeGenerator26.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator26.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator26.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = null;
        codeGenerator42.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator53.addList(node54, false, context56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator53.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator53.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator53.addList(node62, true, context64);
        codeGenerator42.addList(node49, true, context64);
        codeGenerator26.addList(node38, false, context64);
        codeGenerator15.addList(node22, true, context64);
        codeGenerator2.addList(node11, false, context64);
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/44/hi!/44/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/44/hi!/44/\"/" + "'", str1, "/\"/44/hi!/44/\"/");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator13.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node22, true, context24);
        codeGenerator2.addList(node9, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addArrayList(node29);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator19.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node30, false, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator19.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator19.addList(node37, false, context39);
        codeGenerator2.addList(node15, false, context39);
        java.lang.Class<?> wildcardClass42 = context39.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//4a////a4//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//4a////a4//\"" + "'", str1, "\"//4a////a4//\"");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node33, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\"/\\\\\"hi!\\\\\"/\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\"/\\\\\"hi!\\\\\"/\"/'" + "'", str1, "'/\"/\\\\\"hi!\\\\\"/\"/'");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = null;
        codeGenerator2.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"/4/hi!/4/\"", 'a', "////hi!////", " ahi!a ", "/// hi! ///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a////hi!/////4/hi!/4/////hi!////a" + "'", str6, "a////hi!/////4/hi!/4/////hi!////a");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#ahi!a#", '#', "/\"\\\"////\\\"\"/", "#\"\\\"a//a/hi!/aa/hi!/a//a\\\"\"//\"/hi!/\"//\"\\\"a//a/hi!/aa/hi!/a//a\\\"\"44/hi!/44//\"/hi!/\"//\"\\\"a//a/hi!/aa/hi!/a//a\\\"\"\"\\\"a//a/hi!/aa/hi!/a//a\\\"\"#", "# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##ahi!a##" + "'", str6, "##ahi!a##");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/ /a///4/hi!/4///a/ /\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/ /a///4/hi!/4///a/ /\"/" + "'", str1, "/\"/ /a///4/hi!/4///a/ /\"/");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"//" + "'", str2, "//\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"//");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"a////4/hi!/4/////hi!/////4/hi!/4////a\"", 'a', "\"a//a/hi!/aa/hi!/a//a\"", "/\"/\\\"ahi!a\\\"/\"/", "\"\\\"\\\\\\\"////4/hi!/4////\\\\\\\"\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"a//a/hi!/aa/hi!/a//a\"a////4/hi!/4/////hi!/////4/hi!/4////a\"a//a/hi!/aa/hi!/a//a\"a" + "'", str6, "a\"a//a/hi!/aa/hi!/a//a\"a////4/hi!/4/////hi!/////4/hi!/4////a\"a//a/hi!/aa/hi!/a//a\"a");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"a//\\\" ahi!a \\\"#/a/hi!/ahi!a/hi!/a/#\\\" ahi!a \\\"//a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator10.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator10.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator24.addList(node25, true, context27);
        codeGenerator10.addList(node20, false, context27);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator20.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator36.addList(node37, false, context39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = null;
        codeGenerator45.addList(node46, true, context48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator45.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator45.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator45.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node56, false, context58);
        codeGenerator36.addList(node41, false, context58);
        codeGenerator20.addList(node32, false, context58);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator20.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        java.nio.charset.Charset charset67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66, charset67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator68.addList(node69, true, context71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator68.addAllSiblings(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator68.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        java.nio.charset.Charset charset80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79, charset80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator81.addList(node82, true, context84);
        codeGenerator68.addList(node77, true, context84);
        codeGenerator20.addList(node64, false, context84);
        codeGenerator2.addList(node16, true, context84);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator2.addAllSiblings(node89);
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"4/a/hi!/a/4\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"4/a/hi!/a/4\"//" + "'", str2, "//\"4/a/hi!/a/4\"//");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#4///44/hi!/44///4#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#4///44/hi!/44///4#\"" + "'", str1, "\"#4///44/hi!/44///4#\"");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\\\"hi!\\\"'/// hi! /ahi!a//'\\\"hi!\\\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///\\'\\\\\"hi!\\\\\"\\'/// hi! /ahi!a//\\'\\\\\"hi!\\\\\"\\'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\"'" + "'", str2, "'\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///\\'\\\\\"hi!\\\\\"\\'/// hi! /ahi!a//\\'\\\\\"hi!\\\\\"\\'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\"'");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"\\\"/a/\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"//\\\\\\\"ahi!a\\\\\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"/hi!\\\\\\\"ahi!a\\\\\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"///\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"/a/\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"\\\\\"/a/\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\"/\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"/hi!\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\"/\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"///\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"/a/\\\\\"\"/'" + "'", str2, "'/\"\\\\\"/a/\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\"/\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"/hi!\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\"/\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"///\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"/a/\\\\\"\"/'");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//4ahi!a4//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"//4ahi!a4//\"//" + "'", str1, "//\"//4ahi!a4//\"//");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator13.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node22, true, context24);
        codeGenerator2.addList(node9, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27, false);
        java.lang.Class<?> wildcardClass30 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//4ahi!a4//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//4ahi!a4//\\\"\"" + "'", str1, "\"\\\"//4ahi!a4//\\\"\"");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"a/a/hi!/a////4/hi!/4////a/hi!/a/a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"a/a/hi!/a////4/hi!/4////a/hi!/a/a\"/" + "'", str1, "/\"a/a/hi!/a////4/hi!/4////a/hi!/a/a\"/");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, false, context21);
        codeGenerator2.addList(node14, true, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a hi! 4ahi!a4 hi! a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a hi! 4ahi!a4 hi! a/" + "'", str1, "/a hi! 4ahi!a4 hi! a/");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator13.addList(node18, false, context25);
        codeGenerator2.addList(node9, false, context25);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator44.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator44.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator44.addList(node58, false);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator65.addList(node66, false, context68);
        codeGenerator44.addList(node61, false, context68);
        codeGenerator32.addList(node40, false, context68);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node29, context68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = null;
        codeGenerator2.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator2.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator2.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addList(node63, true);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator17.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator35.addList(node38, true, context40);
        codeGenerator17.addList(node31, true, context40);
        codeGenerator2.addList(node13, true, context40);
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"//'\\\"hi!\\\"'//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#\"", 'a', "/a\"/hi!/\"ahi!a\"/hi!/\"a/", "a/\"a//a/hi!/aa/hi!/a//a\"//a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"ahi!a\"//'\\\"hi!\\\"'//\"/hi!/\"//'\\\"hi!\\\"'//\"a//\"a//a/hi!/aa/hi!/a//a\"/a", "a4a//a/hi!/aa/hi!/a//a4a", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/a\"/hi!/\"ahi!a\"/hi!/\"a/#a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/4a////a4a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a///a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a//a4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/hi!a4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a//a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a///a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a//a4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/hi!a4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a//a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a///a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/4a////a4a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/#/a\"/hi!/\"ahi!a\"/hi!/\"a/a" + "'", str6, "a/a\"/hi!/\"ahi!a\"/hi!/\"a/#a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/4a////a4a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a///a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a//a4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/hi!a4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a//a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a///a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a//a4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/hi!a4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4aa4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a//a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a///a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/4a////a4a4a//a/hi!/aa/hi!/a//a4a/a\"/hi!/\"ahi!a\"/hi!/\"a/#/a\"/hi!/\"ahi!a\"/hi!/\"a/a");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/hi!/#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#/hi!/#/" + "'", str2, "/#/hi!/#/");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//a\"/hi!/\"ahi!a\"/hi!/\"a//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//a\"/hi!/\"ahi!a\"/hi!/\"a//" + "'", str1, "//a\"/hi!/\"ahi!a\"/hi!/\"a//");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"a//a/hi!/aa/hi!/a//a\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\"a//a/hi!/aa/hi!/a//a\"/'/" + "'", str2, "/'/\"a//a/hi!/aa/hi!/a//a\"/'/");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, false, context19);
        codeGenerator2.addList(node12, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node26, (int) (short) 10, context28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'4//\"44/hi!/44\"////////\"44/hi!/44\"//4'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'4//\"44/hi!/44\"////////\"44/hi!/44\"//4'/" + "'", str2, "/'4//\"44/hi!/44\"////////\"44/hi!/44\"//4'/");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"/44/\"", '#', "\"44/hi!/44\"", "//", "'#//\"hi!\"//a/4a////a4/a//\"hi!\"///4a////a4/a/4a////a4/a//\"hi!\"////\"hi!\"//#'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"44/hi!/44\"/44/\"44/hi!/44\"#" + "'", str6, "#\"44/hi!/44\"/44/\"44/hi!/44\"#");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"a//a/hi!/aa/hi!/a//a\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"a//a/hi!/aa/hi!/a//a\\\"/\"" + "'", str1, "\"/\\\"a//a/hi!/aa/hi!/a//a\\\"/\"");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" //#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" // \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" #/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" //#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" // \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" #/" + "'", str1, "/# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" //#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" // \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" #/");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#//\"hi!\"//a/4a////a4/a//\"hi!\"///4a////a4/a/4a////a4/a//\"hi!\"////\"hi!\"//#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#//\"hi!\"//a/4a////a4/a//\"hi!\"///4a////a4/a/4a////a4/a//\"hi!\"////\"hi!\"//#/" + "'", str1, "/#//\"hi!\"//a/4a////a4/a//\"hi!\"///4a////a4/a/4a////a4/a//\"hi!\"////\"hi!\"//#/");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"/a///4/hi!/4///a/\"", '#', "a/hi!/a", "/\"'//\\\"\\\"//'\"/", "'\"\\'/\\\\\"\\\\\"/\\'\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#a/hi!/a/a///4/hi!/4///a/a/hi!/a#" + "'", str6, "#a/hi!/a/a///4/hi!/4///a/a/hi!/a#");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) (short) 10, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa\"", 'a', "\"///////4/hi!/4///////\"", "/a////4/hi!/4/////hi!/////4/hi!/4////a/", "/'\"hi!\"'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"///////4/hi!/4///////\"aa////4/hi!/4/////hi!/////4/hi!/4////a/a//'\"hi!\"'/\"///////4/hi!/4///////\"hi!/'\"hi!\"'/\"///////4/hi!/4///////\"//hi!///'\"hi!\"'/\"///////4/hi!/4///////\"hi!/'\"hi!\"'/\"///////4/hi!/4///////\"/ahi!a//'\"hi!\"'/\"///////4/hi!/4///////\"hi!/'\"hi!\"'/\"///////4/hi!/4///////\"//hi!///'\"hi!\"'/\"///////4/hi!/4///////\"hi!/'\"hi!\"'/\"///////4/hi!/4///////\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa\"///////4/hi!/4///////\"a" + "'", str6, "a\"///////4/hi!/4///////\"aa////4/hi!/4/////hi!/////4/hi!/4////a/a//'\"hi!\"'/\"///////4/hi!/4///////\"hi!/'\"hi!\"'/\"///////4/hi!/4///////\"//hi!///'\"hi!\"'/\"///////4/hi!/4///////\"hi!/'\"hi!\"'/\"///////4/hi!/4///////\"/ahi!a//'\"hi!\"'/\"///////4/hi!/4///////\"hi!/'\"hi!\"'/\"///////4/hi!/4///////\"//hi!///'\"hi!\"'/\"///////4/hi!/4///////\"hi!/'\"hi!\"'/\"///////4/hi!/4///////\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa\"///////4/hi!/4///////\"a");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\"" + "'", str1, "\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\"");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\" ahi!a \\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\" ahi!a \\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\" ahi!a \\\\\\\"/\\\"\"");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = null;
        codeGenerator2.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator2.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator2.addArrayList(node60);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'a\"\\'\\\\\"hi!\\\\\"\\'\"/\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"///4/hi!/4///\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"\"/\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\"/\"\"\\'\\\\\"hi!\\\\\"\\'\"/\"\\'\\\\\"hi!\\\\\"\\'\"a'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'a\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"/\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"///4/hi!/4///\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"/\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"a'\"" + "'", str1, "\"'a\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"/\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"///4/hi!/4///\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"\\\"/\\\\\\\\\\\"#/a/hi!/ahi!a/hi!/a/#\\\\\\\\\\\"/\\\"\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"/\\\"\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'\\\"a'\"");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator29.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator29.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator43.addList(node44, true, context46);
        codeGenerator29.addList(node39, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node63, false, context65);
        codeGenerator53.addList(node58, false, context65);
        codeGenerator29.addList(node49, false, context65);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addArrayList(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator73.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator73.addAllSiblings(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator73.addList(node80, true, context82);
        codeGenerator29.addList(node69, true, context82);
        codeGenerator2.addList(node25, true, context82);
        java.lang.Class<?> wildcardClass86 = context82.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a hi! 4ahi!a4 hi! a", '#', "/a/a//\"4////4\"ahi!a\"4////4\"//aahi!aa//\"4////4\"ahi!a\"4////4\"//a/a/", "\"/\\\"#/a/hi!/ahi!a/hi!/a/#\\\"/\"", "a4a//a/hi!/aa/hi!/a//a4a", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#a hi! 4ahi!a4 hi! a#" + "'", str6, "#a hi! 4ahi!a4 hi! a#");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = null;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator18.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator18.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator18.addList(node31, false, context33);
        codeGenerator2.addList(node14, true, context33);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node36, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#a/hi!/a/a///4/hi!/4///a/a/hi!/a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#a/hi!/a/a///4/hi!/4///a/a/hi!/a#\"" + "'", str1, "\"#a/hi!/a/a///4/hi!/4///a/a/hi!/a#\"");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'4#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#4'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'4#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#4'" + "'", str1, "'4#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"#4'");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///////4/hi!/4///////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////////4/hi!/4////////" + "'", str1, "////////4/hi!/4////////");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator18.addList(node25, true, context27);
        codeGenerator2.addList(node14, true, context27);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addArrayList(node34);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"'" + "'", str2, "'\"/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa/\"'");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node24, false, context26);
        codeGenerator2.addList(node13, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, true, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator38.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator51.addList(node52, true, context54);
        codeGenerator38.addList(node47, true, context54);
        codeGenerator2.addList(node34, true, context54);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'a//a/hi!/aa/hi!/a//a'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4\\'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa\\'a//a/hi!/aa/hi!/a//a\\'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa\\'4'" + "'", str2, "'4\\'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa\\'a//a/hi!/aa/hi!/a//a\\'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa\\'4'");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator21.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = null;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator39.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator21.addList(node35, false, context52);
        codeGenerator2.addList(node17, true, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"#/a/hi!/ahi!a/hi!/a/#\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"//'\\\"hi!\\\"'//\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"//'\\\"hi!\\\"'//\"///" + "'", str2, "///\"//'\\\"hi!\\\"'//\"///");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator49.addList(node50, false, context52);
        codeGenerator40.addList(node45, false, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node37, context52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"a\\\"/hi!/\\\"ahi!a\\\"/hi!/\\\"a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"a\\\\\\\"/hi!/\\\\\\\"ahi!a\\\\\\\"/hi!/\\\\\\\"a\\\"\"" + "'", str1, "\"\\\"a\\\\\\\"/hi!/\\\\\\\"ahi!a\\\\\\\"/hi!/\\\\\\\"a\\\"\"");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//'/\"/\\\\\"hi!\\\\\"/\"/'//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///'/\"/\\\\\"hi!\\\\\"/\"/'///" + "'", str1, "///'/\"/\\\\\"hi!\\\\\"/\"/'///");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node14, false, context16);
        codeGenerator2.addList(node9, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"////\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"////\\\"/\"/" + "'", str2, "/\"/\\\"////\\\"/\"/");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"////\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = null;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = null;
        codeGenerator32.addList(node33, true, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator32.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator16.addList(node28, true, context45);
        codeGenerator2.addList(node12, false, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addList(node51, true);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\" a/hi!/ahi!a/hi!/a \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" a/hi!/ahi!a/hi!/a \\\"\"" + "'", str1, "\"\\\" a/hi!/ahi!a/hi!/a \\\"\"");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"'\\\"//a////a//\\\"'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\'\\\\\"//a////a//\\\\\"\\'\"'" + "'", str2, "'\"\\'\\\\\"//a////a//\\\\\"\\'\"'");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator2.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator2.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node63, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#a hi! 4ahi!a4 hi! a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#a hi! 4ahi!a4 hi! a#\"" + "'", str1, "\"#a hi! 4ahi!a4 hi! a#\"");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"#a/hi!/a/a///4/hi!/4///a/a/hi!/a#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"#a/hi!/a/a///4/hi!/4///a/a/hi!/a#\"/" + "'", str1, "/\"#a/hi!/a/a///4/hi!/4///a/a/hi!/a#\"/");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/ /a///4/hi!/4///a/ /\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/ /a///4/hi!/4///a/ /\\\"\"" + "'", str1, "\"\\\"/ /a///4/hi!/4///a/ /\\\"\"");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/a//a/hi!/a//a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//a//a/hi!/a//a//" + "'", str1, "//a//a/hi!/a//a//");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" // 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 /# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #hi!# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #/ 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 // ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ // 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 /# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #hi!# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #/ 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 // /" + "'", str2, "/ // 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 /# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #hi!# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #/ 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 // /");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///\\'\\\\\"hi!\\\\\"\\'/// hi! /ahi!a//\\'\\\\\"hi!\\\\\"\\'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'\\\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'/// hi! /ahi!a//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\\\"'\"" + "'", str2, "\"'\\\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'/// hi! /ahi!a//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\\\"'\"");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator9.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator9.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node31, false, context33);
        codeGenerator9.addList(node26, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator9.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = null;
        codeGenerator42.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator42.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator42.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator42.addList(node53, false, context55);
        codeGenerator9.addList(node38, false, context55);
        codeGenerator2.addList(node5, false, context55);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"'\\\"hi!\\\"'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"'\\\\\\\"hi!\\\\\\\"'\\\"/\"" + "'", str1, "\"/\\\"'\\\\\\\"hi!\\\\\\\"'\\\"/\"");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node20, false, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//a///4/hi!/4///a//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a\"/hi!/\"ahi!a\"/hi!/\"a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"a////a\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"a////a\"//" + "'", str2, "//\"a////a\"//");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a////hi!/////4/hi!/4/////hi!////a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a////hi!/////4/hi!/4/////hi!////a\"" + "'", str1, "\"a////hi!/////4/hi!/4/////hi!////a\"");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"/4a////a4/\"", ' ', "", "/\"/\\\" ahi!a \\\"/\"/", "'\"\\'\\\\\"ahi!a\\\\\"\\'\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /4a////a4/ " + "'", str6, " /4a////a4/ ");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/ a/hi!/ahi!a/hi!/a /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/ a/hi!/ahi!a/hi!/a /\"" + "'", str1, "\"/ a/hi!/ahi!a/hi!/a /\"");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/\"#ahi!a#\"a//a/hi!/aa/hi!/a//a\"#ahi!a#\"/#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#/\"#ahi!a#\"a//a/hi!/aa/hi!/a//a\"#ahi!a#\"/#/" + "'", str2, "/#/\"#ahi!a#\"a//a/hi!/aa/hi!/a//a\"#ahi!a#\"/#/");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = null;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = null;
        codeGenerator32.addList(node33, true, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator32.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator16.addList(node28, true, context45);
        codeGenerator2.addList(node12, false, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node57, false, context59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65, charset66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator67.addList(node68, false, context70);
        codeGenerator56.addList(node63, false, context70);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node52, (int) (byte) 100, context70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a#/a/hi!/ahi!a/hi!/a/#a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#/a/hi!/ahi!a/hi!/a/#a" + "'", str1, "a#/a/hi!/ahi!a/hi!/a/#a");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = null;
        codeGenerator27.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator27.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator27.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node38, false, context40);
        codeGenerator18.addList(node23, false, context40);
        codeGenerator2.addList(node14, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node51, true, context53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator50.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator50.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator63.addList(node64, true, context66);
        codeGenerator50.addList(node59, true, context66);
        codeGenerator2.addList(node46, false, context66);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator2.addList(node70);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'a/a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a/a/hi!/a/a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a/a'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'a/a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a/a/hi!/a/a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a/a'/" + "'", str2, "/'a/a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a/a/hi!/a/a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a/a'/");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\" ahi!a \\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\" ahi!a \\\"/\"//" + "'", str1, "//\"/\\\" ahi!a \\\"/\"//");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node36, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = null;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator18.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator18.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator18.addList(node31, false, context33);
        codeGenerator2.addList(node14, true, context33);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator40.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator51.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator51.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator51.addList(node58, false, context60);
        codeGenerator40.addList(node47, false, context60);
        codeGenerator2.addList(node36, true, context60);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator21.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = null;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator39.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator21.addList(node35, false, context52);
        codeGenerator2.addList(node17, true, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node58, (int) (byte) 0, context60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = null;
        codeGenerator23.addList(node24, true, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator23.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator23.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator23.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator23.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator23.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator43.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator43.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator43.addList(node50, false, context52);
        codeGenerator23.addList(node39, false, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node19, (int) '4', context52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator28.addList(node35, false, context42);
        codeGenerator2.addList(node24, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator49.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator49.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator49.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator49.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        java.nio.charset.Charset charset65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64, charset65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator66.addList(node67, false, context69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator66.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator66.addList(node73, false, context75);
        codeGenerator49.addList(node62, true, context75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node46, context75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        java.lang.Class<?> wildcardClass21 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node24, false, context26);
        codeGenerator2.addList(node13, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator35.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        java.nio.charset.Charset charset51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50, charset51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = null;
        codeGenerator52.addList(node53, true, context55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator61.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator61.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator61.addList(node68, false, context70);
        codeGenerator52.addList(node57, false, context70);
        codeGenerator35.addList(node48, true, context70);
        codeGenerator2.addList(node31, false, context70);
        com.google.javascript.rhino.Node node75 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\"hi!\"'/// hi! /ahi!a//'\"hi!\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\"hi!\"'/// hi! /ahi!a//'\"hi!\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4/" + "'", str1, "/4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///'\"hi!\"'/// hi! /ahi!a//'\"hi!\"'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4/");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node38, true, context40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node42, true, context44);
        codeGenerator2.addList(node33, false, context44);
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node47, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//'\"hi!\"'//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" //a/hi!/a// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ //a/hi!/a// /" + "'", str1, "/ //a/hi!/a// /");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"/44/hi!/44/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"/44/hi!/44/\\\\\"\"'" + "'", str2, "'\"\\\\\"/44/hi!/44/\\\\\"\"'");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node17, true, context19);
        codeGenerator2.addList(node12, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node21, true, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/a///4/hi!/4///a/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"/a/\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"//\\\\\\\"ahi!a\\\\\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"/hi!\\\\\\\"ahi!a\\\\\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"///\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"/a/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"/a/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/hi!\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/a/\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"/a/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/hi!\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/a/\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator38.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator38.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator38.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = null;
        codeGenerator55.addList(node56, true, context58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator55.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator55.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator55.addArrayList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator55.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node73, false, context75);
        codeGenerator38.addList(node51, false, context75);
        codeGenerator2.addList(node34, true, context75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a/a//\"4////4\"ahi!a\"4////4\"//aahi!aa//\"4////4\"ahi!a\"4////4\"//a/a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a/////4/hi!/4/////a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a/////4/hi!/4/////a" + "'", str1, "a/////4/hi!/4/////a");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", ' ', "//4a////a4//", "//'\"hi!\"'//", "/a//\"44/hi!/44\"// ////4/hi!/4//// //\"44/hi!/44\"//a////a ////4/hi!/4//// //\"44/hi!/44\"////\"44/hi!/44\"//a/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  " + "'", str6, "  ");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node27, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addAllSiblings(node33);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = null;
        codeGenerator2.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//a///4/hi!/4///a//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/ //a/hi!/a// /", ' ', "/a/a/hi!/a////4/hi!/4////a/hi!/a/a/", "\"4a////a4\"", "'a/a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a/a/hi!/a/a/\"/\\\\\"hi!\\\\\"/\"//\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"/hi!\"ahi!a\"/\"/\\\\\"hi!\\\\\"/\"///\"/\\\\\"hi!\\\\\"/\"/a/a'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " / //a/hi!/a// / " + "'", str6, " / //a/hi!/a// / ");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator34.addList(node35, true, context37);
        codeGenerator20.addList(node30, false, context37);
        codeGenerator2.addList(node16, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator45.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator45.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node60, false, context62);
        codeGenerator45.addList(node55, false, context62);
        codeGenerator2.addList(node41, true, context62);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        java.nio.charset.Charset charset69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68, charset69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator70.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        java.nio.charset.Charset charset80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79, charset80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator81.addList(node82, false, context84);
        codeGenerator70.addList(node77, false, context84);
        codeGenerator2.addList(node66, true, context84);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator2.addAllSiblings(node88);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"hi!\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"hi!\"//" + "'", str2, "//\"hi!\"//");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = null;
        codeGenerator14.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = null;
        codeGenerator23.addList(node24, true, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator23.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator23.addList(node30, false, context32);
        codeGenerator14.addList(node19, true, context32);
        codeGenerator2.addList(node10, true, context32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator39.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator54.addList(node55, false, context57);
        codeGenerator39.addList(node50, true, context57);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node36, context57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        java.lang.Class<?> wildcardClass21 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node32, false, context34);
        codeGenerator17.addList(node27, false, context34);
        codeGenerator2.addList(node13, false, context34);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = null;
        codeGenerator42.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator42.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator42.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator42.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator42.addList(node55, false, context57);
        codeGenerator2.addList(node38, false, context57);
        java.lang.Class<?> wildcardClass60 = context57.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        java.lang.Class<?> wildcardClass23 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'a#\"//a/hi!/a//\"\"//a/hi!/a//\"aa////aa\"//a/hi!/a//\"\"//a/hi!/a//\"#a'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'a#\"//a/hi!/a//\"\"//a/hi!/a//\"aa////aa\"//a/hi!/a//\"\"//a/hi!/a//\"#a'" + "'", str1, "'a#\"//a/hi!/a//\"\"//a/hi!/a//\"aa////aa\"//a/hi!/a//\"\"//a/hi!/a//\"#a'");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = null;
        codeGenerator2.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator2.addArrayList(node58);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node23, (int) (byte) -1, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//a/hi!/a//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///a/hi!/a///" + "'", str1, "///a/hi!/a///");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/4a////a4/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##a", '#', "///\"/hi!/\"///", "////4/hi!/4////", "#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#a##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/4a////a4/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##a#" + "'", str6, "#a##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/4a////a4/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##a#");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator9.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator9.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node31, false, context33);
        codeGenerator9.addList(node26, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator9.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = null;
        codeGenerator42.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator42.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator42.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator42.addList(node53, false, context55);
        codeGenerator9.addList(node38, false, context55);
        codeGenerator2.addList(node5, false, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\" a/hi!/ahi!a/hi!/a \"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'a//a/hi!/aa/hi!/a//a'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'a//a/hi!/aa/hi!/a//a'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'4/" + "'", str2, "/4'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'a//a/hi!/aa/hi!/a//a'aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\"hi!\"//hi!//\"hi!\"/ahi!a/\"hi!\"//hi!//\"hi!\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aa'4/");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = null;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = null;
        codeGenerator29.addList(node30, true, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator29.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator29.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = null;
        codeGenerator45.addList(node46, true, context48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator45.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node57, false, context59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator56.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator56.addList(node65, true, context67);
        codeGenerator45.addList(node52, true, context67);
        codeGenerator29.addList(node41, false, context67);
        codeGenerator18.addList(node25, true, context67);
        codeGenerator2.addList(node14, true, context67);
        java.lang.Class<?> wildcardClass73 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" //#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" // \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" #/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/# \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"# \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" 44/hi!/44#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"# \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" // \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" #/\"" + "'", str1, "\"/# \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"# \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" 44/hi!/44#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"# \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" // \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"hi! //4/hi!/4// \\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\"\\\"\\\\\\\"/44/hi!/44/\\\\\\\"\\\" #/\"");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/ahi!a/\\\"hi!\\\"//hi!//\\\"hi!\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\"'" + "'", str2, "'\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\"'");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator29.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator29.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator43.addList(node44, true, context46);
        codeGenerator29.addList(node39, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node63, false, context65);
        codeGenerator53.addList(node58, false, context65);
        codeGenerator29.addList(node49, false, context65);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addArrayList(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator73.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator73.addAllSiblings(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator73.addList(node80, true, context82);
        codeGenerator29.addList(node69, true, context82);
        codeGenerator2.addList(node25, true, context82);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator2.addAllSiblings(node86);
        com.google.javascript.rhino.Node node88 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node17, true, context19);
        codeGenerator2.addList(node12, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, false, context38);
        codeGenerator26.addList(node31, false, context38);
        codeGenerator2.addList(node22, false, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = null;
        codeGenerator48.addList(node49, true, context51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator48.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator48.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator48.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator48.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = null;
        codeGenerator65.addList(node66, true, context68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node75, false, context77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator74.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator74.addList(node81, false, context83);
        codeGenerator65.addList(node70, false, context83);
        codeGenerator48.addList(node61, true, context83);
        codeGenerator2.addList(node44, true, context83);
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = null;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node24, false, context26);
        codeGenerator2.addList(node13, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\" a/hi!/ahi!a/hi!/a \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, false, context21);
        codeGenerator2.addList(node14, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        java.lang.Class<?> wildcardClass12 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator12.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator12.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator40.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator40.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator40.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator40.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node62, false, context64);
        codeGenerator40.addList(node57, false, context64);
        codeGenerator28.addList(node36, false, context64);
        codeGenerator12.addList(node24, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("////hi!////", ' ', "#\"44/hi!/44\"/44/\"44/hi!/44\"#", "\"/a/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/hi!\\\"ahi!a\\\"/\\\"/\\\\\\\"hi!\\\\\\\"/\\\"///\\\"/\\\\\\\"hi!\\\\\\\"/\\\"/a/\"", "\"a////a////a////a\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " ////hi!//// " + "'", str6, " ////hi!//// ");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\"a////a\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\"a////a\"//'" + "'", str2, "'//\"a////a\"//'");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        java.lang.Class<?> wildcardClass27 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"/hi!/\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\"/hi!/\"////" + "'", str2, "////\"/hi!/\"////");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"hi!\"", ' ', "/ // 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 /# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #hi!# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #/ 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 // /", "\"/44/hi!/44/\"", "'//\"a////a\"//'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " / // 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 /# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #hi!# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #/ 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 // /hi!/ // 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 /# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #hi!# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #/ 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 // / " + "'", str6, " / // 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 /# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #hi!# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #/ 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 // /hi!/ // 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 /# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #hi!# ////4/hi!/4//// a/a/hi!/a////4/hi!/4////a/hi!/a/a ////4/hi!/4//// #/ 44/hi!/44a/a/hi!/a////4/hi!/4////a/hi!/a/a44/hi!/44 // / ");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, false, context19);
        codeGenerator2.addList(node12, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator34.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, true, context51);
        codeGenerator34.addList(node44, false, context51);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator58.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65, charset66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator67.addList(node68, false, context70);
        codeGenerator58.addList(node63, false, context70);
        codeGenerator34.addList(node54, false, context70);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        java.nio.charset.Charset charset77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76, charset77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator78.addArrayList(node79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator78.addAllSiblings(node81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator78.addAllSiblings(node83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator78.addList(node85, true, context87);
        codeGenerator34.addList(node74, true, context87);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node30, 0, context87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/a////a/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" //#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"# \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" // \"\\\"/44/hi!/44/\\\"\" //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"hi! //4/hi!/4// \"\\\"/44/hi!/44/\\\"\"\"\\\"/44/hi!/44/\\\"\" #/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/# \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" //#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"# \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"# \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" // \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" #/'" + "'", str2, "'/# \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" //#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"# \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" 44/hi!/44#\"4a////a4\"//\"/\\\\\"hi!\\\\\"/\"//\"/\\\\\"hi!\\\\\"/\"//\"4a////a4\"# \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" // \"\\\\\"/44/hi!/44/\\\\\"\" //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"hi! //4/hi!/4// \"\\\\\"/44/hi!/44/\\\\\"\"\"\\\\\"/44/hi!/44/\\\\\"\" #/'");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"a/hi!/a\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"a/hi!/a\"//" + "'", str2, "//\"a/hi!/a\"//");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator26.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator26.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node43, false, context45);
        codeGenerator26.addList(node38, true, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator14.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator14.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, false, context38);
        codeGenerator14.addList(node31, false, context38);
        codeGenerator2.addList(node10, false, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addList(node42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator19.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node30, false, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator19.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator19.addList(node37, false, context39);
        codeGenerator2.addList(node15, false, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"\\\\\\\"/a/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/hi!\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/a/\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"/a/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/hi!\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/a/\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"/a/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/hi!\\\\\\\\\\\\\\\"ahi!a\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/a/\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/4a////a4/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/4a////a4/\"/" + "'", str1, "/\"/4a////a4/\"/");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//'\\\"ahi!a\\\"'//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//'\\\"ahi!a\\\"'//\"/" + "'", str1, "/\"//'\\\"ahi!a\\\"'//\"/");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"4// hi! ////a/a/hi!/a////4/hi!/4////a/hi!/a/a///\\'\\\\\"hi!\\\\\"\\'/// hi! /ahi!a//\\'\\\\\"hi!\\\\\"\\'/// hi! //a/a/hi!/a////4/hi!/4////a/hi!/a/a//// hi! //4\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node37, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("44/hi!/44", '#', "#/4///44/hi!/44///4//4ahi!a4//4///44/hi!/44///4/#", "'\"\\\\\"//\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'//\\\\\"\"'", "'#\"\"aa////aa\"\"#'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#44/hi!/44#" + "'", str6, "#44/hi!/44#");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/4/'\"aa////aa\"'///'/\"44/hi!/44\"/'/4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/'/\"44/hi!/44\"/'////4/hi!/4///4#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#44#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#//4/hi!/4//#\"4a////a4\"//\"/\\\"hi!\\\"/\"//\"/\\\"hi!\\\"/\"//\"4a////a4\"#4/'/\"44/hi!/44\"/'//'/\"44/hi!/44\"/'///'\"aa////aa\"'/4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/4/'\\\"aa////aa\\\"'///'/\\\"44/hi!/44\\\"/'/4#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#44#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#4/'/\\\"44/hi!/44\\\"/'////4/hi!/4///4#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#44#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#4/'/\\\"44/hi!/44\\\"/'//'/\\\"44/hi!/44\\\"/'///'\\\"aa////aa\\\"'/4/\"" + "'", str1, "\"/4/'\\\"aa////aa\\\"'///'/\\\"44/hi!/44\\\"/'/4#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#44#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#4/'/\\\"44/hi!/44\\\"/'////4/hi!/4///4#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#44#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#//4/hi!/4//#\\\"4a////a4\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"/\\\\\\\"hi!\\\\\\\"/\\\"//\\\"4a////a4\\\"#4/'/\\\"44/hi!/44\\\"/'//'/\\\"44/hi!/44\\\"/'///'\\\"aa////aa\\\"'/4/\"");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator2.addArrayList(node59);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/\\\"////\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/\\\\\"////\\\\\"/\"'" + "'", str2, "'\"/\\\\\"////\\\\\"/\"'");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/4a//a#a//a/hi!/aa/hi!/a//aa//a4a////a4a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//ahi!a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//ahi!a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a4a////a4a//a/hi!/aa/hi!/a//aa//a#a//a4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4a//a#a//a/hi!/aa/hi!/a//aa//a4a////a4a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//ahi!a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//ahi!a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a4a////a4a//a/hi!/aa/hi!/a//aa//a#a//a4/" + "'", str1, "/4a//a#a//a/hi!/aa/hi!/a//aa//a4a////a4a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//ahi!a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//ahi!a//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/hi!/aa/hi!/a//aa//a/a//a/hi!/aa/hi!/a//aa//a//a//a/hi!/aa/hi!/a//aa//a4a////a4a//a/hi!/aa/hi!/a//aa//a#a//a4/");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addList(node34, false);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, true, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addArrayList(node25);
        java.lang.Class<?> wildcardClass27 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator14.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator14.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, false, context38);
        codeGenerator14.addList(node31, false, context38);
        codeGenerator2.addList(node10, false, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addList(node44, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/#ahi!a#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"///////4/hi!/4///////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"///////4/hi!/4///////\"//" + "'", str1, "//\"///////4/hi!/4///////\"//");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"#4///44/hi!/44///4#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"'\\\"//a////a//\\\"'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"'\\\\\\\"//a////a//\\\\\\\"'\\\"/\"" + "'", str1, "\"/\\\"'\\\\\\\"//a////a//\\\\\\\"'\\\"/\"");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        java.lang.Class<?> wildcardClass7 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"//'\\\\\\\"hi!\\\\\\\"'//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//'\\\\\\\"hi!\\\\\\\"'//\\\"/\"" + "'", str1, "\"/\\\"//'\\\\\\\"hi!\\\\\\\"'//\\\"/\"");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"#/a/hi!/ahi!a/hi!/a/#\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"#/a/hi!/ahi!a/hi!/a/#\"'" + "'", str2, "'\"#/a/hi!/ahi!a/hi!/a/#\"'");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/ hi! /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "// hi! //" + "'", str2, "// hi! //");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator17.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator17.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator17.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node32, false, context34);
        codeGenerator2.addList(node13, true, context34);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = null;
        codeGenerator40.addList(node41, true, context43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator40.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator51.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator51.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator51.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65, charset66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator67.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        java.nio.charset.Charset charset75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer74, charset75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = null;
        codeGenerator76.addList(node77, true, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator76.addArrayList(node81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator76.addArrayList(node83);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator76.addArrayList(node85);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator76.addList(node87, false, context89);
        codeGenerator67.addList(node72, false, context89);
        codeGenerator51.addList(node63, false, context89);
        codeGenerator40.addList(node47, true, context89);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node37, context89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/a////a/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/a////a/\"/" + "'", str1, "/\"/a////a/\"/");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator14.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator14.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, false, context38);
        codeGenerator14.addList(node31, false, context38);
        codeGenerator2.addList(node10, false, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addList(node44, false);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, false, context19);
        codeGenerator2.addList(node12, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator32.addList(node39, true, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator32.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator32.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator32.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = null;
        codeGenerator54.addList(node55, true, context57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator54.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator54.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65, charset66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator67.addAllSiblings(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator67.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator67.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator67.addList(node76, false, context78);
        codeGenerator54.addList(node63, true, context78);
        codeGenerator32.addList(node50, true, context78);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node28, 100, context78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"hi!\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '#', "'/\"\\\\\"///4/hi!/4///\\\\\"\"/'", "\"//'a/\\\"a//a/hi!/aa/hi!/a//a\\\"//a\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"/hi!/\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"ahi!a\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"/hi!/\\\"//\\\\'\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\\'//\\\"a//\\\"a//a/hi!/aa/hi!/a//a\\\"/a'//\"", "\"/\\\"\\\\\\\"///4/hi!/4///\\\\\\\"\\\"/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##" + "'", str6, "##");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = null;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = null;
        codeGenerator32.addList(node33, true, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator32.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator16.addList(node28, true, context45);
        codeGenerator2.addList(node12, false, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"a//a/hi!/aa/hi!/a//a\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"a//a/hi!/aa/hi!/a//a\\\\\\\"\\\"\"");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node26, false, context28);
        codeGenerator2.addList(node15, false, context28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = null;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\\'/a\"/hi!/\"ahi!a\"/hi!/\"a/\\''", 'a', "/\"'\\\"hi!\\\"'\"/", "\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"", "\"///hi!///\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"\"///hi!///\"\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"/a/\"'\\\"hi!\\\"'\"//hi!//\"'\\\"hi!\\\"'\"/ahi!a/\"'\\\"hi!\\\"'\"//hi!//\"'\\\"hi!\\\"'\"/a/\"///hi!///\"\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"a" + "'", str6, "a\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"\"///hi!///\"\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"/a/\"'\\\"hi!\\\"'\"//hi!//\"'\\\"hi!\\\"'\"/ahi!a/\"'\\\"hi!\\\"'\"//hi!//\"'\\\"hi!\\\"'\"/a/\"///hi!///\"\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"\"'\\\"/\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"///4/hi!/4///\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'\"a");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = null;
        codeGenerator24.addList(node25, true, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator24.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator35.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = null;
        codeGenerator51.addList(node52, true, context54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator51.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node63, false, context65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator62.addList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator62.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator62.addList(node71, true, context73);
        codeGenerator51.addList(node58, true, context73);
        codeGenerator35.addList(node47, false, context73);
        codeGenerator24.addList(node31, true, context73);
        codeGenerator2.addList(node20, false, context73);
        java.lang.Class<?> wildcardClass79 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"\\\\\\\"///4/hi!/4///\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"///4/hi!/4///\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"///4/hi!/4///\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/ahi!a/\\\\\"hi!\\\\\"//hi!//\\\\\"hi!\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\\\"'\"" + "'", str1, "\"'\\\"#4a//a/hi!/aa/hi!/a//a4/ahi!a/aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!ahi!aa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaaa////4/hi!/4/////hi!/////4/hi!/4////a/a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"hi!\\\\\\\\\\\"//hi!//\\\\\\\\\\\"hi!\\\\\\\\\\\"/a/a////4/hi!/4/////hi!/////4/hi!/4////aaahi!a/ahi!a/4a//a/hi!/aa/hi!/a//a4#\\\"'\"");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator19.addList(node31, true, context48);
        codeGenerator2.addList(node15, false, context48);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = null;
        codeGenerator2.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator2.addList(node58, true);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("///a\"/hi!/\"ahi!a\"/hi!/\"a///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'///a\"/hi!/\"ahi!a\"/hi!/\"a///'" + "'", str2, "'///a\"/hi!/\"ahi!a\"/hi!/\"a///'");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("#4#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#//4/hi!/4//#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#4#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'#4#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#//4/hi!/4//#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#4#'" + "'", str2, "'#4#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#//4/hi!/4//#\"////\"4a////a4\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"/a//a\"////\"hi!a//a\"////\"/\"////\"//\"////\"4a////a4\"////\"#4#'");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node26, false, context28);
        codeGenerator2.addList(node15, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = null;
        codeGenerator50.addList(node51, true, context53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator50.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator50.addList(node57, false);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        java.nio.charset.Charset charset63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62, charset63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = null;
        codeGenerator64.addList(node65, true, context67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator64.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator64.addList(node71, false);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator64.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer78 = null;
        java.nio.charset.Charset charset79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer78, charset79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = null;
        codeGenerator80.addList(node81, true, context83);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator80.addArrayList(node85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator80.addArrayList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator80.addArrayList(node89);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator80.addList(node91, false, context93);
        codeGenerator64.addList(node76, true, context93);
        codeGenerator50.addList(node60, false, context93);
        codeGenerator35.addList(node46, true, context93);
        codeGenerator2.addList(node31, false, context93);
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//a///4/hi!/4///a//", '4', "\"/ /a///4/hi!/4///a/ /\"", "'///a\"/hi!/\"ahi!a\"/hi!/\"a///'", "'/\"////4/hi!/4////\"/'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4//a///4/hi!/4///a//4" + "'", str6, "4//a///4/hi!/4///a//4");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"#a/4/hi!/4/a#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#a/4/hi!/4/a#\"" + "'", str1, "\"#a/4/hi!/4/a#\"");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = null;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator18.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = null;
        codeGenerator33.addList(node34, true, context36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator33.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = null;
        codeGenerator47.addList(node48, true, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator47.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator47.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator47.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = null;
        codeGenerator63.addList(node64, true, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator63.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator63.addArrayList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator63.addArrayList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator63.addList(node74, false, context76);
        codeGenerator47.addList(node59, true, context76);
        codeGenerator33.addList(node43, false, context76);
        codeGenerator18.addList(node29, true, context76);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15, context76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator40.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node54, false, context56);
        codeGenerator40.addList(node49, false, context56);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node36, 100, context56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("44/hi!/44", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/44/hi!/44/" + "'", str2, "/44/hi!/44/");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node23, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = null;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node46, false, context48);
        codeGenerator2.addList(node31, false, context48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//a//a//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator2.addList(node19, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator38.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator38.addList(node47, true, context49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node51, true, context53);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node34, 1, context53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"#a hi! 4ahi!a4 hi! a#\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"#a hi! 4ahi!a4 hi! a#\"/" + "'", str2, "/\"#a hi! 4ahi!a4 hi! a#\"/");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node5, true, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4'\"///4/a/hi!/a/4///\"'//#a////a////a////a#'\"///4/a/hi!/a/4///\"'hi!#a////a////a////a#'\"///4/a/hi!/a/4///\"'//'\"///4/a/hi!/a/4///\"'4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4'\"///4/a/hi!/a/4///\"'//#a////a////a////a#'\"///4/a/hi!/a/4///\"'hi!#a////a////a////a#'\"///4/a/hi!/a/4///\"'//'\"///4/a/hi!/a/4///\"'4" + "'", str1, "4'\"///4/a/hi!/a/4///\"'//#a////a////a////a#'\"///4/a/hi!/a/4///\"'hi!#a////a////a////a#'\"///4/a/hi!/a/4///\"'//'\"///4/a/hi!/a/4///\"'4");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        java.lang.Class<?> wildcardClass20 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node3, false, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node17, true, context19);
        codeGenerator2.addList(node12, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, false, context38);
        codeGenerator26.addList(node31, false, context38);
        codeGenerator2.addList(node22, false, context38);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node42, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = null;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator21.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = null;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator39.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator21.addList(node35, false, context52);
        codeGenerator2.addList(node17, true, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator2.addArrayList(node58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("#a##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##/4a////a4/##/a/hi!/ahi!a/hi!/a/#/44/hi!/44/#/a/hi!/ahi!a/hi!/a/##a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = null;
        codeGenerator20.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator2.addList(node16, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator2.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node40, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }
}

