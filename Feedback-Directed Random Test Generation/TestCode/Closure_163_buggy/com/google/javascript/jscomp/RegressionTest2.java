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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
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
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        int int8 = idGenerator0.newId();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        int int12 = idGenerator0.newId();
        boolean boolean13 = idGenerator0.hasGeneratedAnyIds();
        int int14 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.lang.String str13 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        java.lang.String str16 = nameInfo7.name;
        java.lang.String str17 = nameInfo7.toString();
        java.lang.Class<?> wildcardClass18 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean12 = nameInfo11.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo11.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        int int5 = idGenerator1.newId();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion10 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule6);
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        boolean boolean12 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        boolean boolean14 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo7.getDeclarations();
        java.lang.String str16 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo7.markReference(jSModule17);
        java.lang.Class<?> wildcardClass19 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo13 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            analyzePrototypeProperties4.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.isReferenced();
        java.lang.String str12 = nameInfo7.name;
        java.lang.String str13 = nameInfo7.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo7.getDeclarations();
        java.lang.Class<?> wildcardClass15 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.String str14 = nameInfo7.name;
        boolean boolean15 = nameInfo7.isReferenced();
        java.lang.String str16 = nameInfo7.name;
        boolean boolean17 = nameInfo7.readsClosureVariables();
        java.lang.String str18 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        int int10 = idGenerator1.newId();
        boolean boolean11 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean12 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean13 = idGenerator1.hasGeneratedAnyIds();
        int int14 = idGenerator1.newId();
        boolean boolean15 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion17 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean9 = nameInfo8.readsClosureVariables();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        int int5 = idGenerator1.newId();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        int int8 = idGenerator1.newId();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        int int10 = idGenerator1.newId();
        boolean boolean11 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion13 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
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
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        int int4 = idGenerator0.newId();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        int int7 = idGenerator0.newId();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        int int9 = idGenerator0.newId();
        int int10 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.readsClosureVariables();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.toString();
        boolean boolean11 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        int int8 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion13 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        java.lang.Class<?> wildcardClass15 = literalProperty5.getClass();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        boolean boolean12 = nameInfo7.isReferenced();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        boolean boolean14 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo7.markReference(jSModule17);
        java.lang.String str19 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        java.lang.Class<?> wildcardClass9 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        int int10 = idGenerator1.newId();
        boolean boolean11 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion13 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo12 = analyzePrototypeProperties4.new NameInfo("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction globalFunction17 = analyzePrototypeProperties4.new GlobalFunction(node13, node14, node15, jSModule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
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
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.name;
        boolean boolean11 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        boolean boolean14 = nameInfo7.readsClosureVariables();
        boolean boolean15 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection12 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection13 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection14 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection12);
        org.junit.Assert.assertNotNull(nameInfoCollection13);
        org.junit.Assert.assertNotNull(nameInfoCollection14);
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        java.lang.String str9 = nameInfo7.name;
        boolean boolean10 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        int int5 = idGenerator1.newId();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion10 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
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
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.readsClosureVariables();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.toString();
        java.lang.String str11 = nameInfo7.toString();
        java.lang.Class<?> wildcardClass12 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        int int9 = idGenerator0.newId();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        int int12 = idGenerator0.newId();
        int int13 = idGenerator0.newId();
        int int14 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo7.name;
        boolean boolean14 = nameInfo7.readsClosureVariables();
        boolean boolean15 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo7.markReference(jSModule16);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.String str14 = nameInfo7.name;
        boolean boolean15 = nameInfo7.isReferenced();
        java.lang.String str16 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo7.markReference(jSModule17);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        int int8 = idGenerator0.newId();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        int int12 = idGenerator0.newId();
        int int13 = idGenerator0.newId();
        int int14 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str10 = nameInfo7.toString();
        java.lang.String str11 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            analyzePrototypeProperties4.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = assignmentProperty2.getValue();
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        java.lang.String str10 = nameInfo9.toString();
        java.lang.String str11 = nameInfo9.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo9.getDeclarations();
        boolean boolean13 = nameInfo9.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_unstubMethod" + "'", str10, "JSCompiler_unstubMethod");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_unstubMethod" + "'", str11, "JSCompiler_unstubMethod");
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
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
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
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
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
        int int8 = idGenerator1.newId();
        int int9 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion11 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        java.lang.String str9 = nameInfo7.name;
        java.lang.Class<?> wildcardClass10 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo7.name;
        java.lang.String str14 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo7.markReference(jSModule15);
        com.google.javascript.jscomp.JSModule jSModule17 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSModule17);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node18 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node19 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        boolean boolean9 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(symbolQueue10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        java.lang.Class<?> wildcardClass8 = idGenerator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        boolean boolean14 = nameInfo7.isReferenced();
        boolean boolean15 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str17 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.String str14 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo7.markReference(jSModule15);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue17 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule18 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertNull(jSModule18);
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
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
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
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        boolean boolean2 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion4 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        int int7 = idGenerator0.newId();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        int int9 = idGenerator0.newId();
        int int10 = idGenerator0.newId();
        boolean boolean11 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        boolean boolean14 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo7.getDeclarations();
        java.lang.String str16 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo7.markReference(jSModule17);
        java.lang.String str19 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        boolean boolean10 = nameInfo7.isReferenced();
        java.lang.String str11 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo7.markReference(jSModule13);
        java.lang.String str15 = nameInfo7.name;
        boolean boolean16 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo7.markReference(jSModule17);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo7.toString();
        boolean boolean14 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        boolean boolean14 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.readsClosureVariables();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.toString();
        java.lang.String str11 = nameInfo7.toString();
        boolean boolean12 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        int int7 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        java.lang.String str12 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo7.markReference(jSModule15);
        boolean boolean17 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo7.name;
        java.lang.String str14 = nameInfo7.name;
        boolean boolean15 = nameInfo7.readsClosureVariables();
        boolean boolean16 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo8.markReference(jSModule9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        boolean boolean10 = nameInfo7.isReferenced();
        java.lang.String str11 = nameInfo7.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(symbolQueue12);
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
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo7.getDeclarations();
        java.lang.String str12 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(symbolQueue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.junit.Assert.assertNull(node11);
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo7.name;
        java.lang.String str14 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.name;
        java.lang.String str11 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        boolean boolean12 = nameInfo7.isReferenced();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        boolean boolean14 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str16 = nameInfo7.toString();
        java.lang.String str17 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        boolean boolean19 = nameInfo7.markReference(jSModule18);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
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
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        int int9 = idGenerator0.newId();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean12 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean13 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean14 = idGenerator0.hasGeneratedAnyIds();
        int int15 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
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
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue7 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNotNull(symbolQueue7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        int int7 = idGenerator0.newId();
        int int8 = idGenerator0.newId();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        boolean boolean10 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        boolean boolean14 = nameInfo7.isReferenced();
        boolean boolean15 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean17 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        int int10 = idGenerator1.newId();
        boolean boolean11 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean12 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean13 = idGenerator1.hasGeneratedAnyIds();
        int int14 = idGenerator1.newId();
        int int15 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion17 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        boolean boolean10 = nameInfo7.isReferenced();
        java.lang.String str11 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(symbolQueue12);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        int int8 = idGenerator0.newId();
        int int9 = idGenerator0.newId();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        com.google.javascript.jscomp.JSModule jSModule16 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule17 = assignmentProperty2.getModule();
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
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = node12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(node16);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo7.markReference(jSModule12);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo7.markReference(jSModule11);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.String str14 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        java.lang.String str10 = nameInfo9.toString();
        boolean boolean11 = nameInfo9.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo9.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_unstubMethod" + "'", str10, "JSCompiler_unstubMethod");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        java.lang.Class<?> wildcardClass9 = literalProperty5.getClass();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        boolean boolean14 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo7.markReference(jSModule16);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue18 = nameInfo7.getDeclarations();
        boolean boolean19 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(symbolQueue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        int int9 = idGenerator0.newId();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean12 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean13 = idGenerator0.hasGeneratedAnyIds();
        int int14 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
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
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo7.markReference(jSModule11);
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jSModule13);
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
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        int int8 = idGenerator0.newId();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        boolean boolean12 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean13 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
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
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
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
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        int int8 = idGenerator0.newId();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
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
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        int int4 = idGenerator0.newId();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        int int7 = idGenerator0.newId();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        boolean boolean14 = nameInfo7.isReferenced();
        boolean boolean15 = nameInfo7.isReferenced();
        java.lang.String str16 = nameInfo7.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue17 = nameInfo7.getDeclarations();
        java.lang.String str18 = nameInfo7.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue19 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(symbolQueue19);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        int int5 = idGenerator1.newId();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
        int int8 = idGenerator1.newId();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion13 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule18 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule19 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(jSModule18);
        org.junit.Assert.assertNull(jSModule19);
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
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.String str14 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo7.markReference(jSModule15);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue17 = nameInfo7.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue18 = nameInfo7.getDeclarations();
        boolean boolean19 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertNotNull(symbolQueue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.String str14 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo7.markReference(jSModule15);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue17 = nameInfo7.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue18 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule19 = null;
        boolean boolean20 = nameInfo7.markReference(jSModule19);
        com.google.javascript.jscomp.JSModule jSModule21 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertNotNull(symbolQueue18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jSModule21);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        boolean boolean12 = nameInfo7.isReferenced();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        boolean boolean14 = nameInfo7.isReferenced();
        java.lang.String str15 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo7.markReference(jSModule16);
        java.lang.String str18 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
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
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
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
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jSModule13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
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
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = node15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        java.lang.String str9 = nameInfo7.name;
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.isReferenced();
        java.lang.String str12 = nameInfo7.toString();
        boolean boolean13 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        int int8 = idGenerator0.newId();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        boolean boolean12 = idGenerator0.hasGeneratedAnyIds();
        int int13 = idGenerator0.newId();
        int int14 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo7.getDeclarations();
        java.lang.Class<?> wildcardClass13 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        boolean boolean2 = idGenerator0.hasGeneratedAnyIds();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        int int5 = idGenerator0.newId();
        int int6 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        java.lang.String str9 = nameInfo7.name;
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.isReferenced();
        java.lang.String str12 = nameInfo7.toString();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        boolean boolean12 = nameInfo7.isReferenced();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        boolean boolean14 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str16 = nameInfo7.toString();
        boolean boolean17 = nameInfo7.isReferenced();
        boolean boolean18 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            analyzePrototypeProperties4.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection7);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        boolean boolean10 = nameInfo7.isReferenced();
        java.lang.String str11 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo7.markReference(jSModule12);
        boolean boolean14 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        boolean boolean10 = nameInfo7.isReferenced();
        java.lang.String str11 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo7.markReference(jSModule13);
        java.lang.String str15 = nameInfo7.name;
        java.lang.String str16 = nameInfo7.name;
        boolean boolean17 = nameInfo7.isReferenced();
        java.lang.String str18 = nameInfo7.toString();
        boolean boolean19 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str9 = nameInfo8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        boolean boolean12 = nameInfo7.isReferenced();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        boolean boolean14 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo7.markReference(jSModule15);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
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
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        int int9 = idGenerator0.newId();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean12 = idGenerator0.hasGeneratedAnyIds();
        int int13 = idGenerator0.newId();
        boolean boolean14 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean15 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        boolean boolean12 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.String str14 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule17 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
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
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.toString();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo7.getDeclarations();
        java.lang.String str13 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(symbolQueue16);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        int int6 = idGenerator1.newId();
        int int7 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion9 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        java.lang.Class<?> wildcardClass7 = assignmentProperty2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        int int10 = idGenerator1.newId();
        int int11 = idGenerator1.newId();
        boolean boolean12 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion14 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
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
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        boolean boolean2 = idGenerator0.hasGeneratedAnyIds();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jSModule14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection6 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection6);
        org.junit.Assert.assertNotNull(nameInfoCollection7);
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
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        int int4 = idGenerator0.newId();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        int int7 = idGenerator0.newId();
        int int8 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        int int5 = idGenerator0.newId();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        boolean boolean12 = nameInfo11.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        java.lang.String str9 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection11 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction globalFunction16 = analyzePrototypeProperties4.new GlobalFunction(node12, node13, node14, jSModule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
        org.junit.Assert.assertNotNull(nameInfoCollection11);
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
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.toString();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo7.getDeclarations();
        java.lang.String str13 = nameInfo7.name;
        java.lang.Class<?> wildcardClass14 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        int int5 = idGenerator1.newId();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion9 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule17 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule18 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(jSModule17);
        org.junit.Assert.assertNull(jSModule18);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        int int8 = idGenerator0.newId();
        int int9 = idGenerator0.newId();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator0.hasGeneratedAnyIds();
        int int12 = idGenerator0.newId();
        int int13 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.String str14 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo7.markReference(jSModule15);
        boolean boolean17 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        boolean boolean19 = nameInfo7.markReference(jSModule18);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        com.google.javascript.jscomp.JSModule jSModule16 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule17 = assignmentProperty2.getModule();
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
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        boolean boolean14 = nameInfo7.isReferenced();
        boolean boolean15 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(symbolQueue16);
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        boolean boolean12 = nameInfo7.isReferenced();
        java.lang.String str13 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        com.google.javascript.jscomp.JSModule jSModule7 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node8 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node9 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node10 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node15 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion11 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
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
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node11 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule18 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node19 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule20 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(jSModule18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(jSModule20);
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
        com.google.javascript.jscomp.JSModule jSModule13 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule15 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = assignmentProperty2.getValue();
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
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction globalFunction15 = analyzePrototypeProperties4.new GlobalFunction(node11, node12, node13, jSModule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
    }
}

