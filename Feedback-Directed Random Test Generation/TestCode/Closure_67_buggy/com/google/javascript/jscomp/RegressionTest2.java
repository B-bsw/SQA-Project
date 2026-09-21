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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.readsClosureVariables();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        boolean boolean10 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo6.getDeclarations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(symbolQueue11);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        boolean boolean10 = nameInfo6.isReferenced();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection11 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection11);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        boolean boolean10 = nameInfo6.isReferenced();
        java.lang.String str11 = nameInfo6.name;
        java.lang.String str12 = nameInfo6.toString();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str9 = nameInfo8.toString();
        java.lang.String str10 = nameInfo8.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo8.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo8.markReference(jSModule12);
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo8.getDeepestCommonModuleRef();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(symbolQueue11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule17 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(jSModule17);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.Class<?> wildcardClass11 = nameInfo6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = assignmentProperty2.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean10 = nameInfo9.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo9.getDeepestCommonModuleRef();
        java.lang.String str12 = nameInfo9.name;
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.name;
        boolean boolean11 = nameInfo6.isReferenced();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo6.markReference(jSModule13);
        boolean boolean15 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo6.markReference(jSModule17);
        java.lang.Class<?> wildcardClass19 = nameInfo6.getClass();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(symbolQueue16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str12 = nameInfo6.toString();
        boolean boolean13 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo6.markReference(jSModule14);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(symbolQueue16);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo6.markReference(jSModule16);
        java.lang.String str18 = nameInfo6.name;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        boolean boolean12 = nameInfo6.isReferenced();
        java.lang.String str13 = nameInfo6.name;
        boolean boolean14 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        boolean boolean12 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo6.markReference(jSModule14);
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo6.markReference(jSModule16);
        boolean boolean18 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.Class<?> wildcardClass14 = literalProperty5.getClass();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
            literalProperty5.remove();
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        java.lang.String str9 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo2 = analyzePrototypeProperties0.new NameInfo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection11 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection12 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection11);
        org.junit.Assert.assertNotNull(nameInfoCollection12);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean10 = nameInfo9.readsClosureVariables();
        boolean boolean11 = nameInfo9.isReferenced();
        boolean boolean12 = nameInfo9.readsClosureVariables();
        java.lang.String str13 = nameInfo9.name;
        boolean boolean14 = nameInfo9.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo8.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo8.markReference(jSModule10);
        boolean boolean12 = nameInfo8.readsClosureVariables();
        java.lang.String str13 = nameInfo8.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo8.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo8.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str9 = nameInfo8.toString();
        java.lang.String str10 = nameInfo8.name;
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo8.getDeepestCommonModuleRef();
        boolean boolean12 = nameInfo8.readsClosureVariables();
        java.lang.String str13 = nameInfo8.name;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection12 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection12);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo6.markReference(jSModule12);
        java.lang.String str14 = nameInfo6.name;
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        boolean boolean8 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str10 = nameInfo6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str9 = nameInfo8.toString();
        java.lang.String str10 = nameInfo8.name;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node18 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node19 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue18 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(symbolQueue18);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        boolean boolean10 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str15 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo6.markReference(jSModule17);
        java.lang.String str19 = nameInfo6.toString();
        java.lang.String str20 = nameInfo6.name;
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        boolean boolean10 = nameInfo6.readsClosureVariables();
        java.lang.String str11 = nameInfo6.name;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo6.toString();
        boolean boolean14 = nameInfo6.isReferenced();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        java.lang.String str8 = nameInfo6.name;
        java.lang.String str9 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        boolean boolean8 = nameInfo6.markReference(jSModule7);
        java.lang.String str9 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo6.markReference(jSModule12);
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo6.markReference(jSModule14);
        boolean boolean16 = nameInfo6.isReferenced();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo6.getDeclarations();
        boolean boolean13 = nameInfo6.isReferenced();
        java.lang.Class<?> wildcardClass14 = nameInfo6.getClass();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean9 = nameInfo8.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo8.getDeepestCommonModuleRef();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        java.lang.String str12 = nameInfo6.name;
        boolean boolean13 = nameInfo6.isReferenced();
        boolean boolean14 = nameInfo6.readsClosureVariables();
        boolean boolean15 = nameInfo6.isReferenced();
        java.lang.String str16 = nameInfo6.toString();
        java.lang.Class<?> wildcardClass17 = nameInfo6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        java.lang.String str10 = nameInfo6.name;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule17 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(jSModule17);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = node14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        java.lang.String str10 = nameInfo6.name;
        boolean boolean11 = nameInfo6.isReferenced();
        boolean boolean12 = nameInfo6.isReferenced();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
            assignmentProperty2.remove();
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        java.lang.String str8 = nameInfo6.name;
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo6.getDeclarations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(symbolQueue11);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction globalFunction12 = analyzePrototypeProperties4.new GlobalFunction(node8, node9, node10, jSModule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection7);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        java.lang.String str8 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo6.markReference(jSModule9);
        boolean boolean11 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo6.markReference(jSModule9);
        boolean boolean11 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        boolean boolean9 = nameInfo6.isReferenced();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo9.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo9.toString();
        java.lang.String str12 = nameInfo9.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean11 = nameInfo10.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo10.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        boolean boolean10 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        java.lang.String str13 = nameInfo6.toString();
        java.lang.String str14 = nameInfo6.toString();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo6.markReference(jSModule9);
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        boolean boolean13 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo6.getDeclarations();
        java.lang.String str13 = nameInfo6.toString();
        java.lang.String str14 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean16 = nameInfo6.isReferenced();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        boolean boolean8 = nameInfo6.markReference(jSModule7);
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        boolean boolean13 = nameInfo6.isReferenced();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean8 = nameInfo6.isReferenced();
        java.lang.String str9 = nameInfo6.name;
        boolean boolean10 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo8.getDeclarations();
        boolean boolean10 = nameInfo8.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo8.getDeepestCommonModuleRef();
        java.lang.String str12 = nameInfo8.name;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo8.markReference(jSModule13);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        com.google.javascript.jscomp.JSModule jSModule15 = assignmentProperty2.getModule();
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
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo7.markReference(jSModule9);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        boolean boolean9 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo6.getDeclarations();
        boolean boolean12 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo6.markReference(jSModule13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertNotNull(symbolQueue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo7.markReference(jSModule9);
        java.lang.Class<?> wildcardClass11 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        java.lang.String str12 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo6.markReference(jSModule13);
        boolean boolean15 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean17 = nameInfo6.isReferenced();
        java.lang.String str18 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule19 = null;
        boolean boolean20 = nameInfo6.markReference(jSModule19);
        java.lang.String str21 = nameInfo6.name;
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.name;
        boolean boolean8 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        boolean boolean12 = nameInfo6.isReferenced();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule17 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue7 = nameInfo6.getDeclarations();
        java.lang.String str8 = nameInfo6.toString();
        java.lang.String str9 = nameInfo6.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNotNull(symbolQueue7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(symbolQueue10);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        boolean boolean13 = nameInfo6.isReferenced();
        boolean boolean14 = nameInfo6.isReferenced();
        java.lang.String str15 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo6.markReference(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection11 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo13 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean14 = nameInfo13.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo12 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo12.getDeepestCommonModuleRef();
        boolean boolean14 = nameInfo12.isReferenced();
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean9 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo6.getDeepestCommonModuleRef();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jSModule11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        boolean boolean12 = nameInfo6.isReferenced();
        java.lang.String str13 = nameInfo6.name;
        java.lang.String str14 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo6.markReference(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.name;
        java.lang.String str12 = nameInfo6.toString();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection11 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo13 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo13.getDeepestCommonModuleRef();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jSModule14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection11);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo9.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo9.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo9.markReference(jSModule12);
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo9.markReference(jSModule14);
        boolean boolean16 = nameInfo9.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        java.lang.String str11 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.Class<?> wildcardClass13 = nameInfo6.getClass();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue7 = nameInfo6.getDeclarations();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        org.junit.Assert.assertNotNull(symbolQueue7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = assignmentProperty2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        java.lang.String str12 = nameInfo6.name;
        boolean boolean13 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo6.getDeclarations();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertNotNull(symbolQueue15);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        boolean boolean10 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        java.lang.String str13 = nameInfo6.name;
        java.lang.String str14 = nameInfo6.name;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str15 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(symbolQueue16);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = assignmentProperty2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        boolean boolean8 = nameInfo6.isReferenced();
        java.lang.String str9 = nameInfo6.toString();
        boolean boolean10 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        java.lang.Class<?> wildcardClass12 = literalProperty5.getClass();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = assignmentProperty2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean10 = nameInfo9.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo9.getDeepestCommonModuleRef();
        boolean boolean12 = nameInfo9.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        boolean boolean10 = nameInfo6.isReferenced();
        java.lang.String str11 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo6.markReference(jSModule12);
        boolean boolean14 = nameInfo6.readsClosureVariables();
        boolean boolean15 = nameInfo6.readsClosureVariables();
        java.lang.String str16 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str17 = nameInfo6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        boolean boolean8 = nameInfo6.readsClosureVariables();
        java.lang.String str9 = nameInfo6.toString();
        boolean boolean10 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str9 = nameInfo8.name;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule18 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(jSModule18);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        java.lang.String str8 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        java.lang.String str12 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo6.markReference(jSModule13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        boolean boolean8 = nameInfo6.isReferenced();
        java.lang.String str9 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        java.lang.String str12 = nameInfo6.name;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        java.lang.String str12 = nameInfo6.name;
        boolean boolean13 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean10 = nameInfo9.readsClosureVariables();
        boolean boolean11 = nameInfo9.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo9.markReference(jSModule12);
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo9.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        boolean boolean11 = nameInfo6.isReferenced();
        java.lang.String str12 = nameInfo6.toString();
        boolean boolean13 = nameInfo6.readsClosureVariables();
        java.lang.String str14 = nameInfo6.name;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node18 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        boolean boolean8 = nameInfo6.isReferenced();
        java.lang.String str9 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo6.markReference(jSModule12);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        java.lang.String str12 = nameInfo6.name;
        boolean boolean13 = nameInfo6.isReferenced();
        boolean boolean14 = nameInfo6.readsClosureVariables();
        boolean boolean15 = nameInfo6.isReferenced();
        boolean boolean16 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule17 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        boolean boolean19 = nameInfo6.markReference(jSModule18);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSModule17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            analyzePrototypeProperties4.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.toString();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        boolean boolean13 = nameInfo6.isReferenced();
        java.lang.Class<?> wildcardClass14 = nameInfo6.getClass();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        boolean boolean8 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean10 = nameInfo6.isReferenced();
        boolean boolean11 = nameInfo6.isReferenced();
        boolean boolean12 = nameInfo6.isReferenced();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection12 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection12);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
            assignmentProperty2.remove();
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo6.markReference(jSModule16);
        com.google.javascript.jscomp.JSModule jSModule18 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSModule18);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean8 = nameInfo6.isReferenced();
        boolean boolean9 = nameInfo6.isReferenced();
        java.lang.String str10 = nameInfo6.name;
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        java.lang.String str12 = nameInfo6.name;
        boolean boolean13 = nameInfo6.isReferenced();
        boolean boolean14 = nameInfo6.readsClosureVariables();
        boolean boolean15 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.toString();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        java.lang.String str13 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
            com.google.javascript.rhino.Node node15 = assignmentProperty2.getValue();
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
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        java.lang.String str12 = nameInfo6.toString();
        java.lang.String str13 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo12 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo12.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo12.name;
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo12.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
            com.google.javascript.rhino.Node node15 = assignmentProperty2.getValue();
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
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection11 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo13 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction globalFunction18 = analyzePrototypeProperties4.new GlobalFunction(node14, node15, node16, jSModule17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection11);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        boolean boolean8 = nameInfo6.markReference(jSModule7);
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.name;
        java.lang.String str11 = nameInfo6.name;
        java.lang.String str12 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo6.getDeclarations();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        java.lang.String str10 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        boolean boolean13 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str9 = nameInfo8.name;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        boolean boolean8 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node18 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule19 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(jSModule19);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        java.lang.String str10 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        boolean boolean13 = nameInfo6.isReferenced();
        boolean boolean14 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        java.lang.Class<?> wildcardClass12 = literalProperty5.getClass();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = assignmentProperty2.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo12 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo12.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo12.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo12.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(symbolQueue15);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo6.markReference(jSModule9);
        java.lang.String str11 = nameInfo6.toString();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str9 = nameInfo8.toString();
        java.lang.String str10 = nameInfo8.name;
        java.lang.String str11 = nameInfo8.name;
        java.lang.Class<?> wildcardClass12 = nameInfo8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.name;
        boolean boolean11 = nameInfo6.isReferenced();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo6.markReference(jSModule13);
        boolean boolean15 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo6.getDeclarations();
        boolean boolean17 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(symbolQueue16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        boolean boolean10 = nameInfo6.isReferenced();
        java.lang.String str11 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo6.markReference(jSModule12);
        boolean boolean14 = nameInfo6.readsClosureVariables();
        boolean boolean15 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean17 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        java.lang.Class<?> wildcardClass11 = symbolQueue10.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.name;
        boolean boolean11 = nameInfo6.isReferenced();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        boolean boolean13 = nameInfo6.readsClosureVariables();
        java.lang.String str14 = nameInfo6.name;
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = assignmentProperty2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        boolean boolean12 = nameInfo6.isReferenced();
        java.lang.String str13 = nameInfo6.name;
        boolean boolean14 = nameInfo6.readsClosureVariables();
        java.lang.Class<?> wildcardClass15 = nameInfo6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo6.markReference(jSModule12);
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str15 = nameInfo6.name;
        java.lang.Class<?> wildcardClass16 = nameInfo6.getClass();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction globalFunction14 = analyzePrototypeProperties4.new GlobalFunction(node10, node11, node12, jSModule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection5);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        java.lang.String str8 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo6.markReference(jSModule9);
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        java.lang.String str12 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo6.markReference(jSModule13);
        java.lang.String str15 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean17 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection6 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        java.lang.Class<?> wildcardClass13 = literalProperty5.getClass();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo9.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo9.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo9.markReference(jSModule12);
        java.lang.String str14 = nameInfo9.name;
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = assignmentProperty2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        java.lang.String str8 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        java.lang.String str10 = nameInfo6.name;
        java.lang.String str11 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo12 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean13 = nameInfo12.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str9 = nameInfo6.name;
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        java.lang.String str9 = nameInfo6.name;
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo7.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo6.markReference(jSModule12);
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str15 = nameInfo6.name;
        java.lang.String str16 = nameInfo6.toString();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo10 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str11 = nameInfo10.name;
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo10.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo10.toString();
        boolean boolean14 = nameInfo10.isReferenced();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        boolean boolean8 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo6.markReference(jSModule9);
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        java.lang.String str8 = nameInfo6.name;
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo6.name;
        java.lang.String str14 = nameInfo6.name;
        java.lang.String str15 = nameInfo6.name;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.lang.Class<?> wildcardClass12 = literalProperty5.getClass();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo13 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean14 = nameInfo13.readsClosureVariables();
        java.lang.String str15 = nameInfo13.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        boolean boolean12 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo6.markReference(jSModule14);
        java.lang.String str16 = nameInfo6.name;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        java.lang.Class<?> wildcardClass17 = nameInfo8.getClass();
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean10 = nameInfo9.readsClosureVariables();
        boolean boolean11 = nameInfo9.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo9.markReference(jSModule12);
        java.lang.String str14 = nameInfo9.name;
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo6.markReference(jSModule12);
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo6.markReference(jSModule14);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.name;
        boolean boolean11 = nameInfo6.isReferenced();
        boolean boolean12 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo6.markReference(jSModule13);
        boolean boolean15 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo6.markReference(jSModule17);
        java.lang.String str19 = nameInfo6.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue20 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(symbolQueue16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(symbolQueue20);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        boolean boolean10 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        boolean boolean15 = nameInfo6.readsClosureVariables();
        boolean boolean16 = nameInfo6.isReferenced();
        boolean boolean17 = nameInfo6.isReferenced();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        boolean boolean12 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo6.getDeclarations();
        java.lang.String str14 = nameInfo6.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo6.getDeclarations();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(symbolQueue15);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = assignmentProperty2.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo8.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo8.markReference(jSModule10);
        boolean boolean12 = nameInfo8.readsClosureVariables();
        java.lang.String str13 = nameInfo8.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo8.getDeclarations();
        boolean boolean15 = nameInfo8.isReferenced();
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
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
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        java.lang.String str11 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        java.lang.Class<?> wildcardClass12 = literalProperty5.getClass();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        boolean boolean10 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo6.name;
        boolean boolean15 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo6.markReference(jSModule9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo6.getDeclarations();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNotNull(symbolQueue12);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str15 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo6.markReference(jSModule17);
        java.lang.String str19 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule20 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jSModule20);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection9);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSModule9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue8 = nameInfo6.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        boolean boolean10 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(symbolQueue8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        java.lang.Class<?> wildcardClass8 = nameInfoCollection7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
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
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo6.markReference(jSModule10);
        java.lang.String str12 = nameInfo6.name;
        boolean boolean13 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        boolean boolean15 = nameInfo6.isReferenced();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.readsClosureVariables();
        java.lang.String str8 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(symbolQueue10);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo6.getDeclarations();
        boolean boolean13 = nameInfo6.isReferenced();
        java.lang.String str14 = nameInfo6.toString();
        java.lang.String str15 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo6.getDeepestCommonModuleRef();
        boolean boolean17 = nameInfo6.isReferenced();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection6 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean9 = nameInfo8.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str12 = nameInfo11.name;
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        boolean boolean9 = nameInfo6.markReference(jSModule8);
        boolean boolean10 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        java.lang.String str13 = nameInfo6.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        java.lang.String str8 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        java.lang.Class<?> wildcardClass10 = nameInfo6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule17 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node18 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = node18.getClass();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.lang.String str10 = nameInfo6.toString();
        boolean boolean11 = nameInfo6.readsClosureVariables();
        java.lang.String str12 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo6.getDeclarations();
        boolean boolean14 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        boolean boolean10 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo6.getDeclarations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(symbolQueue15);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node18 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule19 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node20 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(jSModule19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node18 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        java.lang.String str13 = nameInfo6.toString();
        boolean boolean14 = nameInfo6.isReferenced();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo8.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo8.markReference(jSModule10);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo8.getDeclarations();
        java.lang.String str13 = nameInfo8.name;
        java.lang.String str14 = nameInfo8.toString();
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
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
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        boolean boolean10 = nameInfo6.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo6.markReference(jSModule11);
        java.lang.String str13 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo6.getDeclarations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo8.getDeclarations();
        boolean boolean10 = nameInfo8.isReferenced();
        boolean boolean11 = nameInfo8.isReferenced();
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.name;
        java.lang.String str12 = nameInfo6.name;
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection12 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo14 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction globalFunction19 = analyzePrototypeProperties4.new GlobalFunction(node15, node16, node17, jSModule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNotNull(nameInfoCollection12);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str8 = nameInfo6.toString();
        boolean boolean9 = nameInfo6.isReferenced();
        boolean boolean10 = nameInfo6.isReferenced();
        java.lang.String str11 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo6.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo6.getDeclarations();
        boolean boolean14 = nameInfo6.isReferenced();
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.String str11 = nameInfo6.toString();
        java.lang.String str12 = nameInfo6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        boolean boolean9 = nameInfo6.readsClosureVariables();
        boolean boolean10 = nameInfo6.readsClosureVariables();
        boolean boolean11 = nameInfo6.isReferenced();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo6.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo6.getDeepestCommonModuleRef();
        java.lang.Class<?> wildcardClass11 = nameInfo6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo12 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo12.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo12.name;
        boolean boolean15 = nameInfo12.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo12.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule17 = nameInfo12.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }
}

