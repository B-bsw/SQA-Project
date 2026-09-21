package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node15, true, context17);
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("\"////hi!////\"", charsetEncoder20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator25.addAllSiblings(node33);
        java.lang.String str36 = codeGenerator25.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator25.addList(node37, false);
        java.lang.String str41 = codeGenerator25.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator45.addList(node51, true, context53);
        java.lang.String str56 = codeGenerator45.regexpEscape("hi!");
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator60.addList(node66, true, context68);
        codeGenerator45.addList(node57, false, context68);
        codeGenerator25.addList(node42, true, context68);
        codeGenerator1.addList(node22, true, context68);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator1.addArrayList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator1.addAllSiblings(node75);
        java.lang.String str78 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"////hi!////\"/" + "'", str21, "/\"////hi!////\"/");
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"" + "'", str36, "\"\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str41, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator45);
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "/hi!/" + "'", str56, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator60);
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str78, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        java.lang.String str17 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addAllSiblings(node25);
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        java.lang.String str29 = codeGenerator1.regexpEscape("", charsetEncoder28);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///hi!///" + "'", str13, "///hi!///");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/hi!/" + "'", str17, "/hi!/");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "//" + "'", str29, "//");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/hi!/", charsetEncoder14);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator1.addList(node18, false, context20);
        java.lang.String str23 = codeGenerator1.regexpEscape("");
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"//////\\\\\\\"/\\\"\"", charsetEncoder25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//\\\"//////\\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//hi!//" + "'", str15, "//hi!//");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"\\\"//\"" + "'", str17, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//" + "'", str23, "//");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"\\\"/\\\\\\\"//////\\\\\\\"/\\\"\"/" + "'", str26, "/\"\\\"/\\\\\\\"//////\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("///\"///hi!///\"///");
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"///\\\"///hi!///\\\"///\"" + "'", str9, "\"///\\\"///hi!///\\\"///\"");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"////\"" + "'", str10, "\"////\"");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addAllSiblings(node25);
        java.lang.String str28 = codeGenerator17.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator17.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator17.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node34, true, context36);
        codeGenerator1.addList(node14, false, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"//////\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "////" + "'", str13, "////");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"" + "'", str28, "\"\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("\"///hi!///\"", charsetEncoder15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"///hi!///\"/" + "'", str16, "/\"///hi!///\"/");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "////" + "'", str13, "////");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/" + "'", str21, "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"\\\"//\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"\\\"//\\\"\"/" + "'", str20, "/\"\\\"//\\\"\"/");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        java.lang.String str17 = codeGenerator1.regexpEscape("/\"//////\"/");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addArrayList(node29);
        java.lang.String str32 = codeGenerator23.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator23.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = null;
        codeGenerator23.addList(node35, true, context37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node48, true, context50);
        java.lang.String str53 = codeGenerator42.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str55 = codeGenerator42.escapeToDoubleQuotedJsString("\"/\\\"//\\\"/\"");
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.lang.String str58 = codeGenerator42.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"", charsetEncoder57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addList(node65, true);
        java.lang.String str69 = codeGenerator62.regexpEscape("");
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator62.addArrayList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator62.addList(node72, false);
        java.nio.charset.CharsetEncoder charsetEncoder76 = null;
        java.lang.String str77 = codeGenerator62.regexpEscape("", charsetEncoder76);
        java.lang.String str79 = codeGenerator62.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator62.addList(node80, false, context82);
        codeGenerator42.addList(node59, false, context82);
        codeGenerator23.addList(node39, false, context82);
        codeGenerator1.addList(node20, true, context82);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"//\"//" + "'", str13, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str15, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//\"//////\"//" + "'", str17, "//\"//////\"//");
        org.junit.Assert.assertNotNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "//\"//\"//" + "'", str32, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator42);
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str53, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str55, "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str58, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator62);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "//" + "'", str69, "//");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "//" + "'", str77, "//");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\"hi!\"" + "'", str79, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        java.lang.String str19 = codeGenerator1.regexpEscape("/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "//\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"//" + "'", str19, "//\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"//");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("//hi!//");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///hi!///" + "'", str10, "///hi!///");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"", charsetEncoder17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//////\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"/" + "'", str18, "/\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/\\\"//////\\\"/\"" + "'", str20, "\"/\\\"//////\\\"/\"");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator18.regexpEscape("hi!");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator18.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator18.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator18.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator18.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node44, false, context46);
        codeGenerator1.addList(node15, false, context46);
        java.lang.String str50 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//////\"//");
        java.lang.String str52 = codeGenerator1.regexpEscape("/\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"/");
        java.lang.String str54 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/hi!/" + "'", str29, "/hi!/");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/\"//\"/" + "'", str37, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "////\"//\"////" + "'", str41, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"//\\\"//////\\\"//\"" + "'", str50, "\"//\\\"//////\\\"//\"");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "//\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"//" + "'", str52, "//\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"" + "'", str54, "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("");
        java.lang.String str22 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str24 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator1.addList(node30, true);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//" + "'", str20, "//");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"hi!\"" + "'", str22, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str24, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"///////hi!///////\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//////");
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("/\"//\\\"//hi!//\\\"//\"/", charsetEncoder13);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"//\"//" + "'", str7, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//////\"" + "'", str11, "\"//////\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "//\"//\\\"//hi!//\\\"//\"//" + "'", str14, "//\"//\\\"//hi!//\\\"//\"//");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node27, true, context29);
        codeGenerator1.addList(node14, true, context29);
        java.lang.String str33 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36, false);
        java.lang.String str40 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"hi!\\\"\"/");
        java.nio.charset.CharsetEncoder charsetEncoder42 = null;
        java.lang.String str43 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder42);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str33, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"" + "'", str40, "\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "///\"//\"///" + "'", str43, "///\"//\"///");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.regexpEscape("//////");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "////////" + "'", str14, "////////");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str17, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"/" + "'", str18, "/\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"/");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"/\\\"\\\\\\\"\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder12);
        java.lang.Class<?> wildcardClass14 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"//\"//" + "'", str13, "//\"//\"//");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str22 = codeGenerator1.regexpEscape("///hi!///");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator29.addList(node35, true, context37);
        java.lang.String str40 = codeGenerator29.regexpEscape("hi!");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator29.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator29.addList(node43, true, context45);
        java.lang.String str48 = codeGenerator29.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator29.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator54.addList(node60, true, context62);
        java.lang.String str65 = codeGenerator54.regexpEscape("hi!");
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator54.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator54.addList(node68, true, context70);
        codeGenerator29.addList(node51, false, context70);
        codeGenerator1.addList(node26, true, context70);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator1.addList(node74, false);
        java.lang.String str78 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/hi!/\"" + "'", str20, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "////hi!////" + "'", str22, "////hi!////");
        org.junit.Assert.assertNotNull(codeGenerator29);
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/hi!/" + "'", str40, "/hi!/");
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "/\"//\"/" + "'", str48, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator54);
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "/hi!/" + "'", str65, "/hi!/");
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"\"" + "'", str78, "\"\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"\"");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node25, true, context27);
        java.lang.String str30 = codeGenerator19.regexpEscape("hi!");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator19.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator19.addAllSiblings(node33);
        java.nio.charset.CharsetEncoder charsetEncoder36 = null;
        java.lang.String str37 = codeGenerator19.regexpEscape("//\"\\\"hi!\\\"\"//", charsetEncoder36);
        java.lang.String str39 = codeGenerator19.escapeToDoubleQuotedJsString("//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//");
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator43.addList(node49, false, context51);
        codeGenerator19.addList(node40, true, context51);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\"/" + "'", str16, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/hi!/" + "'", str30, "/hi!/");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str37, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"" + "'", str39, "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator43);
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"////////\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, true);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"//\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"//\\\"\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        java.lang.Class<?> wildcardClass17 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"/\\\"\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        codeGenerator1.addList(node14, false, context27);
        java.lang.String str31 = codeGenerator1.regexpEscape("///\"\\\"hi!\\\"\"///");
        java.lang.String str33 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "////\"\\\"hi!\\\"\"////" + "'", str31, "////\"\\\"hi!\\\"\"////");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str33, "///\"\\\"hi!\\\"\"///");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"////////////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"////////////\"/" + "'", str1, "/\"////////////\"/");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("//\"/\\\"\\\"/\"//");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/////\"\\\"hi!\\\"\"/////", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///\"/\\\"\\\"/\"///" + "'", str10, "///\"/\\\"\\\"/\"///");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//////\"\\\"hi!\\\"\"//////" + "'", str13, "//////\"\\\"hi!\\\"\"//////");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str22 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/hi!/" + "'", str22, "/hi!/");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator17.addList(node23, true, context25);
        java.lang.String str28 = codeGenerator17.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str30 = codeGenerator17.escapeToDoubleQuotedJsString("\"/\\\"//\\\"/\"");
        java.nio.charset.CharsetEncoder charsetEncoder32 = null;
        java.lang.String str33 = codeGenerator17.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"", charsetEncoder32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, true);
        java.lang.String str44 = codeGenerator37.regexpEscape("");
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator37.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator37.addList(node47, false);
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.lang.String str52 = codeGenerator37.regexpEscape("", charsetEncoder51);
        java.lang.String str54 = codeGenerator37.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator37.addList(node55, false, context57);
        codeGenerator17.addList(node34, false, context57);
        codeGenerator1.addList(node14, true, context57);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator1.addAllSiblings(node61);
        java.lang.String str64 = codeGenerator1.regexpEscape("/\"///\\\"///hi!///\\\"///\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str28, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str30, "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str33, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "//" + "'", str44, "//");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "//" + "'", str52, "//");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"hi!\"" + "'", str54, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "//\"///\\\"///hi!///\\\"///\"//" + "'", str64, "//\"///\\\"///hi!///\\\"///\"//");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("");
        java.lang.String str22 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator27.addList(node37, true);
        java.lang.String str41 = codeGenerator27.escapeToDoubleQuotedJsString("\"//hi!//\"");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator45.addArrayList(node51);
        java.lang.String str54 = codeGenerator45.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator45.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node57, true, context59);
        codeGenerator27.addList(node42, true, context59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node25, context59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//" + "'", str20, "//");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"//\"" + "'", str22, "\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator27);
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\\\"//hi!//\\\"\"" + "'", str41, "\"\\\"//hi!//\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator45);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"/hi!/\"" + "'", str54, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.regexpEscape("//////");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "////////" + "'", str14, "////////");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.regexpEscape("");
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"", charsetEncoder20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator35.addArrayList(node41);
        java.lang.String str44 = codeGenerator35.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator35.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addList(node53, true);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator50.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator50.addList(node59, false);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator50.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator67.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator67.addArrayList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator67.addAllSiblings(node75);
        java.lang.String str78 = codeGenerator67.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator67.addList(node79, false);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator67.addList(node82, true, context84);
        codeGenerator50.addList(node64, false, context84);
        codeGenerator35.addList(node47, true, context84);
        codeGenerator25.addList(node32, true, context84);
        codeGenerator1.addList(node22, false, context84);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//" + "'", str18, "//");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/" + "'", str21, "/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertNotNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "//\"//\"//" + "'", str44, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator50);
        org.junit.Assert.assertNotNull(codeGenerator67);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"\"" + "'", str78, "\"\"");
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"/hi!/\"//" + "'", str13, "//\"/hi!/\"//");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator18.regexpEscape("hi!");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator18.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator18.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator18.regexpEscape("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.lang.String str44 = codeGenerator18.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"", charsetEncoder43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51, true);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node54, true, context56);
        java.lang.String str59 = codeGenerator48.regexpEscape("hi!");
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator48.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator48.addList(node62, true, context64);
        java.lang.String str67 = codeGenerator48.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator48.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addArrayList(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator73.addList(node76, true);
        java.lang.String str80 = codeGenerator73.regexpEscape("");
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator73.addArrayList(node81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator73.addList(node83, false);
        java.nio.charset.CharsetEncoder charsetEncoder87 = null;
        java.lang.String str88 = codeGenerator73.regexpEscape("", charsetEncoder87);
        java.lang.String str90 = codeGenerator73.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator73.addList(node91, false, context93);
        codeGenerator48.addList(node70, false, context93);
        codeGenerator18.addList(node45, false, context93);
        codeGenerator1.addList(node15, false, context93);
        com.google.javascript.rhino.Node node98 = null;
        codeGenerator1.addList(node98);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/" + "'", str11, "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/hi!/" + "'", str29, "/hi!/");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/\"//\"/" + "'", str37, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "////\"//\"////" + "'", str41, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str44, "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator48);
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/hi!/" + "'", str59, "/hi!/");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "/\"//\"/" + "'", str67, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator73);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "//" + "'", str80, "//");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "//" + "'", str88, "//");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\"hi!\"" + "'", str90, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, false);
        java.lang.String str21 = codeGenerator14.regexpEscape("hi!");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator14.addArrayList(node22);
        java.lang.String str25 = codeGenerator14.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator29.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator29.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator29.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator43.addList(node49, true, context51);
        codeGenerator29.addList(node40, true, context51);
        codeGenerator14.addList(node26, true, context51);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12, context51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"//\"//" + "'", str7, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"//\\\"\\\"//\"" + "'", str9, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/hi!/" + "'", str21, "/hi!/");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str25, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator29);
        org.junit.Assert.assertNotNull(codeGenerator43);
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////\"\\\"\\\"\"////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str22 = codeGenerator1.regexpEscape("///hi!///");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/hi!/\"" + "'", str20, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "////hi!////" + "'", str22, "////hi!////");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator18.regexpEscape("hi!");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator18.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator18.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator18.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator18.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node44, false, context46);
        codeGenerator1.addList(node15, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator1.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator1.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/hi!/" + "'", str29, "/hi!/");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/\"//\"/" + "'", str37, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "////\"//\"////" + "'", str41, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        java.lang.String str17 = codeGenerator1.regexpEscape("/\"//////\"/");
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"//\"//" + "'", str13, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str15, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//\"//////\"//" + "'", str17, "//\"//////\"//");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"hi!\"" + "'", str19, "\"hi!\"");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, false);
        java.lang.String str21 = codeGenerator14.regexpEscape("/\"//\"/");
        java.lang.String str23 = codeGenerator14.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator14.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator14.addList(node28, true, context30);
        codeGenerator1.addList(node11, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator1.addArrayList(node39);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//\"//\"//" + "'", str21, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"/hi!/\"" + "'", str23, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///hi!///" + "'", str13, "///hi!///");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//" + "'", str15, "//");
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"/\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"/\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("\"//hi!//\"");
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"//hi!//\\\"\"" + "'", str15, "\"\\\"//hi!//\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str17, "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("//\"/\\\"\\\"/\"//");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/////\"\\\"hi!\\\"\"/////", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///\"/\\\"\\\"/\"///" + "'", str10, "///\"/\\\"\\\"/\"///");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//////\"\\\"hi!\\\"\"//////" + "'", str13, "//////\"\\\"hi!\\\"\"//////");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, false);
        java.nio.charset.CharsetEncoder charsetEncoder24 = null;
        java.lang.String str25 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"", charsetEncoder24);
        java.lang.String str27 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str25, "/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"" + "'", str27, "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node15, true, context17);
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("\"////hi!////\"", charsetEncoder20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator25.addAllSiblings(node33);
        java.lang.String str36 = codeGenerator25.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator25.addList(node37, false);
        java.lang.String str41 = codeGenerator25.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator45.addList(node51, true, context53);
        java.lang.String str56 = codeGenerator45.regexpEscape("hi!");
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator60.addList(node66, true, context68);
        codeGenerator45.addList(node57, false, context68);
        codeGenerator25.addList(node42, true, context68);
        codeGenerator1.addList(node22, true, context68);
        java.nio.charset.CharsetEncoder charsetEncoder74 = null;
        java.lang.String str75 = codeGenerator1.regexpEscape("///\"//\\\"//\\\"//\"///", charsetEncoder74);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"////hi!////\"/" + "'", str21, "/\"////hi!////\"/");
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"" + "'", str36, "\"\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str41, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator45);
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "/hi!/" + "'", str56, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator60);
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "////\"//\\\"//\\\"//\"////" + "'", str75, "////\"//\\\"//\\\"//\"////");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.lang.Class<?> wildcardClass18 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"\\\"/\\\\\\\"////////\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"", charsetEncoder14);
        java.lang.String str17 = codeGenerator1.regexpEscape("//////\"//\"//////");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str15, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "///////\"//\"///////" + "'", str17, "///////\"//\"///////");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator17.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addArrayList(node34);
        java.lang.String str37 = codeGenerator28.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator28.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node52, false, context54);
        codeGenerator28.addList(node41, false, context54);
        codeGenerator17.addList(node25, true, context54);
        codeGenerator1.addList(node14, false, context54);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator1.addArrayList(node59);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "//\"//\"//" + "'", str37, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator44);
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\\\"//\\\"//\"//");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"//\\\\\\\"//\\\\\\\"//\\\"//\"" + "'", str10, "\"//\\\"//\\\\\\\"//\\\\\\\"//\\\"//\"");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node27, true, context29);
        java.lang.String str32 = codeGenerator21.regexpEscape("hi!");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator21.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator21.addAllSiblings(node35);
        java.nio.charset.CharsetEncoder charsetEncoder38 = null;
        java.lang.String str39 = codeGenerator21.regexpEscape("//\"\\\"hi!\\\"\"//", charsetEncoder38);
        java.lang.String str41 = codeGenerator21.escapeToDoubleQuotedJsString("//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, false);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator45.addList(node51, false, context53);
        codeGenerator21.addList(node42, true, context53);
        codeGenerator1.addList(node18, true, context53);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/hi!/" + "'", str32, "/hi!/");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str39, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"" + "'", str41, "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator45);
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.regexpEscape("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////\"//\"////" + "'", str24, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str27, "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("///////hi!///////", charsetEncoder22);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "////////hi!////////" + "'", str23, "////////hi!////////");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator35.addArrayList(node41);
        java.lang.String str44 = codeGenerator35.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator35.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addList(node53, true);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator50.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator50.addList(node59, false);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator50.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator67.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator67.addArrayList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator67.addAllSiblings(node75);
        java.lang.String str78 = codeGenerator67.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator67.addList(node79, false);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator67.addList(node82, true, context84);
        codeGenerator50.addList(node64, false, context84);
        codeGenerator35.addList(node47, true, context84);
        codeGenerator25.addList(node32, true, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node23, context84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertNotNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "//\"//\"//" + "'", str44, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator50);
        org.junit.Assert.assertNotNull(codeGenerator67);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"\"" + "'", str78, "\"\"");
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        java.lang.String str7 = codeGenerator1.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"//\"" + "'", str5, "\"//\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "///\"//\"///" + "'", str7, "///\"//\"///");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("///\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"////\\\"\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"", charsetEncoder17);
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("\"\\\"//\\\"\"", charsetEncoder20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"////////\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/" + "'", str18, "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"\\\"//\\\"\"/" + "'", str21, "/\"\\\"//\\\"\"/");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        java.lang.String str8 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.Class<?> wildcardClass9 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"//\\\"\\\"//\"" + "'", str8, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"\\\"////\\\"\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("////////hi!////////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"//\\\"/\"");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str12, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str14, "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str17, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        java.lang.String str8 = codeGenerator1.regexpEscape("\"//\\\"//\\\"//\"");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"//\\\"//\\\"//\"/" + "'", str8, "/\"//\\\"//\\\"//\"/");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/hi!/", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//hi!//" + "'", str15, "//hi!//");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"///\\\"////////\\\"///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"////////\\\"///\"" + "'", str1, "\"///\\\"////////\\\"///\"");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"////\\\"/\\\\\\\"\\\\\\\"/\\\"////\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/hi!/", charsetEncoder14);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//hi!//" + "'", str15, "//hi!//");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"\\\"//\"" + "'", str17, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addArrayList(node28);
        java.lang.String str31 = codeGenerator22.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator22.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator38.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator38.addList(node46, false, context48);
        codeGenerator22.addList(node35, false, context48);
        codeGenerator1.addList(node19, true, context48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "//\"//\"//" + "'", str31, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator38);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("hi!", charsetEncoder6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node8, false, context10);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/hi!/" + "'", str7, "/hi!/");
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"///hi!///\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"///hi!///\\\"/\"" + "'", str1, "\"/\\\"///hi!///\\\"/\"");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"/hi!/\"/");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addAllSiblings(node22);
        java.lang.Class<?> wildcardClass24 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\"/" + "'", str16, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"/hi!/\"//" + "'", str18, "//\"/hi!/\"//");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.regexpEscape("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node37, true, context39);
        java.lang.String str42 = codeGenerator31.regexpEscape("hi!");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator31.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node45, true, context47);
        java.lang.String str50 = codeGenerator31.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator31.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addList(node59, true);
        java.lang.String str63 = codeGenerator56.regexpEscape("");
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator56.addArrayList(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator56.addList(node66, false);
        java.nio.charset.CharsetEncoder charsetEncoder70 = null;
        java.lang.String str71 = codeGenerator56.regexpEscape("", charsetEncoder70);
        java.lang.String str73 = codeGenerator56.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator56.addList(node74, false, context76);
        codeGenerator31.addList(node53, false, context76);
        codeGenerator1.addList(node28, false, context76);
        java.lang.String str81 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////\"//\"////" + "'", str24, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str27, "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/hi!/" + "'", str42, "/hi!/");
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/\"//\"/" + "'", str50, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator56);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "//" + "'", str63, "//");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "//" + "'", str71, "//");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"hi!\"" + "'", str73, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str81, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = null;
        codeGenerator1.addList(node8, true, context10);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str14, "///\"\\\"hi!\\\"\"///");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator16.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node36, true, context38);
        codeGenerator16.addList(node27, true, context38);
        codeGenerator1.addList(node13, true, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addArrayList(node42);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node20, false, context22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("", charsetEncoder25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addArrayList(node27);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "//" + "'", str26, "//");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str22 = codeGenerator1.regexpEscape("///hi!///");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator29.addList(node35, true, context37);
        java.lang.String str40 = codeGenerator29.regexpEscape("hi!");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator29.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator29.addList(node43, true, context45);
        java.lang.String str48 = codeGenerator29.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator29.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator54.addList(node60, true, context62);
        java.lang.String str65 = codeGenerator54.regexpEscape("hi!");
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator54.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator54.addList(node68, true, context70);
        codeGenerator29.addList(node51, false, context70);
        codeGenerator1.addList(node26, true, context70);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator1.addList(node74, false);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator1.addArrayList(node77);
        java.lang.String str80 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"\\\\\\\"//\\\\\\\"\\\"\"");
        java.lang.String str82 = codeGenerator1.escapeToDoubleQuotedJsString("///\"////hi!////\"///");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/hi!/\"" + "'", str20, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "////hi!////" + "'", str22, "////hi!////");
        org.junit.Assert.assertNotNull(codeGenerator29);
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/hi!/" + "'", str40, "/hi!/");
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "/\"//\"/" + "'", str48, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator54);
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "/hi!/" + "'", str65, "/hi!/");
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str80, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\"///\\\"////hi!////\\\"///\"" + "'", str82, "\"///\\\"////hi!////\\\"///\"");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"////\\\"\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        java.lang.String str25 = codeGenerator18.regexpEscape("");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addList(node28, false);
        java.nio.charset.CharsetEncoder charsetEncoder32 = null;
        java.lang.String str33 = codeGenerator18.regexpEscape("", charsetEncoder32);
        java.lang.String str35 = codeGenerator18.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator18.addList(node36, false, context38);
        codeGenerator1.addList(node15, true, context38);
        java.lang.String str42 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"/hi!/\\\"//\"");
        java.lang.Class<?> wildcardClass43 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "//" + "'", str25, "//");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "//" + "'", str33, "//");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"hi!\"" + "'", str35, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"\"" + "'", str42, "\"\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addAllSiblings(node28);
        java.lang.String str31 = codeGenerator20.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addList(node32, false);
        java.lang.String str36 = codeGenerator20.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node46, true, context48);
        java.lang.String str51 = codeGenerator40.regexpEscape("hi!");
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator55.addList(node61, true, context63);
        codeGenerator40.addList(node52, false, context63);
        codeGenerator20.addList(node37, true, context63);
        codeGenerator1.addList(node17, true, context63);
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str36, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "/hi!/" + "'", str51, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator55);
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"", charsetEncoder5);
        java.lang.String str8 = codeGenerator1.regexpEscape("//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str6, "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "///\"//\"///" + "'", str8, "///\"//\"///");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"//\\\\\\\"//\\\\\\\"//\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str15, "/\"\\\"hi!\\\"\"/");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"//\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"" + "'", str19, "\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("///\"//\\\"//\\\"//\"///", charsetEncoder14);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "////\"//\\\"//\\\"//\"////" + "'", str15, "////\"//\\\"//\\\"//\"////");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"////\\\"\"/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"//\"//" + "'", str7, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"//\\\"\\\"//\"" + "'", str9, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"" + "'", str15, "\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        java.lang.Class<?> wildcardClass14 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("", charsetEncoder7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"hi!\\\"\"/", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"hi!\\\"\"//" + "'", str11, "//\"\\\"hi!\\\"\"//");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, false);
        java.lang.String str24 = codeGenerator17.regexpEscape("/\"//\"/");
        java.lang.String str26 = codeGenerator17.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator17.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator17.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node31, true, context33);
        codeGenerator1.addList(node14, true, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/////\\\"//\\\"/////\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "//\"//\"//" + "'", str24, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"/hi!/\"" + "'", str26, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"", charsetEncoder15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str13, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str16, "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"//\"//" + "'", str7, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"//\\\"\\\"//\"" + "'", str9, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"\\\"\"", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"\\\"\"/" + "'", str8, "/\"\\\"\\\"\"/");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, false);
        java.lang.String str31 = codeGenerator24.regexpEscape("/\"//\"/");
        java.lang.String str33 = codeGenerator24.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator24.addList(node38, true, context40);
        codeGenerator1.addList(node21, true, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator46.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator46.addAllSiblings(node54);
        java.lang.String str57 = codeGenerator46.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator46.addList(node58, false);
        java.lang.String str62 = codeGenerator46.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator66.addList(node69, true);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator66.addList(node72, true, context74);
        java.lang.String str77 = codeGenerator66.regexpEscape("hi!");
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator81.addArrayList(node82);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator81.addList(node84, true);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator81.addList(node87, true, context89);
        codeGenerator66.addList(node78, false, context89);
        codeGenerator46.addList(node63, true, context89);
        codeGenerator1.addList(node43, false, context89);
        java.nio.charset.CharsetEncoder charsetEncoder95 = null;
        java.lang.String str96 = codeGenerator1.regexpEscape("\"////\"", charsetEncoder95);
        java.lang.String str98 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "//\"//\"//" + "'", str31, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"/hi!/\"" + "'", str33, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator46);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"\"" + "'", str57, "\"\"");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str62, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator66);
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "/hi!/" + "'", str77, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator81);
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "/\"////\"/" + "'", str96, "/\"////\"/");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str98, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder14);
        java.lang.String str17 = codeGenerator1.regexpEscape("\"\\\"\\\"\"");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24);
        java.lang.String str27 = codeGenerator1.escapeToDoubleQuotedJsString("/////hi!/////");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "////\"//\"////" + "'", str15, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"\\\"\\\"\"/" + "'", str17, "/\"\\\"\\\"\"/");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"/////hi!/////\"" + "'", str27, "\"/////hi!/////\"");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"//\"" + "'", str1, "\"//\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"//\"");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("//\"/\\\"\\\"/\"//");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/////\"\\\"hi!\\\"\"/////", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///\"/\\\"\\\"/\"///" + "'", str10, "///\"/\\\"\\\"/\"///");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//////\"\\\"hi!\\\"\"//////" + "'", str13, "//////\"\\\"hi!\\\"\"//////");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        java.lang.String str17 = codeGenerator1.regexpEscape("/\"//////\"/");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"//\"//" + "'", str13, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str15, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//\"//////\"//" + "'", str17, "//\"//////\"//");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/hi!/", charsetEncoder14);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator1.addList(node18, false, context20);
        java.lang.String str23 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24, true);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//hi!//" + "'", str15, "//hi!//");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"\\\"//\"" + "'", str17, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//" + "'", str23, "//");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.regexpEscape("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node37, false, context39);
        codeGenerator1.addList(node28, false, context39);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addArrayList(node42);
        java.lang.String str45 = codeGenerator1.escapeToDoubleQuotedJsString("//////////");
        com.google.javascript.rhino.Node node46 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////\"//\"////" + "'", str24, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str27, "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"//////////\"" + "'", str45, "\"//////////\"");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "////" + "'", str13, "////");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node27, true, context29);
        codeGenerator1.addList(node14, true, context29);
        java.lang.String str33 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        java.lang.Class<?> wildcardClass36 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str33, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("\"//\\\"/hi!/\\\"//\"", charsetEncoder22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addAllSiblings(node24);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"hi!\"" + "'", str18, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/\"//\\\"/hi!/\\\"//\"/" + "'", str23, "/\"//\\\"/hi!/\\\"//\"/");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("", charsetEncoder20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22, true);
        java.lang.String str26 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"/hi!/\"" + "'", str18, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//" + "'", str21, "//");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/" + "'", str26, "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("/\"////hi!////\"/");
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("//\"///hi!///\"//", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"//\"//" + "'", str7, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"//\\\"\\\"//\"" + "'", str9, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"/\\\"////hi!////\\\"/\"" + "'", str11, "\"/\\\"////hi!////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "///\"///hi!///\"///" + "'", str14, "///\"///hi!///\"///");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"/hi!/\"/");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        java.lang.String str23 = codeGenerator1.escapeToDoubleQuotedJsString("////////");
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\"/" + "'", str16, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"/hi!/\"//" + "'", str18, "//\"/hi!/\"//");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"////////\"" + "'", str23, "\"////////\"");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.regexpEscape("");
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"", charsetEncoder20);
        java.lang.String str23 = codeGenerator1.regexpEscape("//\"//\\\"//\\\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//" + "'", str18, "//");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/" + "'", str21, "/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "///\"//\\\"//\\\"//\"///" + "'", str23, "///\"//\\\"//\\\"//\"///");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\"/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"//\"/" + "'", str13, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"\\\"/\"" + "'", str15, "\"/\\\"\\\"/\"");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node27, false, context29);
        java.lang.String str32 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"//\\\"\"/");
        java.nio.charset.CharsetEncoder charsetEncoder34 = null;
        java.lang.String str35 = codeGenerator1.regexpEscape("//\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"//", charsetEncoder34);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////\"//\"////" + "'", str24, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"/\\\"\\\\\\\"//\\\\\\\"\\\"/\"" + "'", str32, "\"/\\\"\\\\\\\"//\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "///\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"///" + "'", str35, "///\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"///");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "////\"//\"////" + "'", str15, "////\"//\"////");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator16.addAllSiblings(node24);
        java.lang.String str27 = codeGenerator16.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node31, true, context33);
        codeGenerator1.addList(node13, true, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"////\\\"\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"", charsetEncoder17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/" + "'", str18, "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str20, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("\"///hi!///\"", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"//\\\"//\"");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        java.lang.String str22 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"///hi!///\"/" + "'", str16, "/\"///hi!///\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"" + "'", str18, "\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "//" + "'", str22, "//");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"/hi!/\\\"\"/");
        java.lang.String str22 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23);
        java.lang.String str26 = codeGenerator1.regexpEscape("\"///\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"///\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"" + "'", str20, "\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str22, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"///\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"///\"/" + "'", str26, "/\"///\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"///\"/");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node21, true, context23);
        java.lang.String str26 = codeGenerator15.regexpEscape("hi!");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator15.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator15.addList(node29, true, context31);
        java.lang.String str34 = codeGenerator15.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator15.addAllSiblings(node35);
        java.lang.String str38 = codeGenerator15.regexpEscape("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder40 = null;
        java.lang.String str41 = codeGenerator15.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"", charsetEncoder40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node51, false, context53);
        codeGenerator15.addList(node42, false, context53);
        codeGenerator1.addList(node12, true, context53);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/" + "'", str11, "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/hi!/" + "'", str26, "/hi!/");
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/\"//\"/" + "'", str34, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "////\"//\"////" + "'", str38, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str41, "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator45);
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23);
        java.lang.String str26 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
        java.lang.String str28 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"/\"");
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addAllSiblings(node29);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str26, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str28, "\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"//\"//" + "'", str7, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"//\\\"\\\"//\"" + "'", str9, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////\"//\"////" + "'", str24, "////\"//\"////");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("////\"//////\"////", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16, context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/////\"//////\"/////" + "'", str15, "/////\"//////\"/////");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"/hi!/\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/hi!/\\\"//\"" + "'", str1, "\"//\\\"/hi!/\\\"//\"");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node20, false, context22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("", charsetEncoder25);
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        java.lang.String str29 = codeGenerator1.regexpEscape("////////////", charsetEncoder28);
        java.lang.String str31 = codeGenerator1.regexpEscape("");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "//" + "'", str26, "//");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "//////////////" + "'", str29, "//////////////");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "//" + "'", str31, "//");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator17.addList(node23, true, context25);
        java.lang.String str28 = codeGenerator17.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str30 = codeGenerator17.escapeToDoubleQuotedJsString("\"/\\\"//\\\"/\"");
        java.nio.charset.CharsetEncoder charsetEncoder32 = null;
        java.lang.String str33 = codeGenerator17.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"", charsetEncoder32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, true);
        java.lang.String str44 = codeGenerator37.regexpEscape("");
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator37.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator37.addList(node47, false);
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.lang.String str52 = codeGenerator37.regexpEscape("", charsetEncoder51);
        java.lang.String str54 = codeGenerator37.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator37.addList(node55, false, context57);
        codeGenerator17.addList(node34, false, context57);
        codeGenerator1.addList(node14, true, context57);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator1.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator1.addArrayList(node63);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str28, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str30, "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str33, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "//" + "'", str44, "//");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "//" + "'", str52, "//");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"hi!\"" + "'", str54, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"////\\\"\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/" + "'", str18, "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///\"//////\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator16.addAllSiblings(node24);
        java.lang.String str27 = codeGenerator16.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator16.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node33, true, context35);
        codeGenerator1.addList(node13, true, context35);
        java.lang.String str39 = codeGenerator1.escapeToDoubleQuotedJsString("/\"///\\\"///hi!///\\\"///\"/");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator1.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addList(node42, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"/\\\"///\\\\\\\"///hi!///\\\\\\\"///\\\"/\"" + "'", str39, "\"/\\\"///\\\\\\\"///hi!///\\\\\\\"///\\\"/\"");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"////hi!////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"////hi!////\\\"/\"" + "'", str1, "\"/\\\"////hi!////\\\"/\"");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        java.lang.String str33 = codeGenerator26.regexpEscape("");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator26.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator26.addList(node36, false);
        java.nio.charset.CharsetEncoder charsetEncoder40 = null;
        java.lang.String str41 = codeGenerator26.regexpEscape("", charsetEncoder40);
        java.lang.String str43 = codeGenerator26.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator26.addList(node44, false, context46);
        codeGenerator1.addList(node23, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addArrayList(node49);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "//" + "'", str33, "//");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "//" + "'", str41, "//");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"hi!\"" + "'", str43, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("hi!", charsetEncoder6);
        java.lang.String str9 = codeGenerator1.regexpEscape("//\"//\\\"//\\\"//\"//");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = null;
        codeGenerator1.addList(node10, false, context12);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/hi!/" + "'", str7, "/hi!/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "///\"//\\\"//\\\"//\"///" + "'", str9, "///\"//\\\"//\\\"//\"///");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"//\\\"/\"");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        java.lang.String str21 = codeGenerator1.regexpEscape("//\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str12, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str14, "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str17, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "///\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"///" + "'", str21, "///\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"///");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator1.regexpEscape("/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"//\\\"\"" + "'", str14, "\"\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"//" + "'", str20, "//\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"//");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"\\\"//\\\"\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator27.addList(node33, true, context35);
        java.lang.String str38 = codeGenerator27.regexpEscape("hi!");
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator27.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator27.addList(node41, true, context43);
        codeGenerator1.addList(node24, false, context43);
        java.lang.String str47 = codeGenerator1.escapeToDoubleQuotedJsString("//////////////");
        com.google.javascript.rhino.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(codeGenerator27);
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/hi!/" + "'", str38, "/hi!/");
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"//////////////\"" + "'", str47, "\"//////////////\"");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator26.regexpEscape("hi!");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node40, true, context42);
        java.lang.String str45 = codeGenerator26.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator26.addAllSiblings(node46);
        java.lang.String str49 = codeGenerator26.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator26.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node52, false, context54);
        codeGenerator1.addList(node23, false, context54);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/hi!/" + "'", str37, "/hi!/");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/\"//\"/" + "'", str45, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "////\"//\"////" + "'", str49, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"/\\\"//\\\"/\"");
        java.lang.String str16 = codeGenerator1.regexpEscape("/\"///hi!///\"/");
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/");
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("/\"//\\\"/hi!/\\\"//\"/", charsetEncoder20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22, true);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str12, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"/\\\"//\\\"/\"/" + "'", str14, "/\"/\\\"//\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//\"///hi!///\"//" + "'", str16, "//\"///hi!///\"//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str18, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//\"//\\\"/hi!/\\\"//\"//" + "'", str21, "//\"//\\\"/hi!/\\\"//\"//");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator26.regexpEscape("hi!");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node40, true, context42);
        codeGenerator1.addList(node23, false, context42);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator1.addList(node45, false);
        java.lang.String str49 = codeGenerator1.escapeToDoubleQuotedJsString("\"/////\\\"\\\\\\\"hi!\\\\\\\"\\\"/////\"");
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator1.addList(node50);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/hi!/" + "'", str37, "/hi!/");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\\\"/////\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"/////\\\"\"" + "'", str49, "\"\\\"/////\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"/////\\\"\"");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder14);
        java.lang.String str17 = codeGenerator1.regexpEscape("\"\\\"\\\"\"");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node18, false, context20);
        java.lang.String str23 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addAllSiblings(node24);
        java.lang.String str27 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "////\"//\"////" + "'", str15, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"\\\"\\\"\"/" + "'", str17, "/\"\\\"\\\"\"/");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"\\\"\\\\\\\"////\\\\\\\"\\\"\"/" + "'", str27, "/\"\\\"\\\\\\\"////\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, false);
        java.lang.String str21 = codeGenerator14.regexpEscape("/\"//\"/");
        java.lang.String str23 = codeGenerator14.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator14.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator14.addList(node28, true, context30);
        codeGenerator1.addList(node11, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addArrayList(node43);
        java.lang.String str46 = codeGenerator37.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator37.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator53.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator53.addList(node61, false, context63);
        codeGenerator37.addList(node50, false, context63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node35, context63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//\"//\"//" + "'", str21, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"/hi!/\"" + "'", str23, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "//\"//\"//" + "'", str46, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator53);
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\\\"//\\\"//\"//");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, false);
        java.lang.String str22 = codeGenerator15.regexpEscape("hi!");
        java.lang.String str24 = codeGenerator15.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator15.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator30.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator30.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator30.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator30.addList(node45, true, context47);
        codeGenerator15.addList(node27, true, context47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"//\\\\\\\"//\\\\\\\"//\\\"//\"" + "'", str10, "\"//\\\"//\\\\\\\"//\\\\\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/hi!/" + "'", str22, "/hi!/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str24, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"" + "'", str41, "\"\"");
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"//\\\"//\\\"//\"/", charsetEncoder12);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("/////\"/hi!/\"/////", charsetEncoder15);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"//\\\"//\\\"//\"//" + "'", str13, "//\"//\\\"//\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//////\"/hi!/\"//////" + "'", str16, "//////\"/hi!/\"//////");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"/\\\"//\\\"/\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str12, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"/\\\"//\\\"/\"/" + "'", str14, "/\"/\\\"//\\\"/\"/");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"\"");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("////\"//\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("///hi!///");
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"\\\"\\\"\"", charsetEncoder17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"///hi!///\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"////\"" + "'", str10, "\"////\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"///hi!///\"" + "'", str15, "\"///hi!///\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"\\\"\\\"\"/" + "'", str18, "/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"///hi!///\"/" + "'", str20, "/\"///hi!///\"/");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        java.lang.String str12 = codeGenerator1.regexpEscape("////////");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator34.addAllSiblings(node42);
        java.lang.String str45 = codeGenerator34.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator34.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator34.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator34.addList(node51, true, context53);
        codeGenerator19.addList(node31, true, context53);
        codeGenerator1.addList(node16, false, context53);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"////\"" + "'", str10, "\"////\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "//////////" + "'", str12, "//////////");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(codeGenerator34);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"//\\\"/hi!/\\\"//\"/", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"//\\\"/hi!/\\\"//\"//" + "'", str13, "//\"//\\\"/hi!/\\\"//\"//");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator18.addList(node32, true, context34);
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.lang.String str38 = codeGenerator18.regexpEscape("\"////hi!////\"", charsetEncoder37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator42.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator42.addAllSiblings(node50);
        java.lang.String str53 = codeGenerator42.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator42.addList(node54, false);
        java.lang.String str58 = codeGenerator42.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node68, true, context70);
        java.lang.String str73 = codeGenerator62.regexpEscape("hi!");
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator77.addArrayList(node78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator77.addList(node80, true);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator77.addList(node83, true, context85);
        codeGenerator62.addList(node74, false, context85);
        codeGenerator42.addList(node59, true, context85);
        codeGenerator18.addList(node39, true, context85);
        codeGenerator1.addList(node15, false, context85);
        java.lang.Class<?> wildcardClass91 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/\"////hi!////\"/" + "'", str38, "/\"////hi!////\"/");
        org.junit.Assert.assertNotNull(codeGenerator42);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"\"" + "'", str53, "\"\"");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str58, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator62);
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "/hi!/" + "'", str73, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator77);
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.lang.String str15 = codeGenerator1.regexpEscape("////////");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str10, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//////////" + "'", str15, "//////////");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"////\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "///\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"///" + "'", str14, "///\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"///");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str22 = codeGenerator1.regexpEscape("///hi!///");
        java.lang.String str24 = codeGenerator1.regexpEscape("\"\\\"//\\\"\"");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/hi!/\"" + "'", str20, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "////hi!////" + "'", str22, "////hi!////");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/\"\\\"//\\\"\"/" + "'", str24, "/\"\\\"//\\\"\"/");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        java.lang.Class<?> wildcardClass8 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"//\"" + "'", str5, "\"//\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        java.lang.String str8 = codeGenerator1.regexpEscape("\"//\\\"//\\\"//\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"//\\\"//\\\"//\"/" + "'", str8, "/\"//\\\"//\\\"//\"/");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"///\\\"////hi!////\\\"///\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//", charsetEncoder18);
        java.lang.String str21 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str19, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"" + "'", str21, "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator16.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node36, true, context38);
        codeGenerator16.addList(node27, true, context38);
        codeGenerator1.addList(node13, true, context38);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("");
        java.lang.String str22 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder24 = null;
        java.lang.String str25 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder24);
        java.lang.String str27 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
        java.lang.String str29 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"////////\\\"/\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//" + "'", str20, "//");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"hi!\"" + "'", str22, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "///\"//\"///" + "'", str25, "///\"//\"///");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"" + "'", str27, "\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"/\\\\\\\"////////\\\\\\\"/\\\"\"" + "'", str29, "\"\\\"/\\\\\\\"////////\\\\\\\"/\\\"\"");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("/\"\"/", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        java.lang.Class<?> wildcardClass19 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//\"\"//" + "'", str16, "//\"\"//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str18, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder12);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("/hi!/", charsetEncoder15);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("\"/hi!/\"", charsetEncoder18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addArrayList(node22);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///hi!///" + "'", str13, "///hi!///");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//hi!//" + "'", str16, "//hi!//");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"/hi!/\"/" + "'", str19, "/\"/hi!/\"/");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str22 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/hi!/" + "'", str22, "/hi!/");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        java.lang.String str17 = codeGenerator1.regexpEscape("/\"//////\"/");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"//\"//" + "'", str13, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str15, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//\"//////\"//" + "'", str17, "//\"//////\"//");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.regexpEscape("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////\"//\"////" + "'", str24, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str27, "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator18.regexpEscape("hi!");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator18.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator18.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator18.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator18.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node44, false, context46);
        codeGenerator1.addList(node15, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator1.addList(node51, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/hi!/" + "'", str29, "/hi!/");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/\"//\"/" + "'", str37, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "////\"//\"////" + "'", str41, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("\"///\\\"///hi!///\\\"///\"");
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"///\\\"///hi!///\\\"///\"/" + "'", str8, "/\"///\\\"///hi!///\\\"///\"/");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.regexpEscape("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        java.lang.String str31 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addList(node32);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////\"//\"////" + "'", str24, "////\"//\"////");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str27, "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str31, "\"/\\\"//\\\"/\"");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, true);
        java.lang.String str26 = codeGenerator19.regexpEscape("");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator19.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addList(node29, false);
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.lang.String str34 = codeGenerator19.regexpEscape("", charsetEncoder33);
        java.lang.String str36 = codeGenerator19.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator19.addList(node37, false, context39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node41, false, context43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "//" + "'", str26, "//");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "//" + "'", str34, "//");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"hi!\"" + "'", str36, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"////////////\\\"\"", charsetEncoder14);
        java.lang.String str17 = codeGenerator1.regexpEscape("");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"////////////\\\"\"/" + "'", str15, "/\"\\\"////////////\\\"\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//" + "'", str17, "//");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"////////\"");
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator1.regexpEscape("//\"/hi!/\"//", charsetEncoder19);
        java.lang.String str22 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str15, "/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"////////\"/" + "'", str17, "/\"////////\"/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "///\"/hi!/\"///" + "'", str20, "///\"/hi!/\"///");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/" + "'", str22, "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.regexpEscape("//////");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("\"//////////\"", charsetEncoder18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "////////" + "'", str14, "////////");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"//////////\"/" + "'", str19, "/\"//////////\"/");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("////", charsetEncoder22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24, true);
        java.lang.String str28 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33, true);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/hi!/\"" + "'", str20, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//////" + "'", str23, "//////");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str28, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, false);
        java.lang.String str21 = codeGenerator14.regexpEscape("/\"//\"/");
        java.lang.String str23 = codeGenerator14.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator14.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator14.addList(node28, true, context30);
        codeGenerator1.addList(node11, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//\"//\"//" + "'", str21, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"/hi!/\"" + "'", str23, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"//\\\"/\"/");
        java.lang.Class<?> wildcardClass20 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str17, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"" + "'", str19, "\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "///hi!///" + "'", str11, "///hi!///");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        java.lang.String str21 = codeGenerator1.regexpEscape("//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"//");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22, true);
        java.lang.String str26 = codeGenerator1.regexpEscape("//\"//\"//");
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        java.lang.String str29 = codeGenerator1.regexpEscape("/\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"/", charsetEncoder28);
        java.lang.String str31 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"////hi!////\\\\\\\"/\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str15, "/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "///\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"///" + "'", str21, "///\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"///");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "///\"//\"///" + "'", str26, "///\"//\"///");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "//\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"//" + "'", str29, "//\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "/\"\\\"/\\\\\\\"////hi!////\\\\\\\"/\\\"\"/" + "'", str31, "/\"\\\"/\\\\\\\"////hi!////\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        codeGenerator1.addList(node14, false, context27);
        java.lang.String str31 = codeGenerator1.regexpEscape("///\"\\\"hi!\\\"\"///");
        java.lang.String str33 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "////\"\\\"hi!\\\"\"////" + "'", str31, "////\"\\\"hi!\\\"\"////");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str33, "///\"\\\"hi!\\\"\"///");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//", charsetEncoder18);
        java.lang.String str21 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22);
        java.lang.String str25 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"///\\\\\\\"///hi!///\\\\\\\"///\\\"/\"");
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str19, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"" + "'", str21, "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"/\\\\\\\"///\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\"///\\\\\\\"/\\\"\"" + "'", str25, "\"\\\"/\\\\\\\"///\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\"///\\\\\\\"/\\\"\"");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str12 = codeGenerator1.regexpEscape("//");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "////" + "'", str12, "////");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"//////\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//////\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str14, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//////\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\"/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        java.lang.String str20 = codeGenerator1.regexpEscape("///\"\\\"hi!\\\"\"///");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"//\"/" + "'", str13, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"\\\"/\"" + "'", str15, "\"/\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "////\"\\\"hi!\\\"\"////" + "'", str20, "////\"\\\"hi!\\\"\"////");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator18.regexpEscape("hi!");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator18.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator18.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator18.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator18.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node44, false, context46);
        codeGenerator1.addList(node15, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node51, context52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/hi!/" + "'", str29, "/hi!/");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/\"//\"/" + "'", str37, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "////\"//\"////" + "'", str41, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//////\"/" + "'", str1, "/\"//////\"/");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        java.lang.String str9 = codeGenerator1.regexpEscape("/\"\\\"hi!\\\"\"/");
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("////hi!////");
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("/\"\\\"/\\\\\\\"////hi!////\\\\\\\"/\\\"\"/", charsetEncoder15);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"//\"" + "'", str5, "\"//\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//\"\\\"hi!\\\"\"//" + "'", str9, "//\"\\\"hi!\\\"\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"////hi!////\"" + "'", str13, "\"////hi!////\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//\"\\\"/\\\\\\\"////hi!////\\\\\\\"/\\\"\"//" + "'", str16, "//\"\\\"/\\\\\\\"////hi!////\\\\\\\"/\\\"\"//");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node23, context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("\"//hi!//\"");
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("///\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"///");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"//hi!//\\\"\"" + "'", str15, "\"\\\"//hi!//\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str17, "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"///\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"///\"" + "'", str19, "\"///\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"///\"");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21);
        java.nio.charset.CharsetEncoder charsetEncoder24 = null;
        java.lang.String str25 = codeGenerator1.regexpEscape("//////////", charsetEncoder24);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "////////////" + "'", str25, "////////////");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        java.lang.String str8 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//////\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///\\\"\\\\\\\"hi!\\\\\\\"\\\"///\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"/\\\"//////\\\"/\"" + "'", str8, "\"/\\\"//////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"///\\\"\"" + "'", str10, "\"\\\"///\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"///\\\"\"");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.lang.String str14 = codeGenerator1.regexpEscape("\"/\\\"//\\\"/\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.lang.String str22 = codeGenerator1.regexpEscape("/\"///hi!///\"/", charsetEncoder21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"/\\\"//\\\"/\"/" + "'", str14, "/\"/\\\"//\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "//\"///hi!///\"//" + "'", str22, "//\"///hi!///\"//");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node27, true, context29);
        java.lang.String str32 = codeGenerator21.regexpEscape("hi!");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator36.addList(node42, true, context44);
        codeGenerator21.addList(node33, false, context44);
        codeGenerator1.addList(node18, true, context44);
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.lang.String str50 = codeGenerator1.regexpEscape("\"\\\"\\\"\"", charsetEncoder49);
        java.lang.String str52 = codeGenerator1.escapeToDoubleQuotedJsString("///////\"//\"///////");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str17, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/hi!/" + "'", str32, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/\"\\\"\\\"\"/" + "'", str50, "/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"///////\\\"//\\\"///////\"" + "'", str52, "\"///////\\\"//\\\"///////\"");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//////");
        java.lang.String str13 = codeGenerator1.regexpEscape("//\"/hi!/\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//////////////\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"//\"//" + "'", str7, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//////\"" + "'", str11, "\"//////\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///\"/hi!/\"///" + "'", str13, "///\"/hi!/\"///");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"");
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("///\"//////\"///");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str10, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"///\\\"//////\\\"///\"" + "'", str12, "\"///\\\"//////\\\"///\"");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("////", charsetEncoder22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24, true);
        java.lang.String str28 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addAllSiblings(node31);
        java.lang.String str34 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/hi!/\"" + "'", str20, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//////" + "'", str23, "//////");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str28, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str34, "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node27, true, context29);
        codeGenerator1.addList(node14, true, context29);
        java.lang.String str33 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str33, "\"//\\\"//\\\"//\"");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22, true);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"//\\\"\"" + "'", str14, "\"\\\"//\\\"\"");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node20, false, context22);
        java.lang.String str25 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str25, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////\"\\\"////\\\"\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("//\"/\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"/\"//", charsetEncoder10);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "///\"/\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"/\"///" + "'", str11, "///\"/\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"/\"///");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"//\\\"/\"/");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str17, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"" + "'", str19, "\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("/\"/\\\"\\\"/\"/", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = null;
        codeGenerator1.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//\"/\\\"\\\"/\"//" + "'", str9, "//\"/\\\"\\\"/\"//");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator16.addAllSiblings(node24);
        java.lang.String str27 = codeGenerator16.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addList(node28, false);
        java.lang.String str32 = codeGenerator16.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator36.addList(node42, true, context44);
        java.lang.String str47 = codeGenerator36.regexpEscape("hi!");
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node57, true, context59);
        codeGenerator36.addList(node48, false, context59);
        codeGenerator16.addList(node33, true, context59);
        codeGenerator1.addList(node13, false, context59);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator1.addList(node64, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str32, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "/hi!/" + "'", str47, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator51);
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"//\"" + "'", str5, "\"//\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str10, "/\"\\\"hi!\\\"\"/");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("\"//\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"//\"", charsetEncoder20);
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.lang.String str24 = codeGenerator1.regexpEscape("//\"\\\"\\\"\"//", charsetEncoder23);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\"/" + "'", str16, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"//\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"//\"/" + "'", str21, "/\"//\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "///\"\\\"\\\"\"///" + "'", str24, "///\"\\\"\\\"\"///");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str22 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addArrayList(node29);
        java.nio.charset.CharsetEncoder charsetEncoder32 = null;
        java.lang.String str33 = codeGenerator28.regexpEscape("\"//\"", charsetEncoder32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator37.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator54.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator54.addAllSiblings(node62);
        java.lang.String str65 = codeGenerator54.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator54.addList(node66, false);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator54.addList(node69, true, context71);
        codeGenerator37.addList(node51, false, context71);
        codeGenerator28.addList(node34, false, context71);
        codeGenerator1.addList(node25, false, context71);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator1.addAllSiblings(node76);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"//\\\"//\\\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/hi!/" + "'", str22, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/\"//\"/" + "'", str33, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertNotNull(codeGenerator54);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\"\"" + "'", str65, "\"\"");
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node17, true, context19);
        java.lang.String str22 = codeGenerator11.regexpEscape("hi!");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator11.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node25, true, context27);
        java.lang.String str30 = codeGenerator11.regexpEscape("");
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node40, true, context42);
        java.lang.String str45 = codeGenerator34.regexpEscape("hi!");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator34.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator34.addList(node48, true, context50);
        java.lang.String str53 = codeGenerator34.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator34.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator59.addList(node62, true);
        java.lang.String str66 = codeGenerator59.regexpEscape("");
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator59.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator59.addList(node69, false);
        java.nio.charset.CharsetEncoder charsetEncoder73 = null;
        java.lang.String str74 = codeGenerator59.regexpEscape("", charsetEncoder73);
        java.lang.String str76 = codeGenerator59.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator59.addList(node77, false, context79);
        codeGenerator34.addList(node56, false, context79);
        codeGenerator11.addList(node31, false, context79);
        codeGenerator1.addList(node8, false, context79);
        java.nio.charset.CharsetEncoder charsetEncoder85 = null;
        java.lang.String str86 = codeGenerator1.regexpEscape("/\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"/", charsetEncoder85);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/hi!/" + "'", str22, "/hi!/");
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "//" + "'", str30, "//");
        org.junit.Assert.assertNotNull(codeGenerator34);
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/hi!/" + "'", str45, "/hi!/");
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "/\"//\"/" + "'", str53, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "//" + "'", str66, "//");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "//" + "'", str74, "//");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\"hi!\"" + "'", str76, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "//\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"//" + "'", str86, "//\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"//");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//", charsetEncoder18);
        java.lang.String str21 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22);
        java.lang.String str25 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"///\\\\\\\"///hi!///\\\\\\\"///\\\"/\"");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator28.addAllSiblings(node36);
        java.lang.String str39 = codeGenerator28.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator28.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, true);
        java.lang.String str53 = codeGenerator46.regexpEscape("");
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator46.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator46.addList(node56, false);
        java.nio.charset.CharsetEncoder charsetEncoder60 = null;
        java.lang.String str61 = codeGenerator46.regexpEscape("", charsetEncoder60);
        java.lang.String str63 = codeGenerator46.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator46.addList(node64, false, context66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator46.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addArrayList(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator75.addList(node78, true);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator75.addList(node81, false, context83);
        codeGenerator46.addList(node72, false, context83);
        codeGenerator28.addList(node43, true, context83);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26, context83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str19, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"" + "'", str21, "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"/\\\\\\\"///\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\"///\\\\\\\"/\\\"\"" + "'", str25, "\"\\\"/\\\\\\\"///\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\"///\\\\\\\"/\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"" + "'", str39, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "//" + "'", str53, "//");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "//" + "'", str61, "//");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\"hi!\"" + "'", str63, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator75);
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"\\\"/\\\\\\\"//////\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//////////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator26.regexpEscape("hi!");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node40, true, context42);
        codeGenerator1.addList(node23, false, context42);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator1.addList(node45, false);
        java.lang.String str49 = codeGenerator1.escapeToDoubleQuotedJsString("\"/////\\\"\\\\\\\"hi!\\\\\\\"\\\"/////\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"////hi!////\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/hi!/" + "'", str37, "/hi!/");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\\\"/////\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"/////\\\"\"" + "'", str49, "\"\\\"/////\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"/////\\\"\"");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"", charsetEncoder10);
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/" + "'", str11, "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        codeGenerator1.addList(node14, false, context27);
        java.lang.String str31 = codeGenerator1.regexpEscape("///\"\\\"hi!\\\"\"///");
        java.lang.String str33 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "////\"\\\"hi!\\\"\"////" + "'", str31, "////\"\\\"hi!\\\"\"////");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str33, "///\"\\\"hi!\\\"\"///");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("///\"///hi!///\"///");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, true);
        java.lang.String str20 = codeGenerator13.regexpEscape("");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator13.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator13.addList(node23, false);
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.lang.String str28 = codeGenerator13.regexpEscape("", charsetEncoder27);
        java.lang.String str30 = codeGenerator13.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator13.addList(node31, false, context33);
        codeGenerator1.addList(node10, false, context33);
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.lang.String str38 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"//\\\\\\\"\\\"\"", charsetEncoder37);
        com.google.javascript.rhino.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"///\\\"///hi!///\\\"///\"" + "'", str9, "\"///\\\"///hi!///\\\"///\"");
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//" + "'", str20, "//");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "//" + "'", str28, "//");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"hi!\"" + "'", str30, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/\"\\\"\\\\\\\"//\\\\\\\"\\\"\"/" + "'", str38, "/\"\\\"\\\\\\\"//\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"/hi!/\\\"\"/");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("///\"////////\"///", charsetEncoder7);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"" + "'", str3, "\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "////\"////////\"////" + "'", str8, "////\"////////\"////");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        java.lang.String str25 = codeGenerator18.regexpEscape("");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addList(node28, false);
        java.nio.charset.CharsetEncoder charsetEncoder32 = null;
        java.lang.String str33 = codeGenerator18.regexpEscape("", charsetEncoder32);
        java.lang.String str35 = codeGenerator18.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator18.addList(node36, false, context38);
        codeGenerator1.addList(node15, false, context38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "//" + "'", str25, "//");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "//" + "'", str33, "//");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"hi!\"" + "'", str35, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"///////\\\"//\\\"///////\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"////hi!////\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"//" + "'", str5, "//\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"//");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"////////\"");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"////////\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str15, "/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"////////\"/" + "'", str17, "/\"////////\"/");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("/\"/\\\"\\\"/\"/", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//\"/\\\"\\\"/\"//" + "'", str9, "//\"/\\\"\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"" + "'", str11, "\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("////", charsetEncoder22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addArrayList(node27);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/hi!/\"" + "'", str20, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//////" + "'", str23, "//////");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/////\"/\\\"\\\"/\"/////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/" + "'", str13, "/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"////\\\"\"/");
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"", charsetEncoder17);
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("", charsetEncoder20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"//\"//" + "'", str7, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"//\\\"\\\"//\"" + "'", str9, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"" + "'", str15, "\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/" + "'", str18, "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//" + "'", str21, "//");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str9, "/\"\\\"hi!\\\"\"/");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/hi!/", charsetEncoder14);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator1.regexpEscape("//////////", charsetEncoder19);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//hi!//" + "'", str15, "//hi!//");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"\\\"//\"" + "'", str17, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "////////////" + "'", str20, "////////////");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addArrayList(node27);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node27, true, context29);
        java.lang.String str32 = codeGenerator21.regexpEscape("hi!");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator36.addList(node42, true, context44);
        codeGenerator21.addList(node33, false, context44);
        codeGenerator1.addList(node18, true, context44);
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.lang.String str50 = codeGenerator1.regexpEscape("\"\\\"\\\"\"", charsetEncoder49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator1.addAllSiblings(node51);
        java.lang.String str54 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"//\\\\\\\"//\\\\\\\"//\\\"//\"");
        java.lang.String str56 = codeGenerator1.regexpEscape("///\"////////\"///");
        com.google.javascript.rhino.Node node57 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str17, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/hi!/" + "'", str32, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/\"\\\"\\\"\"/" + "'", str50, "/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\\\"//\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"//\\\"\"" + "'", str54, "\"\\\"//\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "////\"////////\"////" + "'", str56, "////\"////////\"////");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("//\"/hi!/\"//");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"//\\\"/hi!/\\\"//\"" + "'", str20, "\"//\\\"/hi!/\\\"//\"");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, true);
        java.lang.String str31 = codeGenerator24.regexpEscape("");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator24.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addList(node34, false);
        java.nio.charset.CharsetEncoder charsetEncoder38 = null;
        java.lang.String str39 = codeGenerator24.regexpEscape("", charsetEncoder38);
        java.lang.String str41 = codeGenerator24.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator24.addList(node42, false, context44);
        codeGenerator1.addList(node21, false, context44);
        java.lang.String str48 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"//");
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addList(node49);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"/hi!/\"" + "'", str18, "\"/hi!/\"");
        org.junit.Assert.assertNotNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "//" + "'", str31, "//");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "//" + "'", str39, "//");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"hi!\"" + "'", str41, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\"" + "'", str48, "\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\"");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"", charsetEncoder17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "////" + "'", str13, "////");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str18, "/\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("");
        java.lang.String str22 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator26.regexpEscape("hi!");
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node47, true, context49);
        codeGenerator26.addList(node38, false, context49);
        codeGenerator1.addList(node23, true, context49);
        java.lang.String str54 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//" + "'", str20, "//");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"//\"" + "'", str22, "\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/hi!/" + "'", str37, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator41);
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "/\"\\\"\\\\\\\"////\\\\\\\"\\\"\"/" + "'", str54, "/\"\\\"\\\\\\\"////\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////\"//\"////" + "'", str24, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("\"//hi!//\"", charsetEncoder18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator26.addAllSiblings(node34);
        java.lang.String str37 = codeGenerator26.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator26.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator26.addList(node43, true, context45);
        codeGenerator1.addList(node23, false, context45);
        java.lang.String str49 = codeGenerator1.regexpEscape("\"/\\\"////hi!////\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"//\\\"\"" + "'", str14, "\"\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"//hi!//\"/" + "'", str19, "/\"//hi!//\"/");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\"" + "'", str37, "\"\"");
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "/\"/\\\"////hi!////\\\"/\"/" + "'", str49, "/\"/\\\"////hi!////\\\"/\"/");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node18, true, context20);
        java.lang.String str23 = codeGenerator12.regexpEscape("hi!");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator12.addList(node26, true, context28);
        java.lang.String str31 = codeGenerator12.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str33 = codeGenerator12.regexpEscape("///hi!///");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator12.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node46, true, context48);
        java.lang.String str51 = codeGenerator40.regexpEscape("hi!");
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator40.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator40.addList(node54, true, context56);
        java.lang.String str59 = codeGenerator40.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator40.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator65.addList(node68, true);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator65.addList(node71, true, context73);
        java.lang.String str76 = codeGenerator65.regexpEscape("hi!");
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator65.addList(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator65.addList(node79, true, context81);
        codeGenerator40.addList(node62, false, context81);
        codeGenerator12.addList(node37, true, context81);
        codeGenerator1.addList(node9, false, context81);
        java.lang.String str87 = codeGenerator1.regexpEscape("//\"////\"//");
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator1.addList(node88, true);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator1.addArrayList(node91);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/hi!/" + "'", str23, "/hi!/");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"/hi!/\"" + "'", str31, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "////hi!////" + "'", str33, "////hi!////");
        org.junit.Assert.assertNotNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "/hi!/" + "'", str51, "/hi!/");
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/\"//\"/" + "'", str59, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator65);
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "/hi!/" + "'", str76, "/hi!/");
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "///\"////\"///" + "'", str87, "///\"////\"///");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//", charsetEncoder12);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("/\"//hi!//\"/", charsetEncoder15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "////" + "'", str13, "////");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//\"//hi!//\"//" + "'", str16, "//\"//hi!//\"//");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"///\\\"/\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"/\\\"///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node23, false, context25);
        java.lang.String str28 = codeGenerator1.regexpEscape("//\"\"//");
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"hi!\"" + "'", str18, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "///\"\"///" + "'", str28, "///\"\"///");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.lang.String str14 = codeGenerator1.regexpEscape("\"/\\\"//\\\"/\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node26, false, context28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator20.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addArrayList(node32);
        java.lang.String str35 = codeGenerator20.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator20.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node39, false, context41);
        codeGenerator1.addList(node17, true, context41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"/\\\"//\\\"/\"/" + "'", str14, "/\"/\\\"//\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str35, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("///hi!///");
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"////\\\"\"//");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.lang.String str22 = codeGenerator1.regexpEscape("//\"///\\\"////hi!////\\\"///\"//", charsetEncoder21);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"///hi!///\"" + "'", str15, "\"///hi!///\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"\\\\\\\"////\\\\\\\"\\\"//\"" + "'", str17, "\"//\\\"\\\\\\\"////\\\\\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "///\"///\\\"////hi!////\\\"///\"///" + "'", str22, "///\"///\\\"////hi!////\\\"///\"///");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        java.lang.String str22 = codeGenerator1.regexpEscape("///\"//\\\"//\\\"//\"///");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"hi!\"" + "'", str18, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "////\"//\\\"//\\\"//\"////" + "'", str22, "////\"//\\\"//\\\"//\"////");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator26.regexpEscape("hi!");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node40, true, context42);
        codeGenerator1.addList(node23, false, context42);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator1.addList(node45);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/hi!/" + "'", str37, "/hi!/");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        java.lang.String str20 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//" + "'", str20, "//");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"/hi!/\\\"\"/");
        java.lang.String str22 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23);
        java.lang.String str26 = codeGenerator1.regexpEscape("/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"" + "'", str20, "\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str22, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//" + "'", str26, "//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "///hi!///" + "'", str11, "///hi!///");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        java.lang.String str8 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//////\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///\\\"\\\\\\\"hi!\\\\\\\"\\\"///\"");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("////\"//\"////", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"/\\\"//////\\\"/\"" + "'", str8, "\"/\\\"//////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"///\\\"\"" + "'", str10, "\"\\\"///\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"///\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/////\"//\"/////" + "'", str13, "/////\"//\"/////");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        java.lang.String str25 = codeGenerator18.regexpEscape("");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addList(node28, false);
        java.nio.charset.CharsetEncoder charsetEncoder32 = null;
        java.lang.String str33 = codeGenerator18.regexpEscape("", charsetEncoder32);
        java.lang.String str35 = codeGenerator18.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator18.addList(node36, false, context38);
        codeGenerator1.addList(node15, true, context38);
        java.lang.String str42 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"/hi!/\\\"//\"");
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, false);
        java.lang.String str53 = codeGenerator46.regexpEscape("hi!");
        java.lang.String str55 = codeGenerator46.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator59.addList(node62, false);
        java.lang.String str66 = codeGenerator59.regexpEscape("/\"//\"/");
        java.lang.String str68 = codeGenerator59.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator59.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator59.addArrayList(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator59.addList(node73, true, context75);
        codeGenerator46.addList(node56, true, context75);
        codeGenerator1.addList(node43, false, context75);
        com.google.javascript.rhino.Node node79 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "//" + "'", str25, "//");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "//" + "'", str33, "//");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"hi!\"" + "'", str35, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"\"" + "'", str42, "\"\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "/hi!/" + "'", str53, "/hi!/");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str55, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "//\"//\"//" + "'", str66, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\"/hi!/\"" + "'", str68, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"", charsetEncoder18);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/" + "'", str19, "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node16, false, context18);
        java.lang.String str21 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"//\\\"\"/");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addArrayList(node22);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///hi!///" + "'", str13, "///hi!///");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//" + "'", str15, "//");
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"/\\\"\\\\\\\"//\\\\\\\"\\\"/\"" + "'", str21, "\"/\\\"\\\\\\\"//\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"///hi!///\"", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"////\"" + "'", str10, "\"////\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"///hi!///\"/" + "'", str18, "/\"///hi!///\"/");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str12 = codeGenerator1.regexpEscape("//");
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "////" + "'", str12, "////");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator16.addAllSiblings(node24);
        java.lang.String str27 = codeGenerator16.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node31, true, context33);
        codeGenerator1.addList(node13, true, context33);
        java.lang.String str37 = codeGenerator1.escapeToDoubleQuotedJsString("//\"/hi!/\"//");
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, false);
        java.lang.String str47 = codeGenerator40.regexpEscape("/\"//\"/");
        java.lang.String str49 = codeGenerator40.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.lang.String str52 = codeGenerator40.regexpEscape("//hi!//", charsetEncoder51);
        java.lang.String str54 = codeGenerator40.regexpEscape("");
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator40.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator40.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator62.addArrayList(node68);
        java.lang.String str71 = codeGenerator62.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator62.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node74, true, context76);
        codeGenerator40.addList(node59, true, context76);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node38, context76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"//\\\"/hi!/\\\"//\"" + "'", str37, "\"//\\\"/hi!/\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "//\"//\"//" + "'", str47, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"/hi!/\"" + "'", str49, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "///hi!///" + "'", str52, "///hi!///");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "//" + "'", str54, "//");
        org.junit.Assert.assertNotNull(codeGenerator62);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\"/hi!/\"" + "'", str71, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"//\\\"\\\\\\\"////\\\\\\\"\\\"//\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "////" + "'", str13, "////");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator25.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator38.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator38.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator38.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator52.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator52.addList(node58, true, context60);
        codeGenerator38.addList(node49, true, context60);
        codeGenerator25.addList(node35, true, context60);
        codeGenerator1.addList(node22, false, context60);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addArrayList(node65);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"//\"/" + "'", str13, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertNotNull(codeGenerator38);
        org.junit.Assert.assertNotNull(codeGenerator52);
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        java.lang.String str21 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"/\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"" + "'", str21, "\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"////////\"");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str15, "/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"////////\"/" + "'", str17, "/\"////////\"/");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        java.lang.Class<?> wildcardClass19 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/" + "'", str11, "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("///hi!///");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\"/");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "////hi!////" + "'", str16, "////hi!////");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"/\\\"\\\"/\"" + "'", str20, "\"/\\\"\\\"/\"");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"////\\\"/\\\\\\\"\\\\\\\"/\\\"////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"////\\\"/\\\\\\\"\\\\\\\"/\\\"////\"/" + "'", str1, "/\"////\\\"/\\\\\\\"\\\\\\\"/\\\"////\"/");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        java.lang.String str8 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"//\\\"\\\"//\"" + "'", str8, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"////////\"");
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator1.regexpEscape("//\"/hi!/\"//", charsetEncoder19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str15, "/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"////////\"/" + "'", str17, "/\"////////\"/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "///\"/hi!/\"///" + "'", str20, "///\"/hi!/\"///");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"", charsetEncoder25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addList(node29, true);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "///\"//\"///" + "'", str23, "///\"//\"///");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str26, "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"//////\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("////\"//////\"////", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/////\"//////\"/////" + "'", str15, "/////\"//////\"/////");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node22, true, context24);
        codeGenerator1.addList(node13, false, context24);
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        java.lang.String str29 = codeGenerator1.regexpEscape("/\"//\\\"//\\\"//\"/", charsetEncoder28);
        java.lang.String str31 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addList(node32);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "//\"//\\\"//\\\"//\"//" + "'", str29, "//\"//\\\"//\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.regexpEscape("//////");
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "////////" + "'", str14, "////////");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator1.regexpEscape("\"////////////\"", charsetEncoder19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator1.escapeToDoubleQuotedJsString("");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"////////////\"/" + "'", str20, "/\"////////////\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, false);
        java.lang.String str21 = codeGenerator14.regexpEscape("/\"//\"/");
        java.lang.String str23 = codeGenerator14.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator14.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator14.addList(node28, true, context30);
        codeGenerator1.addList(node11, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//\"//\"//" + "'", str21, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"/hi!/\"" + "'", str23, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"\\\"\\\\\\\"//\\\\\\\"\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///hi!///" + "'", str13, "///hi!///");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//" + "'", str15, "//");
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"///\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"///\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        codeGenerator1.addList(node14, false, context27);
        java.lang.String str31 = codeGenerator1.regexpEscape("///\"\\\"hi!\\\"\"///");
        java.lang.String str33 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "////\"\\\"hi!\\\"\"////" + "'", str31, "////\"\\\"hi!\\\"\"////");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str33, "///\"\\\"hi!\\\"\"///");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"\\\\\\\"//\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"//\\\"\"" + "'", str12, "\"\\\"//\\\"\"");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addArrayList(node17);
        java.lang.String str20 = codeGenerator11.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator11.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator43.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator43.addAllSiblings(node51);
        java.lang.String str54 = codeGenerator43.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator43.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator43.addList(node58, true, context60);
        codeGenerator26.addList(node40, false, context60);
        codeGenerator11.addList(node23, true, context60);
        codeGenerator1.addList(node8, true, context60);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addList(node65);
        java.nio.charset.CharsetEncoder charsetEncoder68 = null;
        java.lang.String str69 = codeGenerator1.regexpEscape("\"/hi!/\"", charsetEncoder68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator1.addArrayList(node70);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//\"//\"//" + "'", str20, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertNotNull(codeGenerator43);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\"" + "'", str54, "\"\"");
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "/\"/hi!/\"/" + "'", str69, "/\"/hi!/\"/");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node18, true, context20);
        java.lang.String str23 = codeGenerator12.regexpEscape("hi!");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator12.addList(node26, true, context28);
        java.lang.String str31 = codeGenerator12.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str33 = codeGenerator12.regexpEscape("///hi!///");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator12.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node46, true, context48);
        java.lang.String str51 = codeGenerator40.regexpEscape("hi!");
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator40.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator40.addList(node54, true, context56);
        java.lang.String str59 = codeGenerator40.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator40.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator65.addList(node68, true);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator65.addList(node71, true, context73);
        java.lang.String str76 = codeGenerator65.regexpEscape("hi!");
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator65.addList(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator65.addList(node79, true, context81);
        codeGenerator40.addList(node62, false, context81);
        codeGenerator12.addList(node37, true, context81);
        codeGenerator1.addList(node9, false, context81);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator1.addArrayList(node86);
        java.nio.charset.CharsetEncoder charsetEncoder89 = null;
        java.lang.String str90 = codeGenerator1.regexpEscape("////\"//\"////", charsetEncoder89);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator1.addArrayList(node91);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/hi!/" + "'", str23, "/hi!/");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"/hi!/\"" + "'", str31, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "////hi!////" + "'", str33, "////hi!////");
        org.junit.Assert.assertNotNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "/hi!/" + "'", str51, "/hi!/");
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/\"//\"/" + "'", str59, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator65);
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "/hi!/" + "'", str76, "/hi!/");
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "/////\"//\"/////" + "'", str90, "/////\"//\"/////");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"/\\\"//////\\\"/\"", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"/\\\"//////\\\"/\"/" + "'", str15, "/\"/\\\"//////\\\"/\"/");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        java.lang.String str23 = codeGenerator1.escapeToDoubleQuotedJsString("\"/////\\\"//\\\"/////\"");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\"/////\\\\\\\"//\\\\\\\"/////\\\"\"" + "'", str23, "\"\\\"/////\\\\\\\"//\\\\\\\"/////\\\"\"");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("//\"\\\"hi!\\\"\"//");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"//\"//" + "'", str13, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str15, "///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"/" + "'", str17, "/\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"/");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("///\"\\\"\\\"\"///", charsetEncoder13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str11, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "////\"\\\"\\\"\"////" + "'", str14, "////\"\\\"\\\"\"////");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"//\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"//\\\"\"");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"///\\\"////////\\\"///\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str10, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node20, false, context22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("", charsetEncoder25);
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        java.lang.String str29 = codeGenerator1.regexpEscape("////////////", charsetEncoder28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"///\\\"\\\\\\\"///hi!///\\\\\\\"\\\"///\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "//" + "'", str26, "//");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "//////////////" + "'", str29, "//////////////");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        java.lang.String str23 = codeGenerator1.regexpEscape("//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "////" + "'", str23, "////");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"//\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"//\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addArrayList(node17);
        java.lang.String str20 = codeGenerator11.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator11.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator43.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator43.addAllSiblings(node51);
        java.lang.String str54 = codeGenerator43.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator43.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator43.addList(node58, true, context60);
        codeGenerator26.addList(node40, false, context60);
        codeGenerator11.addList(node23, true, context60);
        codeGenerator1.addList(node8, true, context60);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addList(node65);
        java.nio.charset.CharsetEncoder charsetEncoder68 = null;
        java.lang.String str69 = codeGenerator1.regexpEscape("\"/hi!/\"", charsetEncoder68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator1.addAllSiblings(node70);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//\"//\"//" + "'", str20, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertNotNull(codeGenerator43);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\"" + "'", str54, "\"\"");
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "/\"/hi!/\"/" + "'", str69, "/\"/hi!/\"/");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node22, true, context24);
        codeGenerator1.addList(node13, false, context24);
        java.lang.String str28 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        java.lang.String str30 = codeGenerator1.regexpEscape("////\"//\"////");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator36.addArrayList(node42);
        java.lang.String str45 = codeGenerator36.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator36.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node48, true, context50);
        codeGenerator1.addList(node33, true, context50);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator1.addArrayList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator1.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator1.addList(node57);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str28, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/////\"//\"/////" + "'", str30, "/////\"//\"/////");
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"/hi!/\"" + "'", str45, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addAllSiblings(node22);
        java.lang.String str25 = codeGenerator1.regexpEscape("/\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "//\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"//" + "'", str25, "//\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"//");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        codeGenerator1.addList(node14, false, context27);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator1.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node32, true, context34);
        codeGenerator1.addList(node23, true, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"///\\\"////hi!////\\\"///\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        java.lang.Class<?> wildcardClass21 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\"/" + "'", str16, "/\"//\"/");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = null;
        codeGenerator1.addList(node8, true, context10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "///hi!///" + "'", str11, "///hi!///");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"////hi!////\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.lang.String str24 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"", charsetEncoder23);
        java.lang.String str26 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"////hi!////\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/" + "'", str24, "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\\\"/\\\\\\\"////hi!////\\\\\\\"/\\\"\"" + "'", str26, "\"\\\"/\\\\\\\"////hi!////\\\\\\\"/\\\"\"");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node27, context28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("///\"///hi!///\"///");
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"///\\\"///hi!///\\\"///\"" + "'", str9, "\"///\\\"///hi!///\\\"///\"");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"//\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"/\\\"\\\\\\\"//\\\\\\\"\\\"/\"" + "'", str12, "\"/\\\"\\\\\\\"//\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"/\\\"//\\\"/\"");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator18.regexpEscape("hi!");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator18.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str39 = codeGenerator18.regexpEscape("///hi!///");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator18.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator46.addList(node52, true, context54);
        java.lang.String str57 = codeGenerator46.regexpEscape("hi!");
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator46.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator46.addList(node60, true, context62);
        java.lang.String str65 = codeGenerator46.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator46.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator71.addArrayList(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator71.addList(node74, true);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator71.addList(node77, true, context79);
        java.lang.String str82 = codeGenerator71.regexpEscape("hi!");
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator71.addList(node83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator71.addList(node85, true, context87);
        codeGenerator46.addList(node68, false, context87);
        codeGenerator18.addList(node43, true, context87);
        codeGenerator1.addList(node15, true, context87);
        java.nio.charset.CharsetEncoder charsetEncoder93 = null;
        java.lang.String str94 = codeGenerator1.regexpEscape("//\"\\\"///hi!///\\\"\"//", charsetEncoder93);
        java.lang.Class<?> wildcardClass95 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str12, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"/\\\"//\\\"/\"/" + "'", str14, "/\"/\\\"//\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/hi!/" + "'", str29, "/hi!/");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"/hi!/\"" + "'", str37, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "////hi!////" + "'", str39, "////hi!////");
        org.junit.Assert.assertNotNull(codeGenerator46);
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "/hi!/" + "'", str57, "/hi!/");
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "/\"//\"/" + "'", str65, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator71);
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "/hi!/" + "'", str82, "/hi!/");
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "///\"\\\"///hi!///\\\"\"///" + "'", str94, "///\"\\\"///hi!///\\\"\"///");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator30.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator30.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator30.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator30.addList(node45, true, context47);
        codeGenerator1.addList(node27, false, context47);
        java.lang.Class<?> wildcardClass50 = context47.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"hi!\"" + "'", str18, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"" + "'", str41, "\"\"");
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, false);
        java.lang.String str31 = codeGenerator24.regexpEscape("/\"//\"/");
        java.lang.String str33 = codeGenerator24.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator24.addList(node38, true, context40);
        codeGenerator1.addList(node21, true, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, false);
        java.lang.String str53 = codeGenerator46.regexpEscape("/\"//\"/");
        java.lang.String str55 = codeGenerator46.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator46.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator46.addArrayList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator46.addList(node60, true, context62);
        codeGenerator1.addList(node43, true, context62);
        java.lang.String str66 = codeGenerator1.regexpEscape("/\"\"/");
        java.lang.String str68 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"\\\"/\"/");
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator1.addList(node69);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "//\"//\"//" + "'", str31, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"/hi!/\"" + "'", str33, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "//\"//\"//" + "'", str53, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"/hi!/\"" + "'", str55, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "//\"\"//" + "'", str66, "//\"\"//");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str68, "\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.regexpEscape("//////");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder16);
        java.lang.String str19 = codeGenerator1.regexpEscape("\"\\\"hi!\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.lang.String str22 = codeGenerator1.regexpEscape("/\"/\\\"//////\\\"/\"/", charsetEncoder21);
        java.lang.String str24 = codeGenerator1.regexpEscape("////////hi!////////");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "////////" + "'", str14, "////////");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str17, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str19, "/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "//\"/\\\"//////\\\"/\"//" + "'", str22, "//\"/\\\"//////\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/////////hi!/////////" + "'", str24, "/////////hi!/////////");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node29, true, context31);
        java.lang.String str34 = codeGenerator23.regexpEscape("hi!");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator23.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator23.addList(node37, true, context39);
        java.lang.String str42 = codeGenerator23.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator23.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51, true);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node54, false, context56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator48.addList(node58, true);
        java.lang.String str62 = codeGenerator48.escapeToDoubleQuotedJsString("\"//hi!//\"");
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator72.addArrayList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator72.addList(node75, true);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node78, true, context80);
        codeGenerator66.addList(node69, true, context80);
        codeGenerator48.addList(node63, false, context80);
        codeGenerator23.addList(node45, false, context80);
        codeGenerator1.addList(node20, false, context80);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator1.addList(node86, true);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertNotNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/hi!/" + "'", str34, "/hi!/");
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/\"//\"/" + "'", str42, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator48);
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"\\\"//hi!//\\\"\"" + "'", str62, "\"\\\"//hi!//\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator66);
        org.junit.Assert.assertNotNull(codeGenerator72);
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, false);
        java.lang.String str31 = codeGenerator24.regexpEscape("/\"//\"/");
        java.lang.String str33 = codeGenerator24.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator24.addList(node38, true, context40);
        codeGenerator1.addList(node21, true, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator46.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator46.addAllSiblings(node54);
        java.lang.String str57 = codeGenerator46.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator46.addList(node58, false);
        java.lang.String str62 = codeGenerator46.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator66.addList(node69, true);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator66.addList(node72, true, context74);
        java.lang.String str77 = codeGenerator66.regexpEscape("hi!");
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator81.addArrayList(node82);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator81.addList(node84, true);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator81.addList(node87, true, context89);
        codeGenerator66.addList(node78, false, context89);
        codeGenerator46.addList(node63, true, context89);
        codeGenerator1.addList(node43, false, context89);
        java.lang.String str95 = codeGenerator1.regexpEscape("//\"\"//");
        com.google.javascript.rhino.Node node96 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "//\"//\"//" + "'", str31, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"/hi!/\"" + "'", str33, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator46);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"\"" + "'", str57, "\"\"");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str62, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator66);
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "/hi!/" + "'", str77, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator81);
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "///\"\"///" + "'", str95, "///\"\"///");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"", charsetEncoder20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"", charsetEncoder25);
        java.lang.String str28 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\\\"//\\\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\"/" + "'", str16, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"/" + "'", str21, "/\"/\\\"\\\\\\\"////\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"/" + "'", str26, "/\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"/\\\"//\\\\\\\"//\\\\\\\"//\\\"/\"" + "'", str28, "\"/\\\"//\\\\\\\"//\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator20.addList(node28, false, context30);
        codeGenerator1.addList(node17, false, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator1.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator1.addAllSiblings(node39);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\"/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        java.lang.String str20 = codeGenerator1.regexpEscape("///\"\\\"hi!\\\"\"///");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addArrayList(node21);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"//\"/" + "'", str13, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"\\\"/\"" + "'", str15, "\"/\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "////\"\\\"hi!\\\"\"////" + "'", str20, "////\"\\\"hi!\\\"\"////");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator16.addAllSiblings(node24);
        java.lang.String str27 = codeGenerator16.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator16.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node33, true, context35);
        codeGenerator1.addList(node13, true, context35);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"////\\\"\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("//\"//\\\"//\\\"//\"//", charsetEncoder15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node25, true, context27);
        java.lang.String str30 = codeGenerator19.regexpEscape("hi!");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator19.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node33, true, context35);
        java.lang.String str38 = codeGenerator19.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder40 = null;
        java.lang.String str41 = codeGenerator19.regexpEscape("////", charsetEncoder40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator19.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51, true);
        java.lang.String str55 = codeGenerator48.regexpEscape("");
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator48.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator48.addList(node58, false);
        java.nio.charset.CharsetEncoder charsetEncoder62 = null;
        java.lang.String str63 = codeGenerator48.regexpEscape("", charsetEncoder62);
        java.lang.String str65 = codeGenerator48.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator48.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator48.addList(node70, false, context72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator77.addArrayList(node78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator77.addList(node80, true);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator77.addList(node83, false, context85);
        codeGenerator48.addList(node74, false, context85);
        codeGenerator19.addList(node45, true, context85);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"////\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "///\"//\\\"//\\\"//\"///" + "'", str16, "///\"//\\\"//\\\"//\"///");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/hi!/" + "'", str30, "/hi!/");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"/hi!/\"" + "'", str38, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "//////" + "'", str41, "//////");
        org.junit.Assert.assertNotNull(codeGenerator48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "//" + "'", str55, "//");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "//" + "'", str63, "//");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\"hi!\"" + "'", str65, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator77);
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("/\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"/", charsetEncoder22);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"//" + "'", str23, "//\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"//");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str22 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addAllSiblings(node28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/hi!/" + "'", str22, "/hi!/");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addAllSiblings(node28);
        java.lang.String str31 = codeGenerator20.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator20.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator20.addList(node37, true, context39);
        codeGenerator1.addList(node17, true, context39);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addArrayList(node42);
        java.lang.String str45 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/" + "'", str45, "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node15, true, context17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"///\\\"///hi!///\\\"///\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("//\"/\\\"\\\"/\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\"/" + "'", str16, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"" + "'", str20, "\"//\\\"/\\\\\\\"\\\\\\\"/\\\"//\"");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addAllSiblings(node28);
        java.lang.String str31 = codeGenerator20.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addList(node32, false);
        java.lang.String str36 = codeGenerator20.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node46, true, context48);
        java.lang.String str51 = codeGenerator40.regexpEscape("hi!");
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator55.addList(node61, true, context63);
        codeGenerator40.addList(node52, false, context63);
        codeGenerator20.addList(node37, true, context63);
        codeGenerator1.addList(node17, false, context63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str36, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "/hi!/" + "'", str51, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator55);
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator20.addList(node28, false, context30);
        codeGenerator1.addList(node17, false, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator1.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator1.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"//", charsetEncoder12);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"///" + "'", str13, "///\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"///");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node27, true, context29);
        java.lang.String str32 = codeGenerator21.regexpEscape("hi!");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator36.addList(node42, true, context44);
        codeGenerator21.addList(node33, false, context44);
        codeGenerator1.addList(node18, true, context44);
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.lang.String str50 = codeGenerator1.regexpEscape("\"\\\"\\\"\"", charsetEncoder49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator1.addAllSiblings(node51);
        java.lang.String str54 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"//\\\\\\\"//\\\\\\\"//\\\"//\"");
        java.lang.String str56 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//hi!//\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str17, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/hi!/" + "'", str32, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/\"\\\"\\\"\"/" + "'", str50, "/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\\\"//\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"//\\\"\"" + "'", str54, "\"\\\"//\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\"/\\\"//hi!//\\\"/\"" + "'", str56, "\"/\\\"//hi!//\\\"/\"");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator24.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator24.addAllSiblings(node32);
        java.lang.String str35 = codeGenerator24.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addList(node36, false);
        java.lang.String str40 = codeGenerator24.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node50, true, context52);
        java.lang.String str55 = codeGenerator44.regexpEscape("hi!");
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator59.addList(node62, true);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node65, true, context67);
        codeGenerator44.addList(node56, false, context67);
        codeGenerator24.addList(node41, true, context67);
        codeGenerator1.addList(node21, true, context67);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator1.addArrayList(node72);
        java.nio.charset.CharsetEncoder charsetEncoder75 = null;
        java.lang.String str76 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"", charsetEncoder75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator1.addArrayList(node77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator1.addList(node79, false);
        java.lang.String str83 = codeGenerator1.regexpEscape("//\"////hi!////\"//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//" + "'", str20, "//\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str40, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator44);
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "/hi!/" + "'", str55, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator59);
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/" + "'", str76, "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "///\"////hi!////\"///" + "'", str83, "///\"////hi!////\"///");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addArrayList(node19);
        java.lang.String str22 = codeGenerator13.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator13.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator13.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator32.addList(node40, false, context42);
        codeGenerator13.addList(node29, false, context42);
        codeGenerator1.addList(node10, false, context42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//\\\"//\\\\\\\"/hi!/\\\\\\\"//\\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "//\"//\"//" + "'", str22, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator32);
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator18.regexpEscape("hi!");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator18.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str39 = codeGenerator18.regexpEscape("///hi!///");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator18.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator46.addList(node52, true, context54);
        java.lang.String str57 = codeGenerator46.regexpEscape("hi!");
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator46.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator46.addList(node60, true, context62);
        java.lang.String str65 = codeGenerator46.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator46.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator71.addArrayList(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator71.addList(node74, true);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator71.addList(node77, true, context79);
        java.lang.String str82 = codeGenerator71.regexpEscape("hi!");
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator71.addList(node83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator71.addList(node85, true, context87);
        codeGenerator46.addList(node68, false, context87);
        codeGenerator18.addList(node43, true, context87);
        codeGenerator1.addList(node15, false, context87);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/hi!/" + "'", str29, "/hi!/");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"/hi!/\"" + "'", str37, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "////hi!////" + "'", str39, "////hi!////");
        org.junit.Assert.assertNotNull(codeGenerator46);
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "/hi!/" + "'", str57, "/hi!/");
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "/\"//\"/" + "'", str65, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator71);
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "/hi!/" + "'", str82, "/hi!/");
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addAllSiblings(node26);
        java.lang.String str29 = codeGenerator18.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator18.addList(node33, true, context35);
        codeGenerator1.addList(node15, false, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator25.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator25.addList(node35, true, context37);
        codeGenerator1.addList(node22, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///hi!///" + "'", str13, "///hi!///");
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.lang.String str14 = codeGenerator1.regexpEscape("\"/\\\"//\\\"/\"");
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("//hi!//");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"/\\\"//\\\"/\"/" + "'", str14, "/\"/\\\"//\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"//hi!//\"" + "'", str16, "\"//hi!//\"");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator16.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator33.addAllSiblings(node41);
        java.lang.String str44 = codeGenerator33.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator33.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator33.addList(node48, true, context50);
        codeGenerator16.addList(node30, false, context50);
        codeGenerator1.addList(node13, true, context50);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator1.addList(node54, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"" + "'", str44, "\"\"");
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"/hi!/\"//" + "'", str13, "//\"/hi!/\"//");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str10, "\"\\\"///hi!///\\\"\"");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator20.addList(node28, false, context30);
        codeGenerator1.addList(node17, false, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33);
        java.lang.String str36 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//////\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//////\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/" + "'", str36, "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//////\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/////\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/////\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/////" + "'", str1, "/////\"/\\\"/\\\\\\\"//\\\\\\\"/\\\"/\"/////");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        java.lang.String str21 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/" + "'", str21, "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node19, true, context21);
        java.lang.String str24 = codeGenerator13.escapeToDoubleQuotedJsString("/\"//\"/");
        java.lang.String str26 = codeGenerator13.escapeToDoubleQuotedJsString("\"/\\\"//\\\"/\"");
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        java.lang.String str29 = codeGenerator13.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"", charsetEncoder28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36, true);
        java.lang.String str40 = codeGenerator33.regexpEscape("");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator33.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator33.addList(node43, false);
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.lang.String str48 = codeGenerator33.regexpEscape("", charsetEncoder47);
        java.lang.String str50 = codeGenerator33.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator33.addList(node51, false, context53);
        codeGenerator13.addList(node30, false, context53);
        codeGenerator1.addList(node10, false, context53);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator1.addList(node57);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str24, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str26, "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str29, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "//" + "'", str40, "//");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "//" + "'", str48, "//");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"hi!\"" + "'", str50, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("//\"/\\\"\\\"/\"//");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///\"/\\\"\\\"/\"///" + "'", str10, "///\"/\\\"\\\"/\"///");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str6, "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\"/");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"/\\\"\\\"/\"" + "'", str12, "\"/\\\"\\\"/\"");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        java.lang.String str16 = codeGenerator1.regexpEscape("");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"/hi!/\"/");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\"/" + "'", str16, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"/hi!/\"//" + "'", str18, "//\"/hi!/\"//");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22, false);
        java.lang.String str26 = codeGenerator1.regexpEscape("//////\"//\"//////");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "///////\"//\"///////" + "'", str26, "///////\"//\"///////");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addArrayList(node22);
        java.lang.String str25 = codeGenerator16.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node28, true, context30);
        codeGenerator1.addList(node13, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"//\"/" + "'", str6, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"/hi!/\"" + "'", str25, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("//\"/\\\"\\\"/\"//");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///\"/\\\"\\\"/\"///" + "'", str10, "///\"/\\\"\\\"/\"///");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("//\"\\\"\\\\\\\"//\\\\\\\"\\\"\"//", charsetEncoder16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "///\"\\\"\\\\\\\"//\\\\\\\"\\\"\"///" + "'", str17, "///\"\\\"\\\\\\\"//\\\\\\\"\\\"\"///");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"//\\\"\"" + "'", str14, "\"\\\"//\\\"\"");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"/hi!/\"" + "'", str10, "\"/hi!/\"");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addArrayList(node16);
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator15.regexpEscape("\"//\"", charsetEncoder19);
        java.lang.String str22 = codeGenerator15.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator26.regexpEscape("hi!");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator26.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addList(node52, false);
        java.lang.String str56 = codeGenerator49.regexpEscape("/\"//\"/");
        java.lang.String str58 = codeGenerator49.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator49.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator49.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator49.addList(node63, true, context65);
        codeGenerator26.addList(node46, true, context65);
        codeGenerator15.addList(node23, true, context65);
        codeGenerator1.addList(node12, false, context65);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"//" + "'", str11, "//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"//\"/" + "'", str20, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"//\\\"\\\"//\"" + "'", str22, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/hi!/" + "'", str37, "/hi!/");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator49);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "//\"//\"//" + "'", str56, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"/hi!/\"" + "'", str58, "\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        java.lang.String str21 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"", charsetEncoder25);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"////\"" + "'", str10, "\"////\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//" + "'", str21, "//");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/" + "'", str26, "/\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator18.regexpEscape("hi!");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node32, true, context34);
        java.lang.String str37 = codeGenerator18.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator18.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator18.regexpEscape("///\"//\"///");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator18.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node44, false, context46);
        codeGenerator1.addList(node15, false, context46);
        java.lang.String str50 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//////\"//");
        java.lang.String str52 = codeGenerator1.regexpEscape("/\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"/");
        java.lang.Class<?> wildcardClass53 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/hi!/" + "'", str29, "/hi!/");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/\"//\"/" + "'", str37, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "////\"//\"////" + "'", str41, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"//\\\"//////\\\"//\"" + "'", str50, "\"//\\\"//////\\\"//\"");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "//\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"//" + "'", str52, "//\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"//");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        java.lang.String str23 = codeGenerator1.escapeToDoubleQuotedJsString("\"/////\\\"//\\\"/////\"");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24);
        java.lang.String str27 = codeGenerator1.regexpEscape("///\"/\\\"\\\"/\"///");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\"/////\\\\\\\"//\\\\\\\"/////\\\"\"" + "'", str23, "\"\\\"/////\\\\\\\"//\\\\\\\"/////\\\"\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "////\"/\\\"\\\"/\"////" + "'", str27, "////\"/\\\"\\\"/\"////");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addArrayList(node17);
        java.lang.String str20 = codeGenerator11.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator11.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator43.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator43.addAllSiblings(node51);
        java.lang.String str54 = codeGenerator43.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator43.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator43.addList(node58, true, context60);
        codeGenerator26.addList(node40, false, context60);
        codeGenerator11.addList(node23, true, context60);
        codeGenerator1.addList(node8, true, context60);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addArrayList(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator76.addArrayList(node77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator76.addList(node79, true);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator76.addList(node82, true, context84);
        codeGenerator70.addList(node73, true, context84);
        codeGenerator1.addList(node67, false, context84);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//\"//\"//" + "'", str20, "//\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertNotNull(codeGenerator43);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\"" + "'", str54, "\"\"");
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator70);
        org.junit.Assert.assertNotNull(codeGenerator76);
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node27, true, context29);
        codeGenerator1.addList(node14, true, context29);
        java.lang.String str33 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator1.addList(node37);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str33, "\"//\\\"//\\\"//\"");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("", charsetEncoder15);
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"////\"" + "'", str18, "\"////\"");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str14 = codeGenerator1.regexpEscape("//////");
        java.lang.String str16 = codeGenerator1.regexpEscape("//\"//////\"//");
        java.lang.String str18 = codeGenerator1.regexpEscape("//\"\\\"//\\\"\"//");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "////////" + "'", str14, "////////");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "///\"//////\"///" + "'", str16, "///\"//////\"///");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "///\"\\\"//\\\"\"///" + "'", str18, "///\"\\\"//\\\"\"///");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("///\"////hi!////\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.lang.String str8 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/hi!/" + "'", str8, "/hi!/");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"////\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, true);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"///hi!///\"/");
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"//////\\\"/\"");
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"////\"/" + "'", str11, "/\"////\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/" + "'", str16, "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"///hi!///\"//" + "'", str18, "//\"///hi!///\"//");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"/\\\\\\\"//////\\\\\\\"/\\\"\"" + "'", str20, "\"\\\"/\\\\\\\"//////\\\\\\\"/\\\"\"");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"//\\\"/hi!/\\\"//\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.String str12 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        java.lang.String str20 = codeGenerator1.regexpEscape("");
        java.lang.String str22 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str24 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28, false);
        java.lang.String str32 = codeGenerator1.escapeToDoubleQuotedJsString("/\"///\\\"////hi!////\\\"///\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/hi!/" + "'", str12, "/hi!/");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//" + "'", str20, "//");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"hi!\"" + "'", str22, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str24, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"/\\\"///\\\\\\\"////hi!////\\\\\\\"///\\\"/\"" + "'", str32, "\"/\\\"///\\\\\\\"////hi!////\\\\\\\"///\\\"/\"");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/");
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"\"/" + "'", str7, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str15, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
    }
}

