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
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getCurrentNode();
        boolean boolean20 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        com.google.javascript.rhino.InputId inputId26 = nodeTraversal24.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal30.cfgs;
        nodeTraversal24.cfgs = nodeControlFlowGraphQueue32;
        int int34 = nodeTraversal24.getScopeDepth();
        com.google.javascript.jscomp.Scope scope35 = nodeTraversal24.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal24.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue36;
        java.lang.Class<?> wildcardClass38 = nodeControlFlowGraphQueue36.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        int int5 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler9, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback21);
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback23);
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback25);
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback27);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList36 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList36, nodeArray35);
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList36, callback38);
        nodeTraversal33.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList36);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList36);
        int int42 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node43 = nodeTraversal3.getCurrentNode();
        int int44 = nodeTraversal3.getScopeDepth();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal30.traverseRoots(nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler25, callback26, nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, callback24, nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray31);
        nodeTraversal13.traverseRoots(nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, callback9, nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, callback5, nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler2, callback3, nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray31);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertArrayEquals(nodeArray31, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getEnclosingFunction();
        int int24 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node25 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.Scope scope27 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node26, scope27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        boolean boolean15 = nodeTraversal3.hasScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Compiler compiler17 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.InputId inputId18 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.InputId inputId19 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(compiler17);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNull(inputId19);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope5 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue7 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope8 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        com.google.javascript.rhino.Node node13 = nodeTraversal12.getCurrentNode();
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal12.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.rhino.Node node19 = nodeTraversal18.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue20 = nodeTraversal18.cfgs;
        nodeTraversal12.cfgs = nodeControlFlowGraphQueue20;
        java.lang.String str22 = nodeTraversal12.getSourceName();
        com.google.javascript.rhino.Node node23 = nodeTraversal12.getEnclosingFunction();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler25, callback26, scopeCreator27);
        com.google.javascript.rhino.Node node29 = nodeTraversal28.getCurrentNode();
        com.google.javascript.rhino.InputId inputId30 = nodeTraversal28.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        com.google.javascript.rhino.Node node35 = nodeTraversal34.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal34.cfgs;
        nodeTraversal28.cfgs = nodeControlFlowGraphQueue36;
        java.lang.String str38 = nodeTraversal28.getSourceName();
        com.google.javascript.rhino.Node node39 = nodeTraversal28.getEnclosingFunction();
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType41 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError43 = nodeTraversal28.makeError(node40, diagnosticType41, strArray42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator46 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler44, callback45, scopeCreator46);
        com.google.javascript.rhino.Node node48 = nodeTraversal47.getCurrentNode();
        com.google.javascript.rhino.InputId inputId49 = nodeTraversal47.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback51 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler50, callback51, scopeCreator52);
        com.google.javascript.rhino.Node node54 = nodeTraversal53.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue55 = nodeTraversal53.cfgs;
        nodeTraversal47.cfgs = nodeControlFlowGraphQueue55;
        int int57 = nodeTraversal47.getScopeDepth();
        com.google.javascript.jscomp.Scope scope58 = nodeTraversal47.getScope();
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback61 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator62 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal63 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler60, callback61, scopeCreator62);
        com.google.javascript.rhino.Node node64 = nodeTraversal63.getCurrentNode();
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType66 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError70 = nodeTraversal63.makeError(node65, diagnosticType66, strArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        com.google.javascript.jscomp.JSError jSError74 = nodeTraversal47.makeError(node59, diagnosticType66, strArray73);
        com.google.javascript.jscomp.JSError jSError75 = nodeTraversal12.makeError(node24, diagnosticType41, strArray73);
        com.google.javascript.jscomp.Scope scope76 = nodeTraversal12.getScope();
        boolean boolean77 = nodeTraversal12.hasScope();
        com.google.javascript.rhino.Node node78 = nodeTraversal12.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue79 = nodeTraversal12.cfgs;
        java.lang.String str80 = nodeTraversal12.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue81 = nodeTraversal12.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue81;
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(diagnosticType41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError43);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(inputId49);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(scope58);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(diagnosticType66);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(jSError74);
        org.junit.Assert.assertNotNull(jSError75);
        org.junit.Assert.assertNull(scope76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue81);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        java.lang.String str16 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node17, scope18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        int int17 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node18 = nodeTraversal3.getCurrentNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph19 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, callback3, scopeCreator4);
        com.google.javascript.rhino.Node node6 = nodeTraversal5.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope7 = nodeTraversal5.getScope();
        int int8 = nodeTraversal5.getScopeDepth();
        com.google.javascript.rhino.Node node9 = nodeTraversal5.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal13.traverseRoots(nodeArray14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal21.traverseRoots(nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, callback17, nodeArray22);
        nodeTraversal13.traverseRoots(nodeArray22);
        nodeTraversal5.traverseRoots(nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray22);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertArrayEquals(nodeArray14, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler25, callback26, scopeCreator27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList31 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList31, nodeArray30);
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback33);
        nodeTraversal28.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback36);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        int int39 = nodeTraversal3.getScopeDepth();
        int int40 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue5 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        com.google.javascript.rhino.Node node13 = nodeTraversal12.getCurrentNode();
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal12.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.rhino.Node node19 = nodeTraversal18.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue20 = nodeTraversal18.cfgs;
        nodeTraversal12.cfgs = nodeControlFlowGraphQueue20;
        int int22 = nodeTraversal12.getScopeDepth();
        boolean boolean23 = nodeTraversal12.inGlobalScope();
        com.google.javascript.jscomp.Scope scope24 = nodeTraversal12.getScope();
        boolean boolean25 = nodeTraversal12.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator28 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler26, callback27, scopeCreator28);
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal29.traverseRoots(nodeArray30);
        nodeTraversal12.traverseRoots(nodeArray30);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType34 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, callback36, scopeCreator37);
        com.google.javascript.rhino.Node node39 = nodeTraversal38.getCurrentNode();
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal38.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        com.google.javascript.rhino.Node node45 = nodeTraversal44.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue46 = nodeTraversal44.cfgs;
        nodeTraversal38.cfgs = nodeControlFlowGraphQueue46;
        java.lang.String str48 = nodeTraversal38.getSourceName();
        com.google.javascript.rhino.Node node49 = nodeTraversal38.getEnclosingFunction();
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType51 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray52 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError53 = nodeTraversal38.makeError(node50, diagnosticType51, strArray52);
        com.google.javascript.jscomp.JSError jSError54 = nodeTraversal12.makeError(node33, diagnosticType34, strArray52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator57 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler55, callback56, scopeCreator57);
        com.google.javascript.rhino.Node node59 = nodeTraversal58.getCurrentNode();
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType61 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError65 = nodeTraversal58.makeError(node60, diagnosticType61, strArray64);
        com.google.javascript.jscomp.JSError jSError66 = nodeTraversal3.makeError(node8, diagnosticType34, strArray64);
        com.google.javascript.rhino.InputId inputId67 = nodeTraversal3.getInputId();
        boolean boolean68 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue5);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(diagnosticType34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(diagnosticType51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError53);
        org.junit.Assert.assertNotNull(jSError54);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(diagnosticType61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError65);
        org.junit.Assert.assertNotNull(jSError66);
        org.junit.Assert.assertNull(inputId67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope8 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal9.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue12;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.rhino.Node node18 = nodeTraversal17.getCurrentNode();
        com.google.javascript.rhino.InputId inputId19 = nodeTraversal17.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler20, callback21, scopeCreator22);
        com.google.javascript.rhino.Node node24 = nodeTraversal23.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal23.cfgs;
        nodeTraversal17.cfgs = nodeControlFlowGraphQueue25;
        int int27 = nodeTraversal17.getScopeDepth();
        boolean boolean28 = nodeTraversal17.inGlobalScope();
        com.google.javascript.jscomp.Scope scope29 = nodeTraversal17.getScope();
        boolean boolean30 = nodeTraversal17.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal34.traverseRoots(nodeArray35);
        nodeTraversal17.traverseRoots(nodeArray35);
        nodeTraversal3.traverseRoots(nodeArray35);
        java.lang.String str39 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        com.google.javascript.rhino.Node node44 = nodeTraversal43.getCurrentNode();
        com.google.javascript.rhino.InputId inputId45 = nodeTraversal43.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator48 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler46, callback47, scopeCreator48);
        com.google.javascript.rhino.Node node50 = nodeTraversal49.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue51 = nodeTraversal49.cfgs;
        nodeTraversal43.cfgs = nodeControlFlowGraphQueue51;
        int int53 = nodeTraversal43.getScopeDepth();
        com.google.javascript.jscomp.Scope scope54 = nodeTraversal43.getScope();
        java.lang.String str55 = nodeTraversal43.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator58 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler56, callback57, scopeCreator58);
        com.google.javascript.rhino.Node node60 = nodeTraversal59.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue61 = nodeTraversal59.cfgs;
        nodeTraversal43.cfgs = nodeControlFlowGraphQueue61;
        com.google.javascript.rhino.Node node63 = nodeTraversal43.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue64 = nodeTraversal43.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue64;
        com.google.javascript.jscomp.Scope scope66 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue61);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue64);
        org.junit.Assert.assertNull(scope66);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        int int15 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal3.getScope();
        int int18 = nodeTraversal3.getLineNumber();
        boolean boolean19 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        boolean boolean12 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph15 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNull(compiler14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node8 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str9 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph10 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler17 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node18 = nodeTraversal3.getCurrentNode();
        java.lang.String str19 = nodeTraversal3.getSourceName();
        int int20 = nodeTraversal3.getScopeDepth();
        int int21 = nodeTraversal3.getScopeDepth();
        java.lang.Class<?> wildcardClass22 = nodeTraversal3.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(compiler17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope5 = nodeTraversal3.getScope();
        int int6 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        com.google.javascript.rhino.Node node11 = nodeTraversal10.getCurrentNode();
        com.google.javascript.rhino.InputId inputId12 = nodeTraversal10.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        com.google.javascript.rhino.Node node17 = nodeTraversal16.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal16.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue18;
        int int20 = nodeTraversal10.getScopeDepth();
        com.google.javascript.jscomp.Scope scope21 = nodeTraversal10.getScope();
        java.lang.String str22 = nodeTraversal10.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal26.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue28;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.rhino.Node node34 = nodeTraversal33.getCurrentNode();
        com.google.javascript.rhino.InputId inputId35 = nodeTraversal33.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.rhino.Node node40 = nodeTraversal39.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal39.cfgs;
        nodeTraversal33.cfgs = nodeControlFlowGraphQueue41;
        int int43 = nodeTraversal33.getScopeDepth();
        com.google.javascript.jscomp.Scope scope44 = nodeTraversal33.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal33.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue45;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue45;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator50 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler48, callback49, scopeCreator50);
        com.google.javascript.rhino.Node node52 = nodeTraversal51.getCurrentNode();
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType54 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError58 = nodeTraversal51.makeError(node53, diagnosticType54, strArray57);
        com.google.javascript.rhino.Node node59 = nodeTraversal51.getEnclosingFunction();
        boolean boolean60 = nodeTraversal51.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue61 = nodeTraversal51.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue61;
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(diagnosticType54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue61);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        boolean boolean15 = nodeTraversal3.hasScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        int int17 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.Scope scope18 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        boolean boolean15 = nodeTraversal3.hasScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType23 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError27 = nodeTraversal20.makeError(node22, diagnosticType23, strArray26);
        com.google.javascript.rhino.Node node28 = nodeTraversal20.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = nodeTraversal20.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue29;
        com.google.javascript.jscomp.Scope scope31 = nodeTraversal3.getScope();
        boolean boolean32 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope33 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(diagnosticType23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue29);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(scope33);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback2 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler1, callback2, scopeCreator3);
        com.google.javascript.rhino.Node node5 = nodeTraversal4.getCurrentNode();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal4.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        com.google.javascript.rhino.Node node11 = nodeTraversal10.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal10.cfgs;
        nodeTraversal4.cfgs = nodeControlFlowGraphQueue12;
        java.lang.String str14 = nodeTraversal4.getSourceName();
        com.google.javascript.rhino.Node node15 = nodeTraversal4.getEnclosingFunction();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType17 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError19 = nodeTraversal4.makeError(node16, diagnosticType17, strArray18);
        com.google.javascript.rhino.Node node20 = nodeTraversal4.getCurrentNode();
        int int21 = nodeTraversal4.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        com.google.javascript.rhino.Node node26 = nodeTraversal25.getEnclosingFunction();
        int int27 = nodeTraversal25.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        nodeTraversal35.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback45);
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback47);
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback49);
        nodeTraversal25.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        nodeTraversal4.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback53);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(diagnosticType17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getEnclosingFunction();
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(compiler14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal11.traverseRoots(nodeArray12);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray12);
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        int int17 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(compiler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope5 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue7 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope8 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.Scope scope21 = nodeTraversal13.getScope();
        boolean boolean22 = nodeTraversal13.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler23 = nodeTraversal13.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.rhino.Node node32 = nodeTraversal31.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal36.traverseRoots(nodeArray37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        com.google.javascript.rhino.Node[] nodeArray45 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal44.traverseRoots(nodeArray45);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler39, callback40, nodeArray45);
        nodeTraversal36.traverseRoots(nodeArray45);
        nodeTraversal31.traverseRoots(nodeArray45);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler26, callback27, nodeArray45);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, callback25, nodeArray45);
        nodeTraversal13.traverseRoots(nodeArray45);
        nodeTraversal3.traverseRoots(nodeArray45);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput54 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(compiler23);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray45);
        org.junit.Assert.assertArrayEquals(nodeArray45, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        int int9 = nodeTraversal3.getScopeDepth();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue10 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue10;
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(inputId14);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal15.traverseRoots(nodeArray16);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray16);
        nodeTraversal3.traverseRoots(nodeArray16);
        com.google.javascript.rhino.Node node20 = nodeTraversal3.getEnclosingFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        int int19 = nodeTraversal3.getLineNumber();
        java.lang.String str20 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Compiler compiler21 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node22 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(compiler21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope5 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler7 = nodeTraversal3.getCompiler();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Scope scope9 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(compiler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node8 = nodeTraversal3.getCurrentNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph9 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        com.google.javascript.rhino.InputId inputId28 = nodeTraversal26.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node node33 = nodeTraversal32.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal32.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue34;
        int int36 = nodeTraversal26.getScopeDepth();
        com.google.javascript.jscomp.Scope scope37 = nodeTraversal26.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue38 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue38;
        com.google.javascript.jscomp.Scope scope40 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue38);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        boolean boolean13 = nodeTraversal3.hasScope();
        boolean boolean14 = nodeTraversal3.hasScope();
        boolean boolean15 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        com.google.javascript.rhino.Node node26 = nodeTraversal25.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal25.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue27;
        java.lang.String str29 = nodeTraversal19.getSourceName();
        com.google.javascript.rhino.Node node30 = nodeTraversal19.getEnclosingFunction();
        boolean boolean31 = nodeTraversal19.hasScope();
        boolean boolean32 = nodeTraversal19.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        com.google.javascript.rhino.Node node37 = nodeTraversal36.getCurrentNode();
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType39 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError43 = nodeTraversal36.makeError(node38, diagnosticType39, strArray42);
        com.google.javascript.rhino.Node node44 = nodeTraversal36.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal36.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue45;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue45;
        boolean boolean48 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator51 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal52 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler49, callback50, scopeCreator51);
        com.google.javascript.rhino.Node node53 = nodeTraversal52.getCurrentNode();
        com.google.javascript.rhino.InputId inputId54 = nodeTraversal52.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator57 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler55, callback56, scopeCreator57);
        com.google.javascript.rhino.Node node59 = nodeTraversal58.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue60 = nodeTraversal58.cfgs;
        nodeTraversal52.cfgs = nodeControlFlowGraphQueue60;
        int int62 = nodeTraversal52.getScopeDepth();
        boolean boolean63 = nodeTraversal52.inGlobalScope();
        com.google.javascript.jscomp.Scope scope64 = nodeTraversal52.getScope();
        boolean boolean65 = nodeTraversal52.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler66 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback67 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator68 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal69 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler66, callback67, scopeCreator68);
        com.google.javascript.rhino.Node[] nodeArray70 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal69.traverseRoots(nodeArray70);
        nodeTraversal52.traverseRoots(nodeArray70);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback74 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator75 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal76 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler73, callback74, scopeCreator75);
        com.google.javascript.rhino.Node node77 = nodeTraversal76.getCurrentNode();
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType79 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError83 = nodeTraversal76.makeError(node78, diagnosticType79, strArray82);
        com.google.javascript.rhino.Node node84 = nodeTraversal76.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler85 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback86 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator87 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal88 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler85, callback86, scopeCreator87);
        com.google.javascript.rhino.Node node89 = nodeTraversal88.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue90 = nodeTraversal88.cfgs;
        nodeTraversal76.cfgs = nodeControlFlowGraphQueue90;
        nodeTraversal52.cfgs = nodeControlFlowGraphQueue90;
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue93 = nodeTraversal52.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue93;
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(diagnosticType39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(scope64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(nodeArray70);
        org.junit.Assert.assertArrayEquals(nodeArray70, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(diagnosticType79);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError83);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNull(node89);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue90);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue93);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        int int24 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node25 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler26 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.Compiler compiler27 = nodeTraversal3.getCompiler();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(compiler26);
        org.junit.Assert.assertNull(compiler27);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        int int17 = nodeTraversal3.getScopeDepth();
        java.lang.Class<?> wildcardClass18 = nodeTraversal3.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue3 = nodeTraversal2.cfgs;
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue3);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        com.google.javascript.rhino.Node node26 = nodeTraversal25.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal25.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue27;
        java.lang.String str29 = nodeTraversal19.getSourceName();
        com.google.javascript.rhino.Node node30 = nodeTraversal19.getEnclosingFunction();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType32 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray33 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError34 = nodeTraversal19.makeError(node31, diagnosticType32, strArray33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, callback36, scopeCreator37);
        com.google.javascript.rhino.Node node39 = nodeTraversal38.getCurrentNode();
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal38.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        com.google.javascript.rhino.Node node45 = nodeTraversal44.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue46 = nodeTraversal44.cfgs;
        nodeTraversal38.cfgs = nodeControlFlowGraphQueue46;
        int int48 = nodeTraversal38.getScopeDepth();
        com.google.javascript.jscomp.Scope scope49 = nodeTraversal38.getScope();
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator53 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler51, callback52, scopeCreator53);
        com.google.javascript.rhino.Node node55 = nodeTraversal54.getCurrentNode();
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType57 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError61 = nodeTraversal54.makeError(node56, diagnosticType57, strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        com.google.javascript.jscomp.JSError jSError65 = nodeTraversal38.makeError(node50, diagnosticType57, strArray64);
        com.google.javascript.jscomp.JSError jSError66 = nodeTraversal3.makeError(node15, diagnosticType32, strArray64);
        com.google.javascript.jscomp.Scope scope67 = nodeTraversal3.getScope();
        boolean boolean68 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node69 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue70 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope71 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue72 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.InputId inputId73 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(diagnosticType32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(diagnosticType57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(jSError65);
        org.junit.Assert.assertNotNull(jSError66);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue70);
        org.junit.Assert.assertNull(scope71);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue72);
        org.junit.Assert.assertNull(inputId73);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue24 = nodeTraversal3.cfgs;
        boolean boolean25 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.InputId inputId26 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.Scope scope29 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node28, scope29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        com.google.javascript.rhino.Node node9 = nodeTraversal8.getCurrentNode();
        com.google.javascript.rhino.InputId inputId10 = nodeTraversal8.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node node15 = nodeTraversal14.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue16 = nodeTraversal14.cfgs;
        nodeTraversal8.cfgs = nodeControlFlowGraphQueue16;
        int int18 = nodeTraversal8.getScopeDepth();
        com.google.javascript.jscomp.Scope scope19 = nodeTraversal8.getScope();
        java.lang.String str20 = nodeTraversal8.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal24.cfgs;
        nodeTraversal8.cfgs = nodeControlFlowGraphQueue26;
        com.google.javascript.rhino.Node node28 = nodeTraversal8.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList36 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList36, nodeArray35);
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList36, callback38);
        nodeTraversal33.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList36);
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList36, callback41);
        nodeTraversal8.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList36);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList36);
        int int45 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator48 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler46, callback47, scopeCreator48);
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal49.traverseRoots(nodeArray50);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue52 = nodeTraversal49.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue52;
        java.lang.Class<?> wildcardClass54 = nodeControlFlowGraphQueue52.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertArrayEquals(nodeArray50, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        com.google.javascript.rhino.InputId inputId28 = nodeTraversal26.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node node33 = nodeTraversal32.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal32.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue34;
        int int36 = nodeTraversal26.getScopeDepth();
        com.google.javascript.jscomp.Scope scope37 = nodeTraversal26.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue38 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue38;
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal3.getInputId();
        java.lang.String str41 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node42 = nodeTraversal3.getEnclosingFunction();
        boolean boolean43 = nodeTraversal3.hasScope();
        boolean boolean44 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node45 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node46 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue38);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue6 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node8 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        boolean boolean15 = nodeTraversal3.hasScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Compiler compiler17 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.Scope scope20 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node18, node19, scope20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(compiler17);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getCurrentNode();
        java.lang.String str16 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node17 = nodeTraversal3.getCurrentNode();
        int int18 = nodeTraversal3.getScopeDepth();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope20 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(scope20);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node node23 = nodeTraversal22.getCurrentNode();
        com.google.javascript.rhino.InputId inputId24 = nodeTraversal22.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler25, callback26, scopeCreator27);
        com.google.javascript.rhino.Node node29 = nodeTraversal28.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue30 = nodeTraversal28.cfgs;
        nodeTraversal22.cfgs = nodeControlFlowGraphQueue30;
        int int32 = nodeTraversal22.getScopeDepth();
        com.google.javascript.jscomp.Scope scope33 = nodeTraversal22.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal22.cfgs;
        com.google.javascript.jscomp.Scope scope35 = nodeTraversal22.getScope();
        int int36 = nodeTraversal22.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator39 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler37, callback38, scopeCreator39);
        com.google.javascript.rhino.Node node41 = nodeTraversal40.getCurrentNode();
        com.google.javascript.rhino.InputId inputId42 = nodeTraversal40.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator45 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler43, callback44, scopeCreator45);
        com.google.javascript.rhino.Node node47 = nodeTraversal46.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue48 = nodeTraversal46.cfgs;
        nodeTraversal40.cfgs = nodeControlFlowGraphQueue48;
        int int50 = nodeTraversal40.getScopeDepth();
        boolean boolean51 = nodeTraversal40.inGlobalScope();
        com.google.javascript.jscomp.Scope scope52 = nodeTraversal40.getScope();
        boolean boolean53 = nodeTraversal40.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback55 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator56 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler54, callback55, scopeCreator56);
        com.google.javascript.rhino.Node[] nodeArray58 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal57.traverseRoots(nodeArray58);
        nodeTraversal40.traverseRoots(nodeArray58);
        nodeTraversal22.traverseRoots(nodeArray58);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray58);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray58);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray58);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, callback12, nodeArray58);
        nodeTraversal3.traverseRoots(nodeArray58);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertArrayEquals(nodeArray58, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getCurrentNode();
        java.lang.String str13 = nodeTraversal3.getSourceName();
        int int14 = nodeTraversal3.getScopeDepth();
        int int15 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList29 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList29, nodeArray28);
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList29, callback31);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList29);
        com.google.javascript.jscomp.Scope scope34 = nodeTraversal26.getScope();
        int int35 = nodeTraversal26.getScopeDepth();
        boolean boolean36 = nodeTraversal26.hasScope();
        boolean boolean37 = nodeTraversal26.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList44 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList44, nodeArray43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback46);
        nodeTraversal41.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        nodeTraversal20.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator53 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler51, callback52, scopeCreator53);
        com.google.javascript.rhino.Node[] nodeArray55 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal54.traverseRoots(nodeArray55);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler59 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback60 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator61 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal62 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler59, callback60, scopeCreator61);
        com.google.javascript.rhino.Node[] nodeArray63 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal62.traverseRoots(nodeArray63);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler57, callback58, nodeArray63);
        nodeTraversal54.traverseRoots(nodeArray63);
        nodeTraversal20.traverseRoots(nodeArray63);
        nodeTraversal3.traverseRoots(nodeArray63);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray28);
        org.junit.Assert.assertArrayEquals(nodeArray28, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertArrayEquals(nodeArray43, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertArrayEquals(nodeArray55, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertArrayEquals(nodeArray63, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getCurrentNode();
        java.lang.String str20 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        boolean boolean13 = nodeTraversal3.hasScope();
        boolean boolean14 = nodeTraversal3.hasScope();
        boolean boolean15 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput17 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(scope16);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getCurrentNode();
        int int8 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        com.google.javascript.rhino.Node node11 = nodeTraversal10.getCurrentNode();
        com.google.javascript.rhino.InputId inputId12 = nodeTraversal10.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        com.google.javascript.rhino.Node node17 = nodeTraversal16.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal16.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue18;
        java.lang.String str20 = nodeTraversal10.getSourceName();
        com.google.javascript.rhino.Node node21 = nodeTraversal10.getEnclosingFunction();
        boolean boolean22 = nodeTraversal10.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getEnclosingFunction();
        int int28 = nodeTraversal26.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList39 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList39, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler37, (java.util.List<com.google.javascript.rhino.Node>) nodeList39, callback41);
        nodeTraversal36.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList39);
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList39, callback44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList39, callback46);
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList39, callback48);
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList39, callback50);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator55 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal56 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler53, callback54, scopeCreator55);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        com.google.javascript.rhino.Node[] nodeArray58 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList59 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList59, nodeArray58);
        com.google.javascript.jscomp.NodeTraversal.Callback callback61 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler57, (java.util.List<com.google.javascript.rhino.Node>) nodeList59, callback61);
        nodeTraversal56.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList59);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList59);
        nodeTraversal10.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList59);
        com.google.javascript.jscomp.Compiler compiler66 = nodeTraversal10.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback68 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler69 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback70 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback72 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback74 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler75 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback76 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler77 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback78 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler79 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback80 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler81 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback82 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator83 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal84 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler81, callback82, scopeCreator83);
        com.google.javascript.rhino.Node[] nodeArray85 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal84.traverseRoots(nodeArray85);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler79, callback80, nodeArray85);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler77, callback78, nodeArray85);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler75, callback76, nodeArray85);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler73, callback74, nodeArray85);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler71, callback72, nodeArray85);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler69, callback70, nodeArray85);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler67, callback68, nodeArray85);
        nodeTraversal10.traverseRoots(nodeArray85);
        nodeTraversal3.traverseRoots(nodeArray85);
        java.lang.String str96 = nodeTraversal3.getSourceName();
        int int97 = nodeTraversal3.getScopeDepth();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeArray38);
        org.junit.Assert.assertArrayEquals(nodeArray38, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertArrayEquals(nodeArray58, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(compiler66);
        org.junit.Assert.assertNotNull(nodeArray85);
        org.junit.Assert.assertArrayEquals(nodeArray85, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue5 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope8 = nodeTraversal3.getScope();
        boolean boolean9 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.rhino.Node node14 = nodeTraversal13.getCurrentNode();
        com.google.javascript.rhino.InputId inputId15 = nodeTraversal13.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal13.cfgs = nodeControlFlowGraphQueue21;
        int int23 = nodeTraversal13.getScopeDepth();
        boolean boolean24 = nodeTraversal13.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal13.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList33 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList33, nodeArray32);
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList33, callback35);
        nodeTraversal30.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler26, (java.util.List<com.google.javascript.rhino.Node>) nodeList33, callback38);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList33);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList33);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue5);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertArrayEquals(nodeArray32, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal15.traverseRoots(nodeArray16);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray16);
        nodeTraversal3.traverseRoots(nodeArray16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList22 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList22, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler20, (java.util.List<com.google.javascript.rhino.Node>) nodeList22, callback24);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList22);
        com.google.javascript.jscomp.Compiler compiler27 = nodeTraversal3.getCompiler();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph28 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(compiler27);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        com.google.javascript.rhino.InputId inputId26 = nodeTraversal24.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal30.cfgs;
        nodeTraversal24.cfgs = nodeControlFlowGraphQueue32;
        int int34 = nodeTraversal24.getScopeDepth();
        boolean boolean35 = nodeTraversal24.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal24.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList44 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList44, nodeArray43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback46);
        nodeTraversal41.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler37, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback49);
        nodeTraversal24.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler9, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback53);
        com.google.javascript.jscomp.NodeTraversal.Callback callback55 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback55);
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback57);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node60 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertArrayEquals(nodeArray43, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Compiler compiler9 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(compiler9);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList12 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList12, nodeArray11);
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList12, callback14);
        nodeTraversal9.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList12);
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal9.getScope();
        int int18 = nodeTraversal9.getScopeDepth();
        boolean boolean19 = nodeTraversal9.hasScope();
        boolean boolean20 = nodeTraversal9.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList27 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList27, nodeArray26);
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler25, (java.util.List<com.google.javascript.rhino.Node>) nodeList27, callback29);
        nodeTraversal24.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList27);
        nodeTraversal9.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList27);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator36 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler34, callback35, scopeCreator36);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal37.traverseRoots(nodeArray38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator44 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal45 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler42, callback43, scopeCreator44);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal45.traverseRoots(nodeArray46);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler40, callback41, nodeArray46);
        nodeTraversal37.traverseRoots(nodeArray46);
        nodeTraversal3.traverseRoots(nodeArray46);
        com.google.javascript.rhino.Node node51 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node52 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str53 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertArrayEquals(nodeArray11, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeArray38);
        org.junit.Assert.assertArrayEquals(nodeArray38, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertArrayEquals(nodeArray46, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        boolean boolean13 = nodeTraversal3.hasScope();
        boolean boolean14 = nodeTraversal3.hasScope();
        int int15 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal3.getInputId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph17 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(inputId16);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler13 = nodeTraversal3.getCompiler();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        int int15 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        com.google.javascript.rhino.Node node26 = nodeTraversal25.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal25.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue27;
        java.lang.String str29 = nodeTraversal19.getSourceName();
        com.google.javascript.rhino.Node node30 = nodeTraversal19.getEnclosingFunction();
        com.google.javascript.rhino.Node node31 = nodeTraversal19.getCurrentNode();
        com.google.javascript.rhino.InputId inputId32 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        com.google.javascript.rhino.Node node37 = nodeTraversal36.getCurrentNode();
        com.google.javascript.rhino.InputId inputId38 = nodeTraversal36.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator41 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler39, callback40, scopeCreator41);
        com.google.javascript.rhino.Node node43 = nodeTraversal42.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue44 = nodeTraversal42.cfgs;
        nodeTraversal36.cfgs = nodeControlFlowGraphQueue44;
        int int46 = nodeTraversal36.getScopeDepth();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue47 = nodeTraversal36.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue47;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue47;
        int int50 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node51 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(compiler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(inputId32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node51);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue6 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getCurrentNode();
        int int8 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList29 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList29, nodeArray28);
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList29, callback31);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal43.traverseRoots(nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler38, callback39, nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, callback37, nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, callback35, nodeArray44);
        nodeTraversal26.traverseRoots(nodeArray44);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue50 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue50;
        com.google.javascript.rhino.Node node52 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope53 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNotNull(nodeArray28);
        org.junit.Assert.assertArrayEquals(nodeArray28, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertArrayEquals(nodeArray44, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(scope53);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getEnclosingFunction();
        boolean boolean13 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal3.cfgs;
        boolean boolean18 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId8 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node node15 = nodeTraversal14.getCurrentNode();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal14.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal20.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue22;
        int int24 = nodeTraversal14.getScopeDepth();
        boolean boolean25 = nodeTraversal14.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal14.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        nodeTraversal31.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback39);
        nodeTraversal14.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback42);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.Compiler compiler45 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.Compiler compiler46 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator50 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler48, callback49, scopeCreator50);
        com.google.javascript.rhino.Node node52 = nodeTraversal51.getEnclosingFunction();
        boolean boolean53 = nodeTraversal51.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler59 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback60 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator61 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal62 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler59, callback60, scopeCreator61);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.rhino.Node[] nodeArray64 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList65 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList65, nodeArray64);
        com.google.javascript.jscomp.NodeTraversal.Callback callback67 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler63, (java.util.List<com.google.javascript.rhino.Node>) nodeList65, callback67);
        nodeTraversal62.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList65);
        com.google.javascript.jscomp.NodeTraversal.Callback callback70 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler58, (java.util.List<com.google.javascript.rhino.Node>) nodeList65, callback70);
        com.google.javascript.jscomp.NodeTraversal.Callback callback72 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler57, (java.util.List<com.google.javascript.rhino.Node>) nodeList65, callback72);
        com.google.javascript.jscomp.NodeTraversal.Callback callback74 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler56, (java.util.List<com.google.javascript.rhino.Node>) nodeList65, callback74);
        com.google.javascript.jscomp.NodeTraversal.Callback callback76 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler55, (java.util.List<com.google.javascript.rhino.Node>) nodeList65, callback76);
        com.google.javascript.jscomp.NodeTraversal.Callback callback78 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler54, (java.util.List<com.google.javascript.rhino.Node>) nodeList65, callback78);
        nodeTraversal51.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList65);
        com.google.javascript.jscomp.NodeTraversal.Callback callback81 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, (java.util.List<com.google.javascript.rhino.Node>) nodeList65, callback81);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList65);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(compiler45);
        org.junit.Assert.assertNull(compiler46);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(nodeArray64);
        org.junit.Assert.assertArrayEquals(nodeArray64, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal9.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue12;
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler25, callback26, scopeCreator27);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal28.traverseRoots(nodeArray29);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, callback24, nodeArray29);
        nodeTraversal20.traverseRoots(nodeArray29);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray29);
        nodeTraversal3.traverseRoots(nodeArray29);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertArrayEquals(nodeArray29, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback2 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator3 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler1, callback2, scopeCreator3);
        com.google.javascript.rhino.Node node5 = nodeTraversal4.getCurrentNode();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal4.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        com.google.javascript.rhino.Node node11 = nodeTraversal10.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal10.cfgs;
        nodeTraversal4.cfgs = nodeControlFlowGraphQueue12;
        int int14 = nodeTraversal4.getScopeDepth();
        boolean boolean15 = nodeTraversal4.inGlobalScope();
        java.lang.String str16 = nodeTraversal4.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        com.google.javascript.rhino.InputId inputId22 = nodeTraversal20.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal26.cfgs;
        nodeTraversal20.cfgs = nodeControlFlowGraphQueue28;
        java.lang.String str30 = nodeTraversal20.getSourceName();
        com.google.javascript.rhino.Node node31 = nodeTraversal20.getEnclosingFunction();
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType33 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray34 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError35 = nodeTraversal20.makeError(node32, diagnosticType33, strArray34);
        com.google.javascript.rhino.Node node36 = nodeTraversal20.getCurrentNode();
        boolean boolean37 = nodeTraversal20.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        com.google.javascript.rhino.Node node42 = nodeTraversal41.getCurrentNode();
        com.google.javascript.rhino.InputId inputId43 = nodeTraversal41.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator46 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler44, callback45, scopeCreator46);
        com.google.javascript.rhino.Node node48 = nodeTraversal47.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue49 = nodeTraversal47.cfgs;
        nodeTraversal41.cfgs = nodeControlFlowGraphQueue49;
        int int51 = nodeTraversal41.getScopeDepth();
        com.google.javascript.jscomp.Scope scope52 = nodeTraversal41.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue53 = nodeTraversal41.cfgs;
        nodeTraversal20.cfgs = nodeControlFlowGraphQueue53;
        boolean boolean55 = nodeTraversal20.hasScope();
        com.google.javascript.rhino.InputId inputId56 = nodeTraversal20.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback59 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator60 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal61 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler58, callback59, scopeCreator60);
        com.google.javascript.rhino.Node node62 = nodeTraversal61.getCurrentNode();
        com.google.javascript.rhino.InputId inputId63 = nodeTraversal61.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback65 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator66 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal67 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler64, callback65, scopeCreator66);
        com.google.javascript.rhino.Node node68 = nodeTraversal67.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue69 = nodeTraversal67.cfgs;
        nodeTraversal61.cfgs = nodeControlFlowGraphQueue69;
        int int71 = nodeTraversal61.getScopeDepth();
        boolean boolean72 = nodeTraversal61.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue73 = nodeTraversal61.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler74 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler75 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback76 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator77 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal78 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler75, callback76, scopeCreator77);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler79 = null;
        com.google.javascript.rhino.Node[] nodeArray80 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList81 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList81, nodeArray80);
        com.google.javascript.jscomp.NodeTraversal.Callback callback83 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler79, (java.util.List<com.google.javascript.rhino.Node>) nodeList81, callback83);
        nodeTraversal78.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList81);
        com.google.javascript.jscomp.NodeTraversal.Callback callback86 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler74, (java.util.List<com.google.javascript.rhino.Node>) nodeList81, callback86);
        nodeTraversal61.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList81);
        com.google.javascript.jscomp.NodeTraversal.Callback callback89 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler57, (java.util.List<com.google.javascript.rhino.Node>) nodeList81, callback89);
        nodeTraversal20.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList81);
        nodeTraversal4.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList81);
        com.google.javascript.jscomp.NodeTraversal.Callback callback93 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, (java.util.List<com.google.javascript.rhino.Node>) nodeList81, callback93);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(diagnosticType33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId56);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(inputId63);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue73);
        org.junit.Assert.assertNotNull(nodeArray80);
        org.junit.Assert.assertArrayEquals(nodeArray80, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList29 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList29, nodeArray28);
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList29, callback31);
        nodeTraversal26.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal43.traverseRoots(nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler38, callback39, nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, callback37, nodeArray44);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, callback35, nodeArray44);
        nodeTraversal26.traverseRoots(nodeArray44);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue50 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue50;
        com.google.javascript.rhino.Node node52 = nodeTraversal3.getEnclosingFunction();
        boolean boolean53 = nodeTraversal3.hasScope();
        int int54 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNotNull(nodeArray28);
        org.junit.Assert.assertArrayEquals(nodeArray28, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertArrayEquals(nodeArray44, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getEnclosingFunction();
        int int24 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node25 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getEnclosingFunction();
        int int32 = nodeTraversal30.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator39 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler37, callback38, scopeCreator39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList43 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList43, nodeArray42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler41, (java.util.List<com.google.javascript.rhino.Node>) nodeList43, callback45);
        nodeTraversal40.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList43, callback48);
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList43, callback50);
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList43, callback52);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, (java.util.List<com.google.javascript.rhino.Node>) nodeList43, callback54);
        nodeTraversal30.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList43);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator59 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal60 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler57, callback58, scopeCreator59);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler61 = null;
        com.google.javascript.rhino.Node[] nodeArray62 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList63 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList63, nodeArray62);
        com.google.javascript.jscomp.NodeTraversal.Callback callback65 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler61, (java.util.List<com.google.javascript.rhino.Node>) nodeList63, callback65);
        nodeTraversal60.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList63);
        nodeTraversal30.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList63);
        com.google.javascript.jscomp.NodeTraversal.Callback callback69 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler26, (java.util.List<com.google.javascript.rhino.Node>) nodeList63, callback69);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList63);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertArrayEquals(nodeArray42, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeArray62);
        org.junit.Assert.assertArrayEquals(nodeArray62, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        boolean boolean15 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        boolean boolean17 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(compiler16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getCurrentNode();
        java.lang.String str13 = nodeTraversal3.getSourceName();
        int int14 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.Scope scope17 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node15, node16, scope17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue5 = nodeTraversal3.cfgs;
        boolean boolean6 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getEnclosingFunction();
        int int8 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope9 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        int int5 = nodeTraversal3.getLineNumber();
        java.lang.String str6 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId7 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue8 = nodeTraversal3.cfgs;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId8 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node node15 = nodeTraversal14.getCurrentNode();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal14.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal20.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue22;
        int int24 = nodeTraversal14.getScopeDepth();
        boolean boolean25 = nodeTraversal14.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal14.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        nodeTraversal31.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback39);
        nodeTraversal14.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback42);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.Compiler compiler45 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.Compiler compiler46 = nodeTraversal3.getCompiler();
        boolean boolean47 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Compiler compiler48 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(compiler45);
        org.junit.Assert.assertNull(compiler46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(compiler48);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str13 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph14 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        com.google.javascript.rhino.InputId inputId12 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node13 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList20 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList20, nodeArray19);
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler18, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback22);
        nodeTraversal17.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList20);
        com.google.javascript.jscomp.Scope scope25 = nodeTraversal17.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator28 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler26, callback27, scopeCreator28);
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal29.traverseRoots(nodeArray30);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal29.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        com.google.javascript.rhino.Node node37 = nodeTraversal36.getCurrentNode();
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType39 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError43 = nodeTraversal36.makeError(node38, diagnosticType39, strArray42);
        com.google.javascript.rhino.Node node44 = nodeTraversal36.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal36.cfgs;
        nodeTraversal29.cfgs = nodeControlFlowGraphQueue45;
        nodeTraversal17.cfgs = nodeControlFlowGraphQueue45;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue45;
        java.lang.Class<?> wildcardClass49 = nodeControlFlowGraphQueue45.getClass();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(diagnosticType39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler13 = nodeTraversal3.getCompiler();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        int int15 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal3.getScope();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(compiler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(scope17);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        boolean boolean13 = nodeTraversal3.hasScope();
        boolean boolean14 = nodeTraversal3.hasScope();
        int int15 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(inputId16);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler17 = nodeTraversal3.getCompiler();
        boolean boolean18 = nodeTraversal3.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope20 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(compiler17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(scope20);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList18 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList18, nodeArray17);
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, (java.util.List<com.google.javascript.rhino.Node>) nodeList18, callback20);
        nodeTraversal15.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal32.traverseRoots(nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, callback28, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler25, callback26, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, callback24, nodeArray33);
        nodeTraversal15.traverseRoots(nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, callback9, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray33);
        nodeTraversal3.traverseRoots(nodeArray33);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput43 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue6 = nodeTraversal3.cfgs;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue6);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        int int24 = nodeTraversal3.getScopeDepth();
        boolean boolean25 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope26 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node27 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId28 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(inputId28);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        boolean boolean15 = nodeTraversal3.hasScope();
        boolean boolean16 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList23 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList23, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, (java.util.List<com.google.javascript.rhino.Node>) nodeList23, callback25);
        nodeTraversal20.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList23);
        com.google.javascript.jscomp.Scope scope28 = nodeTraversal20.getScope();
        int int29 = nodeTraversal20.getScopeDepth();
        boolean boolean30 = nodeTraversal20.hasScope();
        boolean boolean31 = nodeTraversal20.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList38 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList38, nodeArray37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList38, callback40);
        nodeTraversal35.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        nodeTraversal20.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList38);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        boolean boolean15 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        com.google.javascript.rhino.Node node26 = nodeTraversal25.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal25.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue27;
        java.lang.String str29 = nodeTraversal19.getSourceName();
        com.google.javascript.rhino.Node node30 = nodeTraversal19.getEnclosingFunction();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType32 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray33 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError34 = nodeTraversal19.makeError(node31, diagnosticType32, strArray33);
        com.google.javascript.rhino.Node node35 = nodeTraversal19.getCurrentNode();
        boolean boolean36 = nodeTraversal19.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator39 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler37, callback38, scopeCreator39);
        com.google.javascript.rhino.Node node41 = nodeTraversal40.getCurrentNode();
        com.google.javascript.rhino.InputId inputId42 = nodeTraversal40.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator45 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler43, callback44, scopeCreator45);
        com.google.javascript.rhino.Node node47 = nodeTraversal46.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue48 = nodeTraversal46.cfgs;
        nodeTraversal40.cfgs = nodeControlFlowGraphQueue48;
        int int50 = nodeTraversal40.getScopeDepth();
        com.google.javascript.jscomp.Scope scope51 = nodeTraversal40.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue52 = nodeTraversal40.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue52;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue52;
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(diagnosticType32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(inputId42);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(scope51);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue52);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        com.google.javascript.rhino.InputId inputId28 = nodeTraversal26.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node node33 = nodeTraversal32.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal32.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue34;
        int int36 = nodeTraversal26.getScopeDepth();
        com.google.javascript.jscomp.Scope scope37 = nodeTraversal26.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue38 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue38;
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal3.getInputId();
        java.lang.String str41 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node42 = nodeTraversal3.getEnclosingFunction();
        int int43 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue38);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        boolean boolean13 = nodeTraversal3.hasScope();
        boolean boolean14 = nodeTraversal3.hasScope();
        boolean boolean15 = nodeTraversal3.inGlobalScope();
        boolean boolean16 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        int int24 = nodeTraversal3.getScopeDepth();
        boolean boolean25 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope26 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal30.traverseRoots(nodeArray31);
        nodeTraversal3.traverseRoots(nodeArray31);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertArrayEquals(nodeArray31, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal15.traverseRoots(nodeArray16);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node node23 = nodeTraversal22.getCurrentNode();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType25 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError29 = nodeTraversal22.makeError(node24, diagnosticType25, strArray28);
        com.google.javascript.rhino.Node node30 = nodeTraversal22.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal22.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue31;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue31;
        boolean boolean34 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(diagnosticType25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue6 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        com.google.javascript.rhino.Node node11 = nodeTraversal10.getCurrentNode();
        com.google.javascript.rhino.InputId inputId12 = nodeTraversal10.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        com.google.javascript.rhino.Node node17 = nodeTraversal16.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal16.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue18;
        java.lang.String str20 = nodeTraversal10.getSourceName();
        com.google.javascript.rhino.Node node21 = nodeTraversal10.getEnclosingFunction();
        boolean boolean22 = nodeTraversal10.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        com.google.javascript.rhino.Node node28 = nodeTraversal27.getEnclosingFunction();
        boolean boolean29 = nodeTraversal27.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, callback36, scopeCreator37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList41 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList41, nodeArray40);
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler39, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback43);
        nodeTraversal38.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList41);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback46);
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback48);
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback50);
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback52);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback54);
        nodeTraversal27.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList41);
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback57);
        nodeTraversal10.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList41);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList41);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler61 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler62 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback63 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator64 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal65 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler62, callback63, scopeCreator64);
        com.google.javascript.rhino.Node node66 = nodeTraversal65.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler67 = nodeTraversal65.getCompiler();
        com.google.javascript.jscomp.Compiler compiler68 = nodeTraversal65.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler69 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler72 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler74 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback75 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator76 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal77 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler74, callback75, scopeCreator76);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler78 = null;
        com.google.javascript.rhino.Node[] nodeArray79 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList80 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList80, nodeArray79);
        com.google.javascript.jscomp.NodeTraversal.Callback callback82 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler78, (java.util.List<com.google.javascript.rhino.Node>) nodeList80, callback82);
        nodeTraversal77.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList80);
        com.google.javascript.jscomp.NodeTraversal.Callback callback85 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler73, (java.util.List<com.google.javascript.rhino.Node>) nodeList80, callback85);
        com.google.javascript.jscomp.NodeTraversal.Callback callback87 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler72, (java.util.List<com.google.javascript.rhino.Node>) nodeList80, callback87);
        com.google.javascript.jscomp.NodeTraversal.Callback callback89 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler71, (java.util.List<com.google.javascript.rhino.Node>) nodeList80, callback89);
        com.google.javascript.jscomp.NodeTraversal.Callback callback91 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler70, (java.util.List<com.google.javascript.rhino.Node>) nodeList80, callback91);
        com.google.javascript.jscomp.NodeTraversal.Callback callback93 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler69, (java.util.List<com.google.javascript.rhino.Node>) nodeList80, callback93);
        nodeTraversal65.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList80);
        com.google.javascript.jscomp.NodeTraversal.Callback callback96 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler61, (java.util.List<com.google.javascript.rhino.Node>) nodeList80, callback96);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList80);
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertArrayEquals(nodeArray40, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(compiler67);
        org.junit.Assert.assertNull(compiler68);
        org.junit.Assert.assertNotNull(nodeArray79);
        org.junit.Assert.assertArrayEquals(nodeArray79, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        boolean boolean15 = nodeTraversal3.hasScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType23 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError27 = nodeTraversal20.makeError(node22, diagnosticType23, strArray26);
        com.google.javascript.rhino.Node node28 = nodeTraversal20.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = nodeTraversal20.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue29;
        com.google.javascript.jscomp.Scope scope31 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Scope scope32 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(diagnosticType23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue29);
        org.junit.Assert.assertNull(scope31);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal14.traverseRoots(nodeArray15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal22.traverseRoots(nodeArray23);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray23);
        nodeTraversal14.traverseRoots(nodeArray23);
        nodeTraversal9.traverseRoots(nodeArray23);
        nodeTraversal3.traverseRoots(nodeArray23);
        int int29 = nodeTraversal3.getLineNumber();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue30 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node31 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node32 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList24 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList24, nodeArray23);
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback26);
        nodeTraversal21.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList24);
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback29);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList24);
        com.google.javascript.jscomp.Compiler compiler32 = nodeTraversal3.getCompiler();
        int int33 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator36 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler34, callback35, scopeCreator36);
        com.google.javascript.rhino.Node node38 = nodeTraversal37.getCurrentNode();
        com.google.javascript.rhino.InputId inputId39 = nodeTraversal37.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        com.google.javascript.rhino.Node node44 = nodeTraversal43.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal43.cfgs;
        nodeTraversal37.cfgs = nodeControlFlowGraphQueue45;
        int int47 = nodeTraversal37.getScopeDepth();
        com.google.javascript.jscomp.Scope scope48 = nodeTraversal37.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator51 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal52 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler49, callback50, scopeCreator51);
        com.google.javascript.rhino.Node node53 = nodeTraversal52.getCurrentNode();
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType55 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError59 = nodeTraversal52.makeError(node54, diagnosticType55, strArray58);
        com.google.javascript.rhino.Node node60 = nodeTraversal52.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler61 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback62 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator63 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal64 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler61, callback62, scopeCreator63);
        com.google.javascript.rhino.Node node65 = nodeTraversal64.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue66 = nodeTraversal64.cfgs;
        nodeTraversal52.cfgs = nodeControlFlowGraphQueue66;
        nodeTraversal37.cfgs = nodeControlFlowGraphQueue66;
        com.google.javascript.rhino.InputId inputId69 = nodeTraversal37.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue70 = nodeTraversal37.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue70;
        com.google.javascript.jscomp.Scope scope72 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(compiler32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(diagnosticType55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue66);
        org.junit.Assert.assertNull(inputId69);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue70);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, callback12, nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        int int27 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal31.traverseRoots(nodeArray32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal39.traverseRoots(nodeArray40);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, callback35, nodeArray40);
        nodeTraversal31.traverseRoots(nodeArray40);
        nodeTraversal3.traverseRoots(nodeArray40);
        com.google.javascript.jscomp.Scope scope45 = nodeTraversal3.getScope();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertArrayEquals(nodeArray32, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertArrayEquals(nodeArray40, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(scope45);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        com.google.javascript.rhino.InputId inputId28 = nodeTraversal26.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node node33 = nodeTraversal32.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal32.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue34;
        int int36 = nodeTraversal26.getScopeDepth();
        com.google.javascript.jscomp.Scope scope37 = nodeTraversal26.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue38 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue38;
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope41 = nodeTraversal3.getScope();
        java.lang.String str42 = nodeTraversal3.getSourceName();
        boolean boolean43 = nodeTraversal3.inGlobalScope();
        boolean boolean44 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue38);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback4 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator5 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler3, callback4, scopeCreator5);
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal6.traverseRoots(nodeArray7);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal6.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.rhino.Node node14 = nodeTraversal13.getCurrentNode();
        com.google.javascript.rhino.InputId inputId15 = nodeTraversal13.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal13.cfgs = nodeControlFlowGraphQueue21;
        java.lang.String str23 = nodeTraversal13.getSourceName();
        com.google.javascript.rhino.Node node24 = nodeTraversal13.getEnclosingFunction();
        boolean boolean25 = nodeTraversal13.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getEnclosingFunction();
        boolean boolean32 = nodeTraversal30.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList44 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList44, nodeArray43);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback46);
        nodeTraversal41.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler37, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback49);
        com.google.javascript.jscomp.NodeTraversal.Callback callback51 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback51);
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback53);
        com.google.javascript.jscomp.NodeTraversal.Callback callback55 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback55);
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback57);
        nodeTraversal30.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback60 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler26, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback60);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        nodeTraversal6.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList44);
        com.google.javascript.jscomp.NodeTraversal.Callback callback64 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler2, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback64);
        com.google.javascript.jscomp.NodeTraversal.Callback callback66 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler1, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback66);
        com.google.javascript.jscomp.NodeTraversal.Callback callback68 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, (java.util.List<com.google.javascript.rhino.Node>) nodeList44, callback68);
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertArrayEquals(nodeArray7, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertArrayEquals(nodeArray43, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope5 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        com.google.javascript.rhino.Node node11 = nodeTraversal10.getEnclosingFunction();
        int int12 = nodeTraversal10.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList23 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList23, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, (java.util.List<com.google.javascript.rhino.Node>) nodeList23, callback25);
        nodeTraversal20.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList23);
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, (java.util.List<com.google.javascript.rhino.Node>) nodeList23, callback28);
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, (java.util.List<com.google.javascript.rhino.Node>) nodeList23, callback30);
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList23, callback32);
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, (java.util.List<com.google.javascript.rhino.Node>) nodeList23, callback34);
        nodeTraversal10.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator39 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler37, callback38, scopeCreator39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList43 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList43, nodeArray42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback45 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler41, (java.util.List<com.google.javascript.rhino.Node>) nodeList43, callback45);
        nodeTraversal40.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList43);
        nodeTraversal10.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList43);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList43);
        boolean boolean50 = nodeTraversal3.hasScope();
        java.lang.Class<?> wildcardClass51 = nodeTraversal3.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertArrayEquals(nodeArray42, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal15.traverseRoots(nodeArray16);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node node23 = nodeTraversal22.getCurrentNode();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType25 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError29 = nodeTraversal22.makeError(node24, diagnosticType25, strArray28);
        com.google.javascript.rhino.Node node30 = nodeTraversal22.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal22.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue31;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue31;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.Scope scope36 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node34, node35, scope36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(diagnosticType25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getCurrentNode();
        boolean boolean20 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        com.google.javascript.rhino.InputId inputId26 = nodeTraversal24.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal30.cfgs;
        nodeTraversal24.cfgs = nodeControlFlowGraphQueue32;
        int int34 = nodeTraversal24.getScopeDepth();
        com.google.javascript.jscomp.Scope scope35 = nodeTraversal24.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal24.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue36;
        boolean boolean38 = nodeTraversal3.hasScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule39 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal9.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node node16 = nodeTraversal15.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal15.cfgs;
        nodeTraversal9.cfgs = nodeControlFlowGraphQueue17;
        int int19 = nodeTraversal9.getScopeDepth();
        boolean boolean20 = nodeTraversal9.inGlobalScope();
        com.google.javascript.jscomp.Scope scope21 = nodeTraversal9.getScope();
        boolean boolean22 = nodeTraversal9.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal26.traverseRoots(nodeArray27);
        nodeTraversal9.traverseRoots(nodeArray27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType31 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.rhino.Node node36 = nodeTraversal35.getCurrentNode();
        com.google.javascript.rhino.InputId inputId37 = nodeTraversal35.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        com.google.javascript.rhino.Node node42 = nodeTraversal41.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue43 = nodeTraversal41.cfgs;
        nodeTraversal35.cfgs = nodeControlFlowGraphQueue43;
        java.lang.String str45 = nodeTraversal35.getSourceName();
        com.google.javascript.rhino.Node node46 = nodeTraversal35.getEnclosingFunction();
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType48 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray49 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError50 = nodeTraversal35.makeError(node47, diagnosticType48, strArray49);
        com.google.javascript.jscomp.JSError jSError51 = nodeTraversal9.makeError(node30, diagnosticType31, strArray49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator54 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler52, callback53, scopeCreator54);
        com.google.javascript.rhino.Node node56 = nodeTraversal55.getCurrentNode();
        com.google.javascript.rhino.InputId inputId57 = nodeTraversal55.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback59 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator60 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal61 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler58, callback59, scopeCreator60);
        com.google.javascript.rhino.Node node62 = nodeTraversal61.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue63 = nodeTraversal61.cfgs;
        nodeTraversal55.cfgs = nodeControlFlowGraphQueue63;
        java.lang.String str65 = nodeTraversal55.getSourceName();
        com.google.javascript.rhino.Node node66 = nodeTraversal55.getEnclosingFunction();
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType68 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray69 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError70 = nodeTraversal55.makeError(node67, diagnosticType68, strArray69);
        com.google.javascript.jscomp.JSError jSError71 = nodeTraversal3.makeError(node5, diagnosticType31, strArray69);
        com.google.javascript.rhino.Node node72 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback74 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator75 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal76 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler73, callback74, scopeCreator75);
        com.google.javascript.rhino.Node node77 = nodeTraversal76.getCurrentNode();
        com.google.javascript.rhino.InputId inputId78 = nodeTraversal76.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler79 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback80 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator81 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal82 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler79, callback80, scopeCreator81);
        com.google.javascript.rhino.Node node83 = nodeTraversal82.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue84 = nodeTraversal82.cfgs;
        nodeTraversal76.cfgs = nodeControlFlowGraphQueue84;
        int int86 = nodeTraversal76.getScopeDepth();
        com.google.javascript.jscomp.Scope scope87 = nodeTraversal76.getScope();
        java.lang.String str88 = nodeTraversal76.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler89 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback90 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator91 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal92 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler89, callback90, scopeCreator91);
        com.google.javascript.rhino.Node node93 = nodeTraversal92.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue94 = nodeTraversal92.cfgs;
        nodeTraversal76.cfgs = nodeControlFlowGraphQueue94;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue94;
        com.google.javascript.rhino.Node node97 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(diagnosticType31);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(diagnosticType48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError50);
        org.junit.Assert.assertNotNull(jSError51);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(diagnosticType68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError70);
        org.junit.Assert.assertNotNull(jSError71);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(inputId78);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(scope87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNull(node93);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue94);
        org.junit.Assert.assertNull(node97);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        com.google.javascript.rhino.Node node26 = nodeTraversal25.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal25.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue27;
        java.lang.String str29 = nodeTraversal19.getSourceName();
        com.google.javascript.rhino.Node node30 = nodeTraversal19.getEnclosingFunction();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType32 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray33 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError34 = nodeTraversal19.makeError(node31, diagnosticType32, strArray33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, callback36, scopeCreator37);
        com.google.javascript.rhino.Node node39 = nodeTraversal38.getCurrentNode();
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal38.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        com.google.javascript.rhino.Node node45 = nodeTraversal44.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue46 = nodeTraversal44.cfgs;
        nodeTraversal38.cfgs = nodeControlFlowGraphQueue46;
        int int48 = nodeTraversal38.getScopeDepth();
        com.google.javascript.jscomp.Scope scope49 = nodeTraversal38.getScope();
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator53 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler51, callback52, scopeCreator53);
        com.google.javascript.rhino.Node node55 = nodeTraversal54.getCurrentNode();
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType57 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError61 = nodeTraversal54.makeError(node56, diagnosticType57, strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        com.google.javascript.jscomp.JSError jSError65 = nodeTraversal38.makeError(node50, diagnosticType57, strArray64);
        com.google.javascript.jscomp.JSError jSError66 = nodeTraversal3.makeError(node15, diagnosticType32, strArray64);
        com.google.javascript.jscomp.Scope scope67 = nodeTraversal3.getScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput68 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(diagnosticType32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(diagnosticType57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(jSError65);
        org.junit.Assert.assertNotNull(jSError66);
        org.junit.Assert.assertNull(scope67);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, callback12, nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal3.cfgs;
        int int28 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.InputId inputId29 = nodeTraversal3.getInputId();
        int int30 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getCurrentNode();
        java.lang.String str16 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node17 = nodeTraversal3.getCurrentNode();
        int int18 = nodeTraversal3.getScopeDepth();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue19 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler20, callback21, scopeCreator22);
        com.google.javascript.rhino.Node node24 = nodeTraversal23.getCurrentNode();
        com.google.javascript.rhino.InputId inputId25 = nodeTraversal23.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator28 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler26, callback27, scopeCreator28);
        com.google.javascript.rhino.Node node30 = nodeTraversal29.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal29.cfgs;
        nodeTraversal23.cfgs = nodeControlFlowGraphQueue31;
        java.lang.String str33 = nodeTraversal23.getSourceName();
        com.google.javascript.rhino.Node node34 = nodeTraversal23.getEnclosingFunction();
        int int35 = nodeTraversal23.getLineNumber();
        com.google.javascript.rhino.Node node36 = nodeTraversal23.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue37 = nodeTraversal23.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue37;
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue37);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal14.traverseRoots(nodeArray15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal22.traverseRoots(nodeArray23);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray23);
        nodeTraversal14.traverseRoots(nodeArray23);
        nodeTraversal9.traverseRoots(nodeArray23);
        nodeTraversal3.traverseRoots(nodeArray23);
        int int29 = nodeTraversal3.getLineNumber();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue30 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        com.google.javascript.rhino.Node node35 = nodeTraversal34.getCurrentNode();
        com.google.javascript.rhino.InputId inputId36 = nodeTraversal34.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator39 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler37, callback38, scopeCreator39);
        com.google.javascript.rhino.Node node41 = nodeTraversal40.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue42 = nodeTraversal40.cfgs;
        nodeTraversal34.cfgs = nodeControlFlowGraphQueue42;
        int int44 = nodeTraversal34.getScopeDepth();
        boolean boolean45 = nodeTraversal34.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue46 = nodeTraversal34.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback49 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator50 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler48, callback49, scopeCreator50);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.rhino.Node[] nodeArray53 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList54 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList54, nodeArray53);
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler52, (java.util.List<com.google.javascript.rhino.Node>) nodeList54, callback56);
        nodeTraversal51.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList54);
        com.google.javascript.jscomp.NodeTraversal.Callback callback59 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, (java.util.List<com.google.javascript.rhino.Node>) nodeList54, callback59);
        nodeTraversal34.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList54);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList54);
        com.google.javascript.jscomp.Scope scope63 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue30);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(inputId36);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue46);
        org.junit.Assert.assertNotNull(nodeArray53);
        org.junit.Assert.assertArrayEquals(nodeArray53, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, callback3, scopeCreator4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList8 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList8, nodeArray7);
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, (java.util.List<com.google.javascript.rhino.Node>) nodeList8, callback10);
        nodeTraversal5.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList8);
        com.google.javascript.jscomp.Scope scope13 = nodeTraversal5.getScope();
        int int14 = nodeTraversal5.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler15 = nodeTraversal5.getCompiler();
        boolean boolean16 = nodeTraversal5.inGlobalScope();
        int int17 = nodeTraversal5.getLineNumber();
        com.google.javascript.rhino.Node node18 = nodeTraversal5.getEnclosingFunction();
        int int19 = nodeTraversal5.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler20, callback21, scopeCreator22);
        com.google.javascript.rhino.Node node24 = nodeTraversal23.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler25, callback26, scopeCreator27);
        com.google.javascript.rhino.Node node29 = nodeTraversal28.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal33.traverseRoots(nodeArray34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal41.traverseRoots(nodeArray42);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler36, callback37, nodeArray42);
        nodeTraversal33.traverseRoots(nodeArray42);
        nodeTraversal28.traverseRoots(nodeArray42);
        nodeTraversal23.traverseRoots(nodeArray42);
        nodeTraversal5.traverseRoots(nodeArray42);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray42);
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertArrayEquals(nodeArray7, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(compiler15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertArrayEquals(nodeArray34, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertArrayEquals(nodeArray42, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal9.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue12;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.rhino.Node node18 = nodeTraversal17.getCurrentNode();
        com.google.javascript.rhino.InputId inputId19 = nodeTraversal17.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler20, callback21, scopeCreator22);
        com.google.javascript.rhino.Node node24 = nodeTraversal23.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue25 = nodeTraversal23.cfgs;
        nodeTraversal17.cfgs = nodeControlFlowGraphQueue25;
        int int27 = nodeTraversal17.getScopeDepth();
        boolean boolean28 = nodeTraversal17.inGlobalScope();
        com.google.javascript.jscomp.Scope scope29 = nodeTraversal17.getScope();
        boolean boolean30 = nodeTraversal17.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal34.traverseRoots(nodeArray35);
        nodeTraversal17.traverseRoots(nodeArray35);
        nodeTraversal3.traverseRoots(nodeArray35);
        java.lang.String str39 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        com.google.javascript.rhino.Node node44 = nodeTraversal43.getCurrentNode();
        com.google.javascript.rhino.InputId inputId45 = nodeTraversal43.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator48 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler46, callback47, scopeCreator48);
        com.google.javascript.rhino.Node node50 = nodeTraversal49.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue51 = nodeTraversal49.cfgs;
        nodeTraversal43.cfgs = nodeControlFlowGraphQueue51;
        int int53 = nodeTraversal43.getScopeDepth();
        com.google.javascript.jscomp.Scope scope54 = nodeTraversal43.getScope();
        java.lang.String str55 = nodeTraversal43.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator58 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler56, callback57, scopeCreator58);
        com.google.javascript.rhino.Node node60 = nodeTraversal59.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue61 = nodeTraversal59.cfgs;
        nodeTraversal43.cfgs = nodeControlFlowGraphQueue61;
        com.google.javascript.rhino.Node node63 = nodeTraversal43.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue64 = nodeTraversal43.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue64;
        com.google.javascript.jscomp.Compiler compiler66 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue61);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue64);
        org.junit.Assert.assertNull(compiler66);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback6 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler5, callback6, scopeCreator7);
        com.google.javascript.rhino.Node node9 = nodeTraversal8.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal13.traverseRoots(nodeArray14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal21.traverseRoots(nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, callback17, nodeArray22);
        nodeTraversal13.traverseRoots(nodeArray22);
        nodeTraversal8.traverseRoots(nodeArray22);
        nodeTraversal3.traverseRoots(nodeArray22);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertArrayEquals(nodeArray14, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal11.traverseRoots(nodeArray12);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray12);
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        int int17 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.Scope scope19 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node18, scope19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(compiler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node node15 = nodeTraversal14.getCurrentNode();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal14.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal20.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue22;
        int int24 = nodeTraversal14.getScopeDepth();
        boolean boolean25 = nodeTraversal14.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal14.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        nodeTraversal31.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback39);
        nodeTraversal14.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.rhino.InputId inputId43 = nodeTraversal3.getInputId();
        int int44 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node45 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope8 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getCurrentNode();
        int int10 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node11, scope12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        boolean boolean12 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler13 = nodeTraversal3.getCompiler();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule14 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(compiler13);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node node15 = nodeTraversal14.getCurrentNode();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal14.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal20.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue22;
        int int24 = nodeTraversal14.getScopeDepth();
        boolean boolean25 = nodeTraversal14.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal14.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        nodeTraversal31.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback39);
        nodeTraversal14.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.rhino.InputId inputId43 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node44 = nodeTraversal3.getEnclosingFunction();
        java.lang.String str45 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        com.google.javascript.rhino.Node node28 = nodeTraversal27.getCurrentNode();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType30 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError34 = nodeTraversal27.makeError(node29, diagnosticType30, strArray33);
        com.google.javascript.rhino.Node node35 = nodeTraversal27.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.rhino.Node node40 = nodeTraversal39.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal39.cfgs;
        nodeTraversal27.cfgs = nodeControlFlowGraphQueue41;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue41;
        boolean boolean44 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.InputId inputId45 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator51 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal52 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler49, callback50, scopeCreator51);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList55 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList55, nodeArray54);
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler53, (java.util.List<com.google.javascript.rhino.Node>) nodeList55, callback57);
        nodeTraversal52.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList55);
        com.google.javascript.jscomp.NodeTraversal.Callback callback60 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler48, (java.util.List<com.google.javascript.rhino.Node>) nodeList55, callback60);
        com.google.javascript.jscomp.NodeTraversal.Callback callback62 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, (java.util.List<com.google.javascript.rhino.Node>) nodeList55, callback62);
        com.google.javascript.jscomp.NodeTraversal.Callback callback64 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler46, (java.util.List<com.google.javascript.rhino.Node>) nodeList55, callback64);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList55);
        boolean boolean67 = nodeTraversal3.inGlobalScope();
        java.lang.Class<?> wildcardClass68 = nodeTraversal3.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(diagnosticType30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertArrayEquals(nodeArray54, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal3.cfgs;
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList20 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList20, nodeArray19);
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler18, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback22);
        nodeTraversal17.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList20);
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback25);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList20);
        int int28 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList37 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList37, nodeArray36);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler35, (java.util.List<com.google.javascript.rhino.Node>) nodeList37, callback39);
        nodeTraversal34.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList37, callback42);
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList37, callback44);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph47 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertArrayEquals(nodeArray36, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId14 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal26.traverseRoots(nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray27);
        nodeTraversal3.traverseRoots(nodeArray27);
        com.google.javascript.rhino.Node node34 = nodeTraversal3.getCurrentNode();
        int int35 = nodeTraversal3.getLineNumber();
        boolean boolean36 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        com.google.javascript.rhino.InputId inputId28 = nodeTraversal26.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node node33 = nodeTraversal32.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal32.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue34;
        int int36 = nodeTraversal26.getScopeDepth();
        com.google.javascript.jscomp.Scope scope37 = nodeTraversal26.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue38 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue38;
        java.lang.String str40 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        int int9 = nodeTraversal3.getScopeDepth();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue10 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node node16 = nodeTraversal15.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal15.getScope();
        com.google.javascript.rhino.Node node18 = nodeTraversal15.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler19 = nodeTraversal15.getCompiler();
        java.lang.String str20 = nodeTraversal15.getSourceName();
        com.google.javascript.jscomp.Compiler compiler21 = nodeTraversal15.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal15.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue22;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        com.google.javascript.rhino.Node node28 = nodeTraversal27.getEnclosingFunction();
        boolean boolean29 = nodeTraversal27.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.rhino.Node node34 = nodeTraversal33.getCurrentNode();
        com.google.javascript.rhino.InputId inputId35 = nodeTraversal33.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.rhino.Node node40 = nodeTraversal39.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal39.cfgs;
        nodeTraversal33.cfgs = nodeControlFlowGraphQueue41;
        java.lang.String str43 = nodeTraversal33.getSourceName();
        com.google.javascript.rhino.InputId inputId44 = nodeTraversal33.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal33.cfgs;
        nodeTraversal27.cfgs = nodeControlFlowGraphQueue45;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue45;
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(compiler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(compiler21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getCurrentNode();
        boolean boolean20 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        com.google.javascript.rhino.InputId inputId26 = nodeTraversal24.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal30.cfgs;
        nodeTraversal24.cfgs = nodeControlFlowGraphQueue32;
        int int34 = nodeTraversal24.getScopeDepth();
        com.google.javascript.jscomp.Scope scope35 = nodeTraversal24.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal24.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue36;
        com.google.javascript.jscomp.Compiler compiler38 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.InputId inputId39 = nodeTraversal3.getInputId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph40 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertNull(compiler38);
        org.junit.Assert.assertNull(inputId39);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.rhino.Node node19 = nodeTraversal18.getCurrentNode();
        com.google.javascript.rhino.InputId inputId20 = nodeTraversal18.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal24.cfgs;
        nodeTraversal18.cfgs = nodeControlFlowGraphQueue26;
        int int28 = nodeTraversal18.getScopeDepth();
        boolean boolean29 = nodeTraversal18.inGlobalScope();
        com.google.javascript.jscomp.Scope scope30 = nodeTraversal18.getScope();
        boolean boolean31 = nodeTraversal18.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal35.traverseRoots(nodeArray36);
        nodeTraversal18.traverseRoots(nodeArray36);
        nodeTraversal3.traverseRoots(nodeArray36);
        java.lang.String str40 = nodeTraversal3.getSourceName();
        java.lang.String str41 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator44 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal45 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler42, callback43, scopeCreator44);
        com.google.javascript.rhino.Node node46 = nodeTraversal45.getCurrentNode();
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType48 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError52 = nodeTraversal45.makeError(node47, diagnosticType48, strArray51);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue53 = nodeTraversal45.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue53;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph55 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertArrayEquals(nodeArray36, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(diagnosticType48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError52);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue53);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        int int16 = nodeTraversal3.getScopeDepth();
        int int17 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node18 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.Scope scope21 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node19, node20, scope21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope5 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler7 = nodeTraversal3.getCompiler();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Compiler compiler9 = nodeTraversal3.getCompiler();
        boolean boolean10 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(compiler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(compiler9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getCurrentNode();
        java.lang.String str13 = nodeTraversal3.getSourceName();
        int int14 = nodeTraversal3.getScopeDepth();
        int int15 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        com.google.javascript.rhino.Node node26 = nodeTraversal25.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal25.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue27;
        int int29 = nodeTraversal19.getScopeDepth();
        boolean boolean30 = nodeTraversal19.inGlobalScope();
        com.google.javascript.jscomp.Scope scope31 = nodeTraversal19.getScope();
        boolean boolean32 = nodeTraversal19.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal36.traverseRoots(nodeArray37);
        nodeTraversal19.traverseRoots(nodeArray37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        com.google.javascript.rhino.Node node44 = nodeTraversal43.getCurrentNode();
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType46 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError50 = nodeTraversal43.makeError(node45, diagnosticType46, strArray49);
        com.google.javascript.rhino.Node node51 = nodeTraversal43.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator54 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler52, callback53, scopeCreator54);
        com.google.javascript.rhino.Node node56 = nodeTraversal55.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue57 = nodeTraversal55.cfgs;
        nodeTraversal43.cfgs = nodeControlFlowGraphQueue57;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue57;
        boolean boolean60 = nodeTraversal19.inGlobalScope();
        com.google.javascript.rhino.InputId inputId61 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler62 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback66 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator67 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal68 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler65, callback66, scopeCreator67);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler69 = null;
        com.google.javascript.rhino.Node[] nodeArray70 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList71 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList71, nodeArray70);
        com.google.javascript.jscomp.NodeTraversal.Callback callback73 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler69, (java.util.List<com.google.javascript.rhino.Node>) nodeList71, callback73);
        nodeTraversal68.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList71);
        com.google.javascript.jscomp.NodeTraversal.Callback callback76 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler64, (java.util.List<com.google.javascript.rhino.Node>) nodeList71, callback76);
        com.google.javascript.jscomp.NodeTraversal.Callback callback78 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler63, (java.util.List<com.google.javascript.rhino.Node>) nodeList71, callback78);
        com.google.javascript.jscomp.NodeTraversal.Callback callback80 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler62, (java.util.List<com.google.javascript.rhino.Node>) nodeList71, callback80);
        nodeTraversal19.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList71);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList71);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertArrayEquals(nodeArray37, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(diagnosticType46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertNotNull(nodeArray70);
        org.junit.Assert.assertArrayEquals(nodeArray70, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        int int5 = nodeTraversal3.getLineNumber();
        java.lang.String str6 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId7 = nodeTraversal3.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue8 = nodeTraversal3.cfgs;
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal3.cfgs;
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue8);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        boolean boolean13 = nodeTraversal3.hasScope();
        boolean boolean14 = nodeTraversal3.hasScope();
        boolean boolean15 = nodeTraversal3.hasScope();
        boolean boolean16 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node17 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope5 = nodeTraversal3.getScope();
        int int6 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        com.google.javascript.rhino.Node node11 = nodeTraversal10.getCurrentNode();
        com.google.javascript.rhino.InputId inputId12 = nodeTraversal10.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        com.google.javascript.rhino.Node node17 = nodeTraversal16.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal16.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue18;
        int int20 = nodeTraversal10.getScopeDepth();
        com.google.javascript.jscomp.Scope scope21 = nodeTraversal10.getScope();
        java.lang.String str22 = nodeTraversal10.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal26.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue28;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.rhino.Node node34 = nodeTraversal33.getCurrentNode();
        com.google.javascript.rhino.InputId inputId35 = nodeTraversal33.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.rhino.Node node40 = nodeTraversal39.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal39.cfgs;
        nodeTraversal33.cfgs = nodeControlFlowGraphQueue41;
        int int43 = nodeTraversal33.getScopeDepth();
        com.google.javascript.jscomp.Scope scope44 = nodeTraversal33.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue45 = nodeTraversal33.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue45;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue45;
        com.google.javascript.rhino.Node node48 = nodeTraversal3.getCurrentNode();
        boolean boolean49 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        int int15 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList24 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList24, nodeArray23);
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, (java.util.List<com.google.javascript.rhino.Node>) nodeList24, callback26);
        nodeTraversal21.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList24);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node node33 = nodeTraversal32.getCurrentNode();
        com.google.javascript.rhino.InputId inputId34 = nodeTraversal32.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, callback36, scopeCreator37);
        com.google.javascript.rhino.Node node39 = nodeTraversal38.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue40 = nodeTraversal38.cfgs;
        nodeTraversal32.cfgs = nodeControlFlowGraphQueue40;
        int int42 = nodeTraversal32.getScopeDepth();
        boolean boolean43 = nodeTraversal32.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue44 = nodeTraversal32.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator48 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler46, callback47, scopeCreator48);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList52 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList52, nodeArray51);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler50, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback54);
        nodeTraversal49.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler45, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback57);
        nodeTraversal32.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        nodeTraversal21.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        com.google.javascript.jscomp.NodeTraversal.Callback callback61 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback61);
        com.google.javascript.jscomp.NodeTraversal.Callback callback63 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback63);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        com.google.javascript.rhino.Node node66 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(inputId34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue44);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node66);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope5 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler7 = nodeTraversal3.getCompiler();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Compiler compiler9 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue10 = nodeTraversal3.cfgs;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput11 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(compiler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(compiler9);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal9.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node node16 = nodeTraversal15.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue17 = nodeTraversal15.cfgs;
        nodeTraversal9.cfgs = nodeControlFlowGraphQueue17;
        int int19 = nodeTraversal9.getScopeDepth();
        boolean boolean20 = nodeTraversal9.inGlobalScope();
        com.google.javascript.jscomp.Scope scope21 = nodeTraversal9.getScope();
        boolean boolean22 = nodeTraversal9.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal26.traverseRoots(nodeArray27);
        nodeTraversal9.traverseRoots(nodeArray27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType31 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.rhino.Node node36 = nodeTraversal35.getCurrentNode();
        com.google.javascript.rhino.InputId inputId37 = nodeTraversal35.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator40 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler38, callback39, scopeCreator40);
        com.google.javascript.rhino.Node node42 = nodeTraversal41.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue43 = nodeTraversal41.cfgs;
        nodeTraversal35.cfgs = nodeControlFlowGraphQueue43;
        java.lang.String str45 = nodeTraversal35.getSourceName();
        com.google.javascript.rhino.Node node46 = nodeTraversal35.getEnclosingFunction();
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType48 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray49 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError50 = nodeTraversal35.makeError(node47, diagnosticType48, strArray49);
        com.google.javascript.jscomp.JSError jSError51 = nodeTraversal9.makeError(node30, diagnosticType31, strArray49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator54 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler52, callback53, scopeCreator54);
        com.google.javascript.rhino.Node node56 = nodeTraversal55.getCurrentNode();
        com.google.javascript.rhino.InputId inputId57 = nodeTraversal55.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback59 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator60 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal61 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler58, callback59, scopeCreator60);
        com.google.javascript.rhino.Node node62 = nodeTraversal61.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue63 = nodeTraversal61.cfgs;
        nodeTraversal55.cfgs = nodeControlFlowGraphQueue63;
        java.lang.String str65 = nodeTraversal55.getSourceName();
        com.google.javascript.rhino.Node node66 = nodeTraversal55.getEnclosingFunction();
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType68 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray69 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError70 = nodeTraversal55.makeError(node67, diagnosticType68, strArray69);
        com.google.javascript.jscomp.JSError jSError71 = nodeTraversal3.makeError(node5, diagnosticType31, strArray69);
        com.google.javascript.rhino.Node node72 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback74 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator75 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal76 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler73, callback74, scopeCreator75);
        com.google.javascript.rhino.Node node77 = nodeTraversal76.getCurrentNode();
        com.google.javascript.rhino.InputId inputId78 = nodeTraversal76.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler79 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback80 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator81 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal82 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler79, callback80, scopeCreator81);
        com.google.javascript.rhino.Node node83 = nodeTraversal82.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue84 = nodeTraversal82.cfgs;
        nodeTraversal76.cfgs = nodeControlFlowGraphQueue84;
        int int86 = nodeTraversal76.getScopeDepth();
        com.google.javascript.jscomp.Scope scope87 = nodeTraversal76.getScope();
        java.lang.String str88 = nodeTraversal76.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler89 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback90 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator91 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal92 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler89, callback90, scopeCreator91);
        com.google.javascript.rhino.Node node93 = nodeTraversal92.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue94 = nodeTraversal92.cfgs;
        nodeTraversal76.cfgs = nodeControlFlowGraphQueue94;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue94;
        boolean boolean97 = nodeTraversal3.hasScope();
        int int98 = nodeTraversal3.getScopeDepth();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(diagnosticType31);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(diagnosticType48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError50);
        org.junit.Assert.assertNotNull(jSError51);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(diagnosticType68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError70);
        org.junit.Assert.assertNotNull(jSError71);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(inputId78);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(scope87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNull(node93);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue94);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        int int17 = nodeTraversal3.getLineNumber();
        int int18 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal22.traverseRoots(nodeArray23);
        com.google.javascript.rhino.Node node25 = nodeTraversal22.getCurrentNode();
        boolean boolean26 = nodeTraversal22.hasScope();
        java.lang.String str27 = nodeTraversal22.getSourceName();
        int int28 = nodeTraversal22.getScopeDepth();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal22.cfgs = nodeControlFlowGraphQueue29;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback32 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator33 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler31, callback32, scopeCreator33);
        com.google.javascript.rhino.Node node35 = nodeTraversal34.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope36 = nodeTraversal34.getScope();
        com.google.javascript.rhino.Node node37 = nodeTraversal34.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler38 = nodeTraversal34.getCompiler();
        java.lang.String str39 = nodeTraversal34.getSourceName();
        com.google.javascript.jscomp.Compiler compiler40 = nodeTraversal34.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal34.cfgs;
        nodeTraversal22.cfgs = nodeControlFlowGraphQueue41;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue41;
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue44 = nodeTraversal3.cfgs;
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(compiler38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(compiler40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue44);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.Compiler compiler17 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node18 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getEnclosingFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule20 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(compiler16);
        org.junit.Assert.assertNull(compiler17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Compiler compiler7 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback10 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator11 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler9, callback10, scopeCreator11);
        com.google.javascript.rhino.Node node13 = nodeTraversal12.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal12.getScope();
        int int15 = nodeTraversal12.getScopeDepth();
        com.google.javascript.rhino.Node node16 = nodeTraversal12.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        com.google.javascript.rhino.InputId inputId22 = nodeTraversal20.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal26.cfgs;
        nodeTraversal20.cfgs = nodeControlFlowGraphQueue28;
        java.lang.String str30 = nodeTraversal20.getSourceName();
        com.google.javascript.rhino.Node node31 = nodeTraversal20.getEnclosingFunction();
        boolean boolean32 = nodeTraversal20.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        com.google.javascript.rhino.Node node37 = nodeTraversal36.getEnclosingFunction();
        int int38 = nodeTraversal36.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback44 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator45 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler43, callback44, scopeCreator45);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList49 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList49, nodeArray48);
        com.google.javascript.jscomp.NodeTraversal.Callback callback51 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback51);
        nodeTraversal46.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList49);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler42, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback54);
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler41, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback56);
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler40, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback58);
        com.google.javascript.jscomp.NodeTraversal.Callback callback60 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler39, (java.util.List<com.google.javascript.rhino.Node>) nodeList49, callback60);
        nodeTraversal36.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback64 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator65 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal66 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler63, callback64, scopeCreator65);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        com.google.javascript.rhino.Node[] nodeArray68 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList69 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList69, nodeArray68);
        com.google.javascript.jscomp.NodeTraversal.Callback callback71 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler67, (java.util.List<com.google.javascript.rhino.Node>) nodeList69, callback71);
        nodeTraversal66.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList69);
        nodeTraversal36.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList69);
        nodeTraversal20.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList69);
        nodeTraversal12.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList69);
        com.google.javascript.jscomp.NodeTraversal.Callback callback77 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, (java.util.List<com.google.javascript.rhino.Node>) nodeList69, callback77);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList69);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(compiler7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertArrayEquals(nodeArray48, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeArray68);
        org.junit.Assert.assertArrayEquals(nodeArray68, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler13 = nodeTraversal3.getCompiler();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        int int15 = nodeTraversal3.getLineNumber();
        boolean boolean16 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.InputId inputId17 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(compiler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(inputId17);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal9.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue12 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue12;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput14 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue12);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal3.cfgs;
        java.lang.String str12 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node13, scope14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType25 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator28 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler26, callback27, scopeCreator28);
        com.google.javascript.rhino.Node node30 = nodeTraversal29.getCurrentNode();
        com.google.javascript.rhino.InputId inputId31 = nodeTraversal29.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.rhino.Node node36 = nodeTraversal35.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue37 = nodeTraversal35.cfgs;
        nodeTraversal29.cfgs = nodeControlFlowGraphQueue37;
        java.lang.String str39 = nodeTraversal29.getSourceName();
        com.google.javascript.rhino.Node node40 = nodeTraversal29.getEnclosingFunction();
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType42 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray43 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError44 = nodeTraversal29.makeError(node41, diagnosticType42, strArray43);
        com.google.javascript.jscomp.JSError jSError45 = nodeTraversal3.makeError(node24, diagnosticType25, strArray43);
        com.google.javascript.jscomp.Scope scope46 = nodeTraversal3.getScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(diagnosticType25);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(diagnosticType42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError44);
        org.junit.Assert.assertNotNull(jSError45);
        org.junit.Assert.assertNull(scope46);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node7 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node node16 = nodeTraversal15.getCurrentNode();
        com.google.javascript.rhino.InputId inputId17 = nodeTraversal15.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        com.google.javascript.rhino.Node node22 = nodeTraversal21.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue23 = nodeTraversal21.cfgs;
        nodeTraversal15.cfgs = nodeControlFlowGraphQueue23;
        int int25 = nodeTraversal15.getScopeDepth();
        com.google.javascript.jscomp.Scope scope26 = nodeTraversal15.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal15.cfgs;
        com.google.javascript.jscomp.Scope scope28 = nodeTraversal15.getScope();
        int int29 = nodeTraversal15.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.rhino.Node node34 = nodeTraversal33.getCurrentNode();
        com.google.javascript.rhino.InputId inputId35 = nodeTraversal33.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.rhino.Node node40 = nodeTraversal39.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal39.cfgs;
        nodeTraversal33.cfgs = nodeControlFlowGraphQueue41;
        int int43 = nodeTraversal33.getScopeDepth();
        boolean boolean44 = nodeTraversal33.inGlobalScope();
        com.google.javascript.jscomp.Scope scope45 = nodeTraversal33.getScope();
        boolean boolean46 = nodeTraversal33.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator49 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler47, callback48, scopeCreator49);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal50.traverseRoots(nodeArray51);
        nodeTraversal33.traverseRoots(nodeArray51);
        nodeTraversal15.traverseRoots(nodeArray51);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray51);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, callback9, nodeArray51);
        nodeTraversal3.traverseRoots(nodeArray51);
        com.google.javascript.jscomp.Scope scope58 = nodeTraversal3.getScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph59 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(inputId17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(scope45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(scope58);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getEnclosingFunction();
        boolean boolean24 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node25 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal3.getInputId();
        int int17 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.rhino.Node node18 = nodeTraversal17.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node node23 = nodeTraversal22.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal27.traverseRoots(nodeArray28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal35.traverseRoots(nodeArray36);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray36);
        nodeTraversal27.traverseRoots(nodeArray36);
        nodeTraversal22.traverseRoots(nodeArray36);
        nodeTraversal17.traverseRoots(nodeArray36);
        nodeTraversal3.traverseRoots(nodeArray36);
        boolean boolean43 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeArray28);
        org.junit.Assert.assertArrayEquals(nodeArray28, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertArrayEquals(nodeArray36, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        boolean boolean12 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule16 = nodeTraversal3.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNull(compiler14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getEnclosingFunction();
        boolean boolean24 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node25 = nodeTraversal3.getEnclosingFunction();
        int int26 = nodeTraversal3.getScopeDepth();
        java.lang.Class<?> wildcardClass27 = nodeTraversal3.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal15.traverseRoots(nodeArray16);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray16);
        nodeTraversal3.traverseRoots(nodeArray16);
        com.google.javascript.jscomp.Scope scope20 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node21 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertArrayEquals(nodeArray16, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, callback3, scopeCreator4);
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal5.traverseRoots(nodeArray6);
        com.google.javascript.rhino.Node node8 = nodeTraversal5.getCurrentNode();
        boolean boolean9 = nodeTraversal5.hasScope();
        java.lang.String str10 = nodeTraversal5.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal5.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal17.traverseRoots(nodeArray18);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, callback13, nodeArray18);
        nodeTraversal5.traverseRoots(nodeArray18);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray18);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertArrayEquals(nodeArray6, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertArrayEquals(nodeArray18, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList12 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList12, nodeArray11);
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList12, callback14);
        nodeTraversal9.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal26.traverseRoots(nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler21, callback22, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler19, callback20, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray27);
        nodeTraversal9.traverseRoots(nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, callback5, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler2, callback3, nodeArray27);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray27);
        java.lang.Class<?> wildcardClass36 = nodeArray27.getClass();
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertArrayEquals(nodeArray11, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator4 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, callback3, scopeCreator4);
        com.google.javascript.rhino.Node node6 = nodeTraversal5.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler7 = nodeTraversal5.getCompiler();
        com.google.javascript.jscomp.Compiler compiler8 = nodeTraversal5.getCompiler();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList20 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList20, nodeArray19);
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler18, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback22);
        nodeTraversal17.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList20);
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback25);
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback27);
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback29);
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback31);
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler9, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback33);
        nodeTraversal5.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList20);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler1, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback36);
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, (java.util.List<com.google.javascript.rhino.Node>) nodeList20, callback38);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(compiler7);
        org.junit.Assert.assertNull(compiler8);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler13 = nodeTraversal3.getCompiler();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        int int15 = nodeTraversal3.getLineNumber();
        int int16 = nodeTraversal3.getLineNumber();
        java.lang.String str17 = nodeTraversal3.getSourceName();
        int int18 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler19 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node20 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(compiler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(compiler19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        boolean boolean13 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.rhino.Node node19 = nodeTraversal18.getCurrentNode();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType21 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError25 = nodeTraversal18.makeError(node20, diagnosticType21, strArray24);
        java.lang.String[] strArray26 = null;
        com.google.javascript.jscomp.JSError jSError27 = nodeTraversal3.makeError(node14, diagnosticType21, strArray26);
        boolean boolean28 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler29 = nodeTraversal3.getCompiler();
        int int30 = nodeTraversal3.getScopeDepth();
        int int31 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(diagnosticType21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError25);
        org.junit.Assert.assertNotNull(jSError27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(compiler29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal14.traverseRoots(nodeArray15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal22.traverseRoots(nodeArray23);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray23);
        nodeTraversal14.traverseRoots(nodeArray23);
        nodeTraversal9.traverseRoots(nodeArray23);
        nodeTraversal3.traverseRoots(nodeArray23);
        int int29 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node30 = nodeTraversal3.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal3.cfgs;
        java.lang.String str32 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList12 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList12, nodeArray11);
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList12, callback14);
        nodeTraversal9.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList12);
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal9.getScope();
        int int18 = nodeTraversal9.getScopeDepth();
        boolean boolean19 = nodeTraversal9.hasScope();
        boolean boolean20 = nodeTraversal9.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList27 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList27, nodeArray26);
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler25, (java.util.List<com.google.javascript.rhino.Node>) nodeList27, callback29);
        nodeTraversal24.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList27);
        nodeTraversal9.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList27);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator36 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler34, callback35, scopeCreator36);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal37.traverseRoots(nodeArray38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator44 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal45 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler42, callback43, scopeCreator44);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal45.traverseRoots(nodeArray46);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler40, callback41, nodeArray46);
        nodeTraversal37.traverseRoots(nodeArray46);
        nodeTraversal3.traverseRoots(nodeArray46);
        com.google.javascript.rhino.InputId inputId51 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node52 = nodeTraversal3.getEnclosingFunction();
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertArrayEquals(nodeArray11, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeArray38);
        org.junit.Assert.assertArrayEquals(nodeArray38, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertArrayEquals(nodeArray46, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        java.lang.String str19 = nodeTraversal3.getSourceName();
        boolean boolean20 = nodeTraversal3.hasScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        java.util.List<com.google.javascript.rhino.Node> nodeList17 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseRoots(nodeList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        com.google.javascript.rhino.Node node28 = nodeTraversal27.getCurrentNode();
        com.google.javascript.rhino.InputId inputId29 = nodeTraversal27.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.rhino.Node node34 = nodeTraversal33.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue35 = nodeTraversal33.cfgs;
        nodeTraversal27.cfgs = nodeControlFlowGraphQueue35;
        java.lang.String str37 = nodeTraversal27.getSourceName();
        com.google.javascript.rhino.Node node38 = nodeTraversal27.getEnclosingFunction();
        boolean boolean39 = nodeTraversal27.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator42 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler40, callback41, scopeCreator42);
        com.google.javascript.rhino.Node node44 = nodeTraversal43.getEnclosingFunction();
        int int45 = nodeTraversal43.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback51 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler50, callback51, scopeCreator52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        com.google.javascript.rhino.Node[] nodeArray55 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList56 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList56, nodeArray55);
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler54, (java.util.List<com.google.javascript.rhino.Node>) nodeList56, callback58);
        nodeTraversal53.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList56);
        com.google.javascript.jscomp.NodeTraversal.Callback callback61 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, (java.util.List<com.google.javascript.rhino.Node>) nodeList56, callback61);
        com.google.javascript.jscomp.NodeTraversal.Callback callback63 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler48, (java.util.List<com.google.javascript.rhino.Node>) nodeList56, callback63);
        com.google.javascript.jscomp.NodeTraversal.Callback callback65 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, (java.util.List<com.google.javascript.rhino.Node>) nodeList56, callback65);
        com.google.javascript.jscomp.NodeTraversal.Callback callback67 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler46, (java.util.List<com.google.javascript.rhino.Node>) nodeList56, callback67);
        nodeTraversal43.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList56);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback71 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator72 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal73 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler70, callback71, scopeCreator72);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler74 = null;
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList76 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList76, nodeArray75);
        com.google.javascript.jscomp.NodeTraversal.Callback callback78 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler74, (java.util.List<com.google.javascript.rhino.Node>) nodeList76, callback78);
        nodeTraversal73.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList76);
        nodeTraversal43.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList76);
        nodeTraversal27.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList76);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList76);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue84 = nodeTraversal3.cfgs;
        boolean boolean85 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertArrayEquals(nodeArray55, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(nodeArray75);
        org.junit.Assert.assertArrayEquals(nodeArray75, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.Scope scope15 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node13, node14, scope15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        com.google.javascript.rhino.Node node22 = nodeTraversal21.getCurrentNode();
        com.google.javascript.rhino.InputId inputId23 = nodeTraversal21.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        com.google.javascript.rhino.Node node28 = nodeTraversal27.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue29 = nodeTraversal27.cfgs;
        nodeTraversal21.cfgs = nodeControlFlowGraphQueue29;
        int int31 = nodeTraversal21.getScopeDepth();
        com.google.javascript.jscomp.Scope scope32 = nodeTraversal21.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator35 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler33, callback34, scopeCreator35);
        com.google.javascript.rhino.Node node37 = nodeTraversal36.getCurrentNode();
        com.google.javascript.rhino.InputId inputId38 = nodeTraversal36.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator41 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler39, callback40, scopeCreator41);
        com.google.javascript.rhino.Node node43 = nodeTraversal42.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue44 = nodeTraversal42.cfgs;
        nodeTraversal36.cfgs = nodeControlFlowGraphQueue44;
        int int46 = nodeTraversal36.getScopeDepth();
        boolean boolean47 = nodeTraversal36.inGlobalScope();
        com.google.javascript.jscomp.Scope scope48 = nodeTraversal36.getScope();
        boolean boolean49 = nodeTraversal36.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback51 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator52 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler50, callback51, scopeCreator52);
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal53.traverseRoots(nodeArray54);
        nodeTraversal36.traverseRoots(nodeArray54);
        nodeTraversal21.traverseRoots(nodeArray54);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, callback17, nodeArray54);
        nodeTraversal3.traverseRoots(nodeArray54);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertArrayEquals(nodeArray54, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        int int24 = nodeTraversal3.getScopeDepth();
        boolean boolean25 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope26 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node27 = nodeTraversal3.getCurrentNode();
        int int28 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        int int9 = nodeTraversal3.getScopeDepth();
        java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue10 = new java.util.ArrayDeque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>>();
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator14 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler12, callback13, scopeCreator14);
        com.google.javascript.rhino.Node node16 = nodeTraversal15.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope17 = nodeTraversal15.getScope();
        com.google.javascript.rhino.Node node18 = nodeTraversal15.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler19 = nodeTraversal15.getCompiler();
        java.lang.String str20 = nodeTraversal15.getSourceName();
        com.google.javascript.jscomp.Compiler compiler21 = nodeTraversal15.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal15.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue22;
        com.google.javascript.rhino.Node node24 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(compiler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(compiler21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope12 = nodeTraversal3.getScope();
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node14, node15, scope16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getCurrentNode();
        boolean boolean20 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        com.google.javascript.rhino.InputId inputId26 = nodeTraversal24.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal30.cfgs;
        nodeTraversal24.cfgs = nodeControlFlowGraphQueue32;
        int int34 = nodeTraversal24.getScopeDepth();
        com.google.javascript.jscomp.Scope scope35 = nodeTraversal24.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal24.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue36;
        boolean boolean38 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback40 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator41 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler39, callback40, scopeCreator41);
        com.google.javascript.rhino.Node node43 = nodeTraversal42.getCurrentNode();
        com.google.javascript.rhino.InputId inputId44 = nodeTraversal42.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator47 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler45, callback46, scopeCreator47);
        com.google.javascript.rhino.Node node49 = nodeTraversal48.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue50 = nodeTraversal48.cfgs;
        nodeTraversal42.cfgs = nodeControlFlowGraphQueue50;
        int int52 = nodeTraversal42.getScopeDepth();
        com.google.javascript.jscomp.Scope scope53 = nodeTraversal42.getScope();
        java.lang.String str54 = nodeTraversal42.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator57 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler55, callback56, scopeCreator57);
        com.google.javascript.rhino.Node node59 = nodeTraversal58.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue60 = nodeTraversal58.cfgs;
        nodeTraversal42.cfgs = nodeControlFlowGraphQueue60;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler62 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback63 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator64 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal65 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler62, callback63, scopeCreator64);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler66 = null;
        com.google.javascript.rhino.Node[] nodeArray67 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList68 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList68, nodeArray67);
        com.google.javascript.jscomp.NodeTraversal.Callback callback70 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler66, (java.util.List<com.google.javascript.rhino.Node>) nodeList68, callback70);
        nodeTraversal65.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList68);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback74 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler75 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback76 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler77 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback78 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler79 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback80 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator81 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal82 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler79, callback80, scopeCreator81);
        com.google.javascript.rhino.Node[] nodeArray83 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal82.traverseRoots(nodeArray83);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler77, callback78, nodeArray83);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler75, callback76, nodeArray83);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler73, callback74, nodeArray83);
        nodeTraversal65.traverseRoots(nodeArray83);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue89 = nodeTraversal65.cfgs;
        nodeTraversal42.cfgs = nodeControlFlowGraphQueue89;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue89;
        com.google.javascript.rhino.Node node92 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node93 = nodeTraversal3.getCurrentNode();
        boolean boolean94 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node95 = null;
        com.google.javascript.rhino.Node node96 = null;
        com.google.javascript.jscomp.Scope scope97 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node95, node96, scope97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue60);
        org.junit.Assert.assertNotNull(nodeArray67);
        org.junit.Assert.assertArrayEquals(nodeArray67, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(nodeArray83);
        org.junit.Assert.assertArrayEquals(nodeArray83, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue89);
        org.junit.Assert.assertNull(node92);
        org.junit.Assert.assertNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        boolean boolean12 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.Scope scope19 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node17, node18, scope19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNull(compiler14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator20 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler18, callback19, scopeCreator20);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal21.traverseRoots(nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler16, callback17, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, callback15, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler12, callback13, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, callback11, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, callback9, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, callback5, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler2, callback3, nodeArray22);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler0, callback1, nodeArray22);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.Scope scope11 = nodeTraversal3.getScope();
        int int12 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler13 = nodeTraversal3.getCompiler();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.InputId inputId15 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal3.getInputId();
        int int17 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator36 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler34, callback35, scopeCreator36);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal37.traverseRoots(nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, callback33, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler28, callback29, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler26, callback27, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, callback25, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, callback23, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler20, callback21, nodeArray38);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler18, callback19, nodeArray38);
        nodeTraversal3.traverseRoots(nodeArray38);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(compiler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeArray38);
        org.junit.Assert.assertArrayEquals(nodeArray38, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.InputId inputId11 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getCurrentNode();
        java.lang.String str13 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph14 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        int int15 = nodeTraversal3.getLineNumber();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        int int17 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback19 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler20, callback21, scopeCreator22);
        com.google.javascript.rhino.Node node24 = nodeTraversal23.getCurrentNode();
        com.google.javascript.rhino.InputId inputId25 = nodeTraversal23.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator28 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler26, callback27, scopeCreator28);
        com.google.javascript.rhino.Node node30 = nodeTraversal29.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue31 = nodeTraversal29.cfgs;
        nodeTraversal23.cfgs = nodeControlFlowGraphQueue31;
        int int33 = nodeTraversal23.getScopeDepth();
        com.google.javascript.jscomp.Scope scope34 = nodeTraversal23.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, callback36, scopeCreator37);
        com.google.javascript.rhino.Node node39 = nodeTraversal38.getCurrentNode();
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal38.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        com.google.javascript.rhino.Node node45 = nodeTraversal44.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue46 = nodeTraversal44.cfgs;
        nodeTraversal38.cfgs = nodeControlFlowGraphQueue46;
        int int48 = nodeTraversal38.getScopeDepth();
        boolean boolean49 = nodeTraversal38.inGlobalScope();
        com.google.javascript.jscomp.Scope scope50 = nodeTraversal38.getScope();
        boolean boolean51 = nodeTraversal38.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler52 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback53 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator54 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler52, callback53, scopeCreator54);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal55.traverseRoots(nodeArray56);
        nodeTraversal38.traverseRoots(nodeArray56);
        nodeTraversal23.traverseRoots(nodeArray56);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler18, callback19, nodeArray56);
        nodeTraversal3.traverseRoots(nodeArray56);
        int int62 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback65 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator66 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal67 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler64, callback65, scopeCreator66);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler68 = null;
        com.google.javascript.rhino.Node[] nodeArray69 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList70 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList70, nodeArray69);
        com.google.javascript.jscomp.NodeTraversal.Callback callback72 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler68, (java.util.List<com.google.javascript.rhino.Node>) nodeList70, callback72);
        nodeTraversal67.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList70);
        com.google.javascript.jscomp.NodeTraversal.Callback callback75 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler63, (java.util.List<com.google.javascript.rhino.Node>) nodeList70, callback75);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList70);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(scope50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertArrayEquals(nodeArray56, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(nodeArray69);
        org.junit.Assert.assertArrayEquals(nodeArray69, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback15 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator16 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler14, callback15, scopeCreator16);
        com.google.javascript.rhino.Node node18 = nodeTraversal17.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node node23 = nodeTraversal22.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal27.traverseRoots(nodeArray28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal35.traverseRoots(nodeArray36);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, callback31, nodeArray36);
        nodeTraversal27.traverseRoots(nodeArray36);
        nodeTraversal22.traverseRoots(nodeArray36);
        nodeTraversal17.traverseRoots(nodeArray36);
        nodeTraversal3.traverseRoots(nodeArray36);
        int int43 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeArray28);
        org.junit.Assert.assertArrayEquals(nodeArray28, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertArrayEquals(nodeArray36, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        int int3 = nodeTraversal2.getScopeDepth();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModule jSModule4 = nodeTraversal2.getModule();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node node15 = nodeTraversal14.getCurrentNode();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal14.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal20.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue22;
        int int24 = nodeTraversal14.getScopeDepth();
        com.google.javascript.jscomp.Scope scope25 = nodeTraversal14.getScope();
        java.lang.String str26 = nodeTraversal14.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal30.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue32;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator36 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler34, callback35, scopeCreator36);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.rhino.Node[] nodeArray39 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList40 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList40, nodeArray39);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler38, (java.util.List<com.google.javascript.rhino.Node>) nodeList40, callback42);
        nodeTraversal37.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList40);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator53 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler51, callback52, scopeCreator53);
        com.google.javascript.rhino.Node[] nodeArray55 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal54.traverseRoots(nodeArray55);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, callback50, nodeArray55);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, callback48, nodeArray55);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler45, callback46, nodeArray55);
        nodeTraversal37.traverseRoots(nodeArray55);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue61 = nodeTraversal37.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue61;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue61;
        com.google.javascript.rhino.Node node64 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope65 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Compiler compiler66 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertNotNull(nodeArray39);
        org.junit.Assert.assertArrayEquals(nodeArray39, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertArrayEquals(nodeArray55, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(scope65);
        org.junit.Assert.assertNull(compiler66);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator17 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler15, callback16, scopeCreator17);
        com.google.javascript.rhino.Node node19 = nodeTraversal18.getCurrentNode();
        com.google.javascript.rhino.InputId inputId20 = nodeTraversal18.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal24.cfgs;
        nodeTraversal18.cfgs = nodeControlFlowGraphQueue26;
        int int28 = nodeTraversal18.getScopeDepth();
        boolean boolean29 = nodeTraversal18.inGlobalScope();
        com.google.javascript.jscomp.Scope scope30 = nodeTraversal18.getScope();
        boolean boolean31 = nodeTraversal18.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator34 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler32, callback33, scopeCreator34);
        com.google.javascript.rhino.Node[] nodeArray36 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal35.traverseRoots(nodeArray36);
        nodeTraversal18.traverseRoots(nodeArray36);
        nodeTraversal3.traverseRoots(nodeArray36);
        com.google.javascript.jscomp.Scope scope40 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        com.google.javascript.rhino.Node node45 = nodeTraversal44.getEnclosingFunction();
        boolean boolean46 = nodeTraversal44.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator49 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler47, callback48, scopeCreator49);
        com.google.javascript.rhino.Node node51 = nodeTraversal50.getCurrentNode();
        com.google.javascript.rhino.InputId inputId52 = nodeTraversal50.getInputId();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue53 = nodeTraversal50.cfgs;
        nodeTraversal44.cfgs = nodeControlFlowGraphQueue53;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue53;
        boolean boolean56 = nodeTraversal3.inGlobalScope();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertArrayEquals(nodeArray36, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(inputId52);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        com.google.javascript.rhino.InputId inputId21 = nodeTraversal19.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator24 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, callback23, scopeCreator24);
        com.google.javascript.rhino.Node node26 = nodeTraversal25.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue27 = nodeTraversal25.cfgs;
        nodeTraversal19.cfgs = nodeControlFlowGraphQueue27;
        java.lang.String str29 = nodeTraversal19.getSourceName();
        com.google.javascript.rhino.Node node30 = nodeTraversal19.getEnclosingFunction();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType32 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray33 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError34 = nodeTraversal19.makeError(node31, diagnosticType32, strArray33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, callback36, scopeCreator37);
        com.google.javascript.rhino.Node node39 = nodeTraversal38.getCurrentNode();
        com.google.javascript.rhino.InputId inputId40 = nodeTraversal38.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator43 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler41, callback42, scopeCreator43);
        com.google.javascript.rhino.Node node45 = nodeTraversal44.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue46 = nodeTraversal44.cfgs;
        nodeTraversal38.cfgs = nodeControlFlowGraphQueue46;
        int int48 = nodeTraversal38.getScopeDepth();
        com.google.javascript.jscomp.Scope scope49 = nodeTraversal38.getScope();
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator53 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler51, callback52, scopeCreator53);
        com.google.javascript.rhino.Node node55 = nodeTraversal54.getCurrentNode();
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType57 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError61 = nodeTraversal54.makeError(node56, diagnosticType57, strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        com.google.javascript.jscomp.JSError jSError65 = nodeTraversal38.makeError(node50, diagnosticType57, strArray64);
        com.google.javascript.jscomp.JSError jSError66 = nodeTraversal3.makeError(node15, diagnosticType32, strArray64);
        com.google.javascript.jscomp.Scope scope67 = nodeTraversal3.getScope();
        boolean boolean68 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node69 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue70 = nodeTraversal3.cfgs;
        com.google.javascript.rhino.Node node71 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Scope scope72 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(diagnosticType32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(diagnosticType57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(jSError65);
        org.junit.Assert.assertNotNull(jSError66);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue70);
        org.junit.Assert.assertNull(node71);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getCurrentNode();
        boolean boolean20 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback22 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator23 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler21, callback22, scopeCreator23);
        com.google.javascript.rhino.Node node25 = nodeTraversal24.getCurrentNode();
        com.google.javascript.rhino.InputId inputId26 = nodeTraversal24.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback28 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator29 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler27, callback28, scopeCreator29);
        com.google.javascript.rhino.Node node31 = nodeTraversal30.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue32 = nodeTraversal30.cfgs;
        nodeTraversal24.cfgs = nodeControlFlowGraphQueue32;
        int int34 = nodeTraversal24.getScopeDepth();
        com.google.javascript.jscomp.Scope scope35 = nodeTraversal24.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue36 = nodeTraversal24.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue36;
        boolean boolean38 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.Node node39 = nodeTraversal3.getCurrentNode();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        com.google.javascript.jscomp.JSError jSError10 = nodeTraversal3.makeError(node5, diagnosticType6, strArray9);
        com.google.javascript.rhino.Node node11 = nodeTraversal3.getEnclosingFunction();
        boolean boolean12 = nodeTraversal3.hasScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue13 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Compiler compiler14 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.Compiler compiler15 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(jSError10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue13);
        org.junit.Assert.assertNull(compiler14);
        org.junit.Assert.assertNull(compiler15);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        boolean boolean15 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getEnclosingFunction();
        int int21 = nodeTraversal19.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator28 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler26, callback27, scopeCreator28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList32 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList32, nodeArray31);
        com.google.javascript.jscomp.NodeTraversal.Callback callback34 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList32, callback34);
        nodeTraversal29.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList32);
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler25, (java.util.List<com.google.javascript.rhino.Node>) nodeList32, callback37);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, (java.util.List<com.google.javascript.rhino.Node>) nodeList32, callback39);
        com.google.javascript.jscomp.NodeTraversal.Callback callback41 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, (java.util.List<com.google.javascript.rhino.Node>) nodeList32, callback41);
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler22, (java.util.List<com.google.javascript.rhino.Node>) nodeList32, callback43);
        nodeTraversal19.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback47 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator48 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler46, callback47, scopeCreator48);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList52 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList52, nodeArray51);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler50, (java.util.List<com.google.javascript.rhino.Node>) nodeList52, callback54);
        nodeTraversal49.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        nodeTraversal19.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList52);
        com.google.javascript.rhino.InputId inputId59 = nodeTraversal3.getInputId();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertArrayEquals(nodeArray31, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(inputId59);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue9 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope10 = nodeTraversal3.getScope();
        com.google.javascript.jscomp.Compiler compiler11 = nodeTraversal3.getCompiler();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(compiler11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope8 = nodeTraversal3.getScope();
        int int9 = nodeTraversal3.getScopeDepth();
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        com.google.javascript.jscomp.Compiler compiler17 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node18 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.Compiler compiler19 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(compiler16);
        org.junit.Assert.assertNull(compiler17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(compiler19);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        int int11 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node12 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node13, scope14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.Scope scope8 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getCurrentNode();
        int int10 = nodeTraversal3.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph11 = nodeTraversal3.getControlFlowGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler5 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.InputId inputId6 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.Scope scope7 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(compiler5);
        org.junit.Assert.assertNull(inputId6);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId8 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node node15 = nodeTraversal14.getCurrentNode();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal14.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal20.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue22;
        int int24 = nodeTraversal14.getScopeDepth();
        boolean boolean25 = nodeTraversal14.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal14.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        nodeTraversal31.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback39);
        nodeTraversal14.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback42);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback56 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler57 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback58 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler59 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback60 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator61 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal62 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler59, callback60, scopeCreator61);
        com.google.javascript.rhino.Node[] nodeArray63 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal62.traverseRoots(nodeArray63);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler57, callback58, nodeArray63);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler55, callback56, nodeArray63);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler53, callback54, nodeArray63);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler51, callback52, nodeArray63);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler49, callback50, nodeArray63);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler47, callback48, nodeArray63);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler45, callback46, nodeArray63);
        nodeTraversal3.traverseRoots(nodeArray63);
        int int73 = nodeTraversal3.getScopeDepth();
        com.google.javascript.rhino.Node node74 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertArrayEquals(nodeArray63, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(compiler16);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getCurrentNode();
        int int20 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Compiler compiler21 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(compiler21);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getCurrentNode();
        int int24 = nodeTraversal3.getLineNumber();
        int int25 = nodeTraversal3.getScopeDepth();
        boolean boolean26 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType28 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.report(node27, diagnosticType28, strArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(diagnosticType28);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        com.google.javascript.rhino.InputId inputId28 = nodeTraversal26.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node node33 = nodeTraversal32.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal32.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue34;
        int int36 = nodeTraversal26.getScopeDepth();
        com.google.javascript.jscomp.Scope scope37 = nodeTraversal26.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue38 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue38;
        com.google.javascript.rhino.Node node40 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue41 = nodeTraversal3.cfgs;
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue41);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.rhino.Node node23 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback26 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler25, callback26, scopeCreator27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList31 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList31, nodeArray30);
        com.google.javascript.jscomp.NodeTraversal.Callback callback33 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler29, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback33);
        nodeTraversal28.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler24, (java.util.List<com.google.javascript.rhino.Node>) nodeList31, callback36);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList31);
        com.google.javascript.jscomp.Scope scope39 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertArrayEquals(nodeArray30, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.rhino.Node node6 = nodeTraversal3.getCurrentNode();
        boolean boolean7 = nodeTraversal3.hasScope();
        com.google.javascript.rhino.InputId inputId8 = nodeTraversal3.getInputId();
        com.google.javascript.rhino.Node node9 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node node15 = nodeTraversal14.getCurrentNode();
        com.google.javascript.rhino.InputId inputId16 = nodeTraversal14.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node node21 = nodeTraversal20.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue22 = nodeTraversal20.cfgs;
        nodeTraversal14.cfgs = nodeControlFlowGraphQueue22;
        int int24 = nodeTraversal14.getScopeDepth();
        boolean boolean25 = nodeTraversal14.inGlobalScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal14.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback36);
        nodeTraversal31.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback39 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler27, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback39);
        nodeTraversal14.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.NodeTraversal.Callback callback42 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler10, (java.util.List<com.google.javascript.rhino.Node>) nodeList34, callback42);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList34);
        com.google.javascript.jscomp.Compiler compiler45 = nodeTraversal3.getCompiler();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node46 = nodeTraversal3.getScopeRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(compiler45);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        boolean boolean16 = nodeTraversal3.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        int int24 = nodeTraversal3.getScopeDepth();
        boolean boolean25 = nodeTraversal3.hasScope();
        int int26 = nodeTraversal3.getLineNumber();
        boolean boolean27 = nodeTraversal3.hasScope();
        int int28 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue15 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.Scope scope16 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue15);
        org.junit.Assert.assertNull(scope16);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue6 = nodeTraversal3.cfgs;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler7, callback8, scopeCreator9);
        com.google.javascript.rhino.Node node11 = nodeTraversal10.getCurrentNode();
        com.google.javascript.rhino.InputId inputId12 = nodeTraversal10.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator15 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler13, callback14, scopeCreator15);
        com.google.javascript.rhino.Node node17 = nodeTraversal16.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue18 = nodeTraversal16.cfgs;
        nodeTraversal10.cfgs = nodeControlFlowGraphQueue18;
        java.lang.String str20 = nodeTraversal10.getSourceName();
        com.google.javascript.rhino.Node node21 = nodeTraversal10.getEnclosingFunction();
        boolean boolean22 = nodeTraversal10.hasScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator26 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler24, callback25, scopeCreator26);
        com.google.javascript.rhino.Node node28 = nodeTraversal27.getEnclosingFunction();
        boolean boolean29 = nodeTraversal27.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback36 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator37 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, callback36, scopeCreator37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList41 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList41, nodeArray40);
        com.google.javascript.jscomp.NodeTraversal.Callback callback43 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler39, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback43);
        nodeTraversal38.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList41);
        com.google.javascript.jscomp.NodeTraversal.Callback callback46 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback46);
        com.google.javascript.jscomp.NodeTraversal.Callback callback48 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler33, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback48);
        com.google.javascript.jscomp.NodeTraversal.Callback callback50 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler32, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback50);
        com.google.javascript.jscomp.NodeTraversal.Callback callback52 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler31, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback52);
        com.google.javascript.jscomp.NodeTraversal.Callback callback54 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler30, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback54);
        nodeTraversal27.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList41);
        com.google.javascript.jscomp.NodeTraversal.Callback callback57 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler23, (java.util.List<com.google.javascript.rhino.Node>) nodeList41, callback57);
        nodeTraversal10.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList41);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList41);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.Scope scope63 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node61, node62, scope63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertArrayEquals(nodeArray40, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue4 = nodeTraversal3.cfgs;
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Compiler compiler6 = nodeTraversal3.getCompiler();
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(compiler6);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        int int5 = nodeTraversal3.getLineNumber();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback11 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator12 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler10, callback11, scopeCreator12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList16 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList16, nodeArray15);
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler14, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback18);
        nodeTraversal13.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.NodeTraversal.Callback callback21 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler9, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback21);
        com.google.javascript.jscomp.NodeTraversal.Callback callback23 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler8, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback23);
        com.google.javascript.jscomp.NodeTraversal.Callback callback25 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler7, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback25);
        com.google.javascript.jscomp.NodeTraversal.Callback callback27 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, (java.util.List<com.google.javascript.rhino.Node>) nodeList16, callback27);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback31 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator32 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler30, callback31, scopeCreator32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList36 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList36, nodeArray35);
        com.google.javascript.jscomp.NodeTraversal.Callback callback38 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, (java.util.List<com.google.javascript.rhino.Node>) nodeList36, callback38);
        nodeTraversal33.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList36);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList36);
        java.lang.String str42 = nodeTraversal3.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput43 = nodeTraversal3.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertArrayEquals(nodeArray35, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getEnclosingFunction();
        boolean boolean5 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getEnclosingFunction();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler11, callback12, scopeCreator13);
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal14.traverseRoots(nodeArray15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node[] nodeArray23 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal22.traverseRoots(nodeArray23);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler17, callback18, nodeArray23);
        nodeTraversal14.traverseRoots(nodeArray23);
        nodeTraversal9.traverseRoots(nodeArray23);
        nodeTraversal3.traverseRoots(nodeArray23);
        int int29 = nodeTraversal3.getLineNumber();
        boolean boolean30 = nodeTraversal3.inGlobalScope();
        java.lang.String str31 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node32 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.Scope scope35 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseInnerNode(node33, node34, scope35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertArrayEquals(nodeArray15, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertArrayEquals(nodeArray23, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.Scope scope14 = nodeTraversal3.getScope();
        java.lang.String str15 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback17 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator18 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler16, callback17, scopeCreator18);
        com.google.javascript.rhino.Node node20 = nodeTraversal19.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue21 = nodeTraversal19.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback24 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator25 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler23, callback24, scopeCreator25);
        com.google.javascript.rhino.Node node27 = nodeTraversal26.getCurrentNode();
        com.google.javascript.rhino.InputId inputId28 = nodeTraversal26.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback30 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator31 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler29, callback30, scopeCreator31);
        com.google.javascript.rhino.Node node33 = nodeTraversal32.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue34 = nodeTraversal32.cfgs;
        nodeTraversal26.cfgs = nodeControlFlowGraphQueue34;
        int int36 = nodeTraversal26.getScopeDepth();
        com.google.javascript.jscomp.Scope scope37 = nodeTraversal26.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue38 = nodeTraversal26.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue38;
        com.google.javascript.rhino.Node node40 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node41 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.Scope scope43 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseWithScope(node42, scope43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue21);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList6 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList6, nodeArray5);
        com.google.javascript.jscomp.NodeTraversal.Callback callback8 = null;
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler4, (java.util.List<com.google.javascript.rhino.Node>) nodeList6, callback8);
        nodeTraversal3.traverseRoots((java.util.List<com.google.javascript.rhino.Node>) nodeList6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback16 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback18 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator19 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler17, callback18, scopeCreator19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal20.traverseRoots(nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler15, callback16, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler13, callback14, nodeArray21);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler11, callback12, nodeArray21);
        nodeTraversal3.traverseRoots(nodeArray21);
        int int27 = nodeTraversal3.getScopeDepth();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback29 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator30 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler28, callback29, scopeCreator30);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal31.traverseRoots(nodeArray32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback35 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback37 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator38 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler36, callback37, scopeCreator38);
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal39.traverseRoots(nodeArray40);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler34, callback35, nodeArray40);
        nodeTraversal31.traverseRoots(nodeArray40);
        nodeTraversal3.traverseRoots(nodeArray40);
        com.google.javascript.jscomp.Scope scope45 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverseAtScope(scope45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertArrayEquals(nodeArray32, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertArrayEquals(nodeArray40, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        java.lang.String str13 = nodeTraversal3.getSourceName();
        com.google.javascript.rhino.Node node14 = nodeTraversal3.getEnclosingFunction();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.NodeTraversal.NODE_TRAVERSAL_ERROR;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError18 = nodeTraversal3.makeError(node15, diagnosticType16, strArray17);
        com.google.javascript.rhino.Node node19 = nodeTraversal3.getCurrentNode();
        int int20 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSError18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.jscomp.Scope scope15 = nodeTraversal3.getScope();
        com.google.javascript.rhino.Node node16 = nodeTraversal3.getEnclosingFunction();
        int int17 = nodeTraversal3.getLineNumber();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal3.traverseRoots(nodeArray4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback9 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler8, callback9, scopeCreator10);
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        nodeTraversal11.traverseRoots(nodeArray12);
        com.google.javascript.jscomp.NodeTraversal.traverseRoots(abstractCompiler6, callback7, nodeArray12);
        nodeTraversal3.traverseRoots(nodeArray12);
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        int int17 = nodeTraversal3.getLineNumber();
        java.lang.String str18 = nodeTraversal3.getSourceName();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback20 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator21 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler19, callback20, scopeCreator21);
        com.google.javascript.rhino.Node node23 = nodeTraversal22.getEnclosingFunction();
        com.google.javascript.jscomp.Scope scope24 = nodeTraversal22.getScope();
        com.google.javascript.rhino.Node node25 = nodeTraversal22.getEnclosingFunction();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue26 = nodeTraversal22.cfgs;
        com.google.javascript.jscomp.Scope scope27 = nodeTraversal22.getScope();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue28 = nodeTraversal22.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue28;
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertArrayEquals(nodeArray4, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNull(compiler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue26);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue28);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue5 = nodeTraversal3.cfgs;
        boolean boolean6 = nodeTraversal3.inGlobalScope();
        boolean boolean7 = nodeTraversal3.inGlobalScope();
        java.lang.String str8 = nodeTraversal3.getSourceName();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator2 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1, scopeCreator2);
        com.google.javascript.rhino.Node node4 = nodeTraversal3.getCurrentNode();
        com.google.javascript.rhino.InputId inputId5 = nodeTraversal3.getInputId();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback7 = null;
        com.google.javascript.jscomp.ScopeCreator scopeCreator8 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler6, callback7, scopeCreator8);
        com.google.javascript.rhino.Node node10 = nodeTraversal9.getCurrentNode();
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue11 = nodeTraversal9.cfgs;
        nodeTraversal3.cfgs = nodeControlFlowGraphQueue11;
        int int13 = nodeTraversal3.getScopeDepth();
        boolean boolean14 = nodeTraversal3.inGlobalScope();
        com.google.javascript.rhino.Node node15 = nodeTraversal3.getCurrentNode();
        com.google.javascript.jscomp.Compiler compiler16 = nodeTraversal3.getCompiler();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal3.traverse(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(compiler16);
    }
}

