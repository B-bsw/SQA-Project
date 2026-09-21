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
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        boolean boolean12 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo6.markReference(jSModule14);
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo6.markReference(jSModule16);
        java.lang.String str18 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue19 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(symbolQueue19);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo8.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo8.markReference(jSModule10);
        java.lang.String str12 = nameInfo8.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo8.getDeclarations();
        boolean boolean14 = nameInfo8.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo8.markReference(jSModule15);
        boolean boolean17 = nameInfo8.readsClosureVariables();
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.name;
        boolean boolean8 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = assignmentProperty2.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }
}

