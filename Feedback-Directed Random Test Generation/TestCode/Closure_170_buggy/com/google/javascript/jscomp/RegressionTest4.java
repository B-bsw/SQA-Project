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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal38, node39, node40);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node44, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        java.lang.Class<?> wildcardClass34 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node26, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node44, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal42, node43, node44);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node36, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        java.lang.Class<?> wildcardClass40 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        java.lang.Class<?> wildcardClass30 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        java.lang.Class<?> wildcardClass28 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        java.lang.Class<?> wildcardClass10 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        java.lang.Class<?> wildcardClass28 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal44, node45, node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node48, node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        java.lang.Class<?> wildcardClass28 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        java.lang.Class<?> wildcardClass36 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node36, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        java.lang.Class<?> wildcardClass14 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        java.lang.Class<?> wildcardClass40 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal46, node47, node48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal38, node39, node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node42, node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal44);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        java.lang.Class<?> wildcardClass34 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal40, node41, node42);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal18);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node36, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal44, node45, node46);
        java.lang.Class<?> wildcardClass48 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        java.lang.Class<?> wildcardClass28 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal42, node43, node44);
        java.lang.Class<?> wildcardClass46 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal48);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = null;
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal50, node51, node52);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = null;
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = null;
        boolean boolean57 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal54, node55, node56);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = null;
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal58, node59, node60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        java.lang.Class<?> wildcardClass32 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal38);
        java.lang.Class<?> wildcardClass40 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node36, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node32, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        boolean boolean51 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal48, node49, node50);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal38, node39, node40);
        java.lang.Class<?> wildcardClass42 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal40, node41, node42);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        java.lang.Class<?> wildcardClass38 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        java.lang.Class<?> wildcardClass36 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal42, node43, node44);
        java.lang.Class<?> wildcardClass46 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        boolean boolean45 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal42, node43, node44);
        java.lang.Class<?> wildcardClass46 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        java.lang.Class<?> wildcardClass32 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        java.lang.Class<?> wildcardClass32 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal44, node45, node46);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal38, node39, node40);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        java.lang.Class<?> wildcardClass32 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal44, node45, node46);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal36);
        java.lang.Class<?> wildcardClass38 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        boolean boolean45 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal46, node47, node48);
        java.lang.Class<?> wildcardClass50 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal38, node39, node40);
        java.lang.Class<?> wildcardClass42 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal36);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node32, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal32, node33, node34);
        java.lang.Class<?> wildcardClass36 = flowSensitiveInlineVariables1.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal42);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }
}

