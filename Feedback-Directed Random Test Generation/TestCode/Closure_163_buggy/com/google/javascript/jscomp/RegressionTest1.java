package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo7.markReference(jSModule13);
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        boolean boolean16 = nameInfo7.markReference(jSModule15);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
            literalProperty5.remove();
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        int int8 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion10 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo7.getDeclarations();
        boolean boolean17 = nameInfo7.isReferenced();
        boolean boolean18 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(symbolQueue16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        boolean boolean8 = nameInfo6.markReference(jSModule7);
        boolean boolean9 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean9 = nameInfo7.isReferenced();
        java.lang.String str10 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo7.markReference(jSModule12);
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        int int12 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion14 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.lang.String str13 = nameInfo7.toString();
        java.lang.String str14 = nameInfo7.toString();
        boolean boolean15 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
        int int8 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion10 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        boolean boolean10 = nameInfo7.isReferenced();
        java.lang.String str11 = nameInfo7.toString();
        java.lang.String str12 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str7 = nameInfo6.toString();
        java.lang.String str8 = nameInfo6.name;
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jSModule16.getClass();
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
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        com.google.javascript.jscomp.JSModule jSModule17 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean18 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
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
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction globalFunction13 = analyzePrototypeProperties4.new GlobalFunction(node9, node10, node11, jSModule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str7 = nameInfo6.toString();
        boolean boolean8 = nameInfo6.isReferenced();
        java.lang.String str9 = nameInfo6.name;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        java.lang.String str13 = nameInfo7.toString();
        java.lang.String str14 = nameInfo7.toString();
        java.lang.Class<?> wildcardClass15 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        java.lang.String str9 = nameInfo8.name;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_stubMethod" + "'", str9, "JSCompiler_stubMethod");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            analyzePrototypeProperties4.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection11 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
        org.junit.Assert.assertNotNull(nameInfoCollection11);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str7 = nameInfo6.toString();
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo6.getDeepestCommonModuleRef();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        boolean boolean13 = nameInfo7.readsClosureVariables();
        java.lang.String str14 = nameInfo7.name;
        java.lang.String str15 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            assignmentProperty2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.Class<?> wildcardClass17 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.name;
        boolean boolean13 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        boolean boolean3 = idGenerator1.hasGeneratedAnyIds();
        int int4 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion6 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
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
        org.junit.Assert.assertNotNull(nameInfoCollection5);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        int int12 = idGenerator1.newId();
        int int13 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion15 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        boolean boolean3 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion5 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo11.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo11.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo11.getDeclarations();
        boolean boolean15 = nameInfo11.isReferenced();
        java.lang.Class<?> wildcardClass16 = nameInfo11.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}" + "'", str13, "var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jSModule12.getClass();
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
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
            com.google.javascript.rhino.Node node12 = literalProperty5.getPrototype();
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo7.getDeclarations();
        java.lang.String str15 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = assignmentProperty2.getValue();
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
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = assignmentProperty2.getPrototype();
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
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.Class<?> wildcardClass18 = symbolQueue17.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        int int9 = idGenerator1.newId();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion12 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection10 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo12 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
            literalProperty5.remove();
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        boolean boolean19 = nameInfo7.markReference(jSModule18);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue20 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(symbolQueue20);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        java.lang.String str9 = nameInfo7.name;
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.lang.String str13 = nameInfo7.name;
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        boolean boolean12 = idGenerator0.hasGeneratedAnyIds();
        java.lang.Class<?> wildcardClass13 = idGenerator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        java.lang.String str9 = nameInfo7.toString();
        boolean boolean10 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        int int5 = idGenerator1.newId();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection6 = analyzePrototypeProperties4.getAllNameInfo();
        java.lang.Class<?> wildcardClass7 = nameInfoCollection6.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            analyzePrototypeProperties4.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            analyzePrototypeProperties4.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion12 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        int int8 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion10 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        java.lang.Class<?> wildcardClass9 = idGenerator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.lang.String str14 = nameInfo7.toString();
        java.lang.Class<?> wildcardClass15 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        boolean boolean2 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str7 = nameInfo6.toString();
        java.lang.String str8 = nameInfo6.name;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str10 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo7.markReference(jSModule11);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str15 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        boolean boolean16 = nameInfo7.readsClosureVariables();
        java.lang.String str17 = nameInfo7.name;
        boolean boolean18 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
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
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        int int5 = idGenerator1.newId();
        int int6 = idGenerator1.newId();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        java.lang.String str19 = nameInfo7.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        int int10 = idGenerator1.newId();
        int int11 = idGenerator1.newId();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean17 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule18 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSModule18);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue7 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNotNull(symbolQueue7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        int int5 = idGenerator1.newId();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = assignmentProperty2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion4 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        java.lang.String str10 = nameInfo7.name;
        java.lang.String str11 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo7.markReference(jSModule12);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        int int9 = idGenerator1.newId();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        int int11 = idGenerator1.newId();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        java.lang.Class<?> wildcardClass10 = assignmentProperty2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty assignmentProperty2 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(node0, jSModule1);
        com.google.javascript.jscomp.JSModule jSModule3 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = assignmentProperty2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = assignmentProperty2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = assignmentProperty2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        boolean boolean14 = nameInfo7.isReferenced();
        boolean boolean15 = nameInfo7.isReferenced();
        boolean boolean16 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        int int7 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jSModule12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion12 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.lang.Class<?> wildcardClass16 = literalProperty5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
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
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        int int10 = idGenerator0.newId();
        boolean boolean11 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
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
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo2 = analyzePrototypeProperties0.new NameInfo("JSCompiler_unstubMethod");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo7.getDeclarations();
        boolean boolean11 = nameInfo7.isReferenced();
        java.lang.String str12 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        org.junit.Assert.assertNull(jSModule18);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo7.getDeclarations();
        java.lang.Class<?> wildcardClass13 = symbolQueue12.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo7.getDeclarations();
        java.lang.String str17 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(symbolQueue16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        int int9 = idGenerator1.newId();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator1.hasGeneratedAnyIds();
        int int12 = idGenerator1.newId();
        int int13 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion15 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.readsClosureVariables();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        java.lang.String str14 = nameInfo7.toString();
        java.lang.String str15 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        int int9 = idGenerator1.newId();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        int int11 = idGenerator1.newId();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean10 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(symbolQueue11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection12 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo14 = analyzePrototypeProperties4.new NameInfo("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection15 = analyzePrototypeProperties4.getAllNameInfo();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection12);
        org.junit.Assert.assertNotNull(nameInfoCollection15);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo11.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(symbolQueue12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        int int10 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue18 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule19 = null;
        boolean boolean20 = nameInfo7.markReference(jSModule19);
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
        org.junit.Assert.assertNotNull(symbolQueue18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean16 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue17 = nameInfo7.getDeclarations();
        java.lang.String str18 = nameInfo7.name;
        boolean boolean19 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        int int9 = idGenerator1.newId();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        int int11 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion13 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
            literalProperty5.remove();
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
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
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
            com.google.javascript.rhino.Node node9 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = node12.getClass();
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo7.getDeclarations();
        boolean boolean11 = nameInfo7.isReferenced();
        java.lang.String str12 = nameInfo7.name;
        boolean boolean13 = nameInfo7.readsClosureVariables();
        java.lang.String str14 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        java.lang.String str13 = nameInfo7.name;
        boolean boolean14 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        boolean boolean16 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
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
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
            literalProperty5.remove();
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
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
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        boolean boolean13 = nameInfo7.readsClosureVariables();
        java.lang.String str14 = nameInfo7.toString();
        boolean boolean15 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        boolean boolean12 = idGenerator0.hasGeneratedAnyIds();
        int int13 = idGenerator0.newId();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str10 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        boolean boolean12 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
            literalProperty5.remove();
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        java.lang.Class<?> wildcardClass19 = nameInfo7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.String str7 = nameInfo6.toString();
        java.lang.String str8 = nameInfo6.name;
        boolean boolean9 = nameInfo6.readsClosureVariables();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        boolean boolean21 = nameInfo7.isReferenced();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo11.markReference(jSModule12);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.lang.Class<?> wildcardClass12 = assignmentProperty2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        boolean boolean3 = idGenerator1.hasGeneratedAnyIds();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion7 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection7 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            analyzePrototypeProperties4.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameInfoCollection7);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        boolean boolean14 = idGenerator0.hasGeneratedAnyIds();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
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
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo7.markReference(jSModule9);
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        boolean boolean12 = nameInfo7.markReference(jSModule11);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        boolean boolean13 = nameInfo7.markReference(jSModule12);
        boolean boolean14 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        boolean boolean2 = idGenerator1.hasGeneratedAnyIds();
        int int3 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion5 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("");
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
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = literalProperty5.getPrototype();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        int int15 = idGenerator0.newId();
        int int16 = idGenerator0.newId();
        int int17 = idGenerator0.newId();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
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
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.rhino.Node node6 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        com.google.javascript.jscomp.JSModule jSModule8 = literalProperty5.getModule();
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
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNotNull(symbolQueue13);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
            literalProperty5.remove();
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        java.lang.String str10 = nameInfo7.name;
        java.lang.String str11 = nameInfo7.toString();
        boolean boolean12 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(symbolQueue13);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        com.google.javascript.jscomp.JSModule jSModule11 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        boolean boolean4 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        int int9 = idGenerator1.newId();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        int int16 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion18 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.lang.String str14 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo8 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str9 = nameInfo8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
            literalProperty5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        java.lang.Class<?> wildcardClass14 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        int int7 = idGenerator0.newId();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        int int10 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo7.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue12 = nameInfo7.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue13 = nameInfo7.getDeclarations();
        java.lang.Class<?> wildcardClass14 = symbolQueue13.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(symbolQueue11);
        org.junit.Assert.assertNotNull(symbolQueue12);
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        java.lang.String str9 = nameInfo7.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo7.getDeclarations();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertNotNull(symbolQueue11);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue7 = nameInfo6.getDeclarations();
        org.junit.Assert.assertNotNull(symbolQueue7);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion11 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
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
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.lang.String str13 = nameInfo7.name;
        java.lang.String str14 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo7.markReference(jSModule9);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        boolean boolean18 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        int int14 = idGenerator0.newId();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
            java.lang.Class<?> wildcardClass12 = jSModule11.getClass();
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str9 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        int int9 = idGenerator1.newId();
        boolean boolean10 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean11 = idGenerator1.hasGeneratedAnyIds();
        int int12 = idGenerator1.newId();
        boolean boolean13 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion15 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        int int7 = idGenerator0.newId();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
        boolean boolean7 = nameInfo6.isReferenced();
        boolean boolean8 = nameInfo6.isReferenced();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        int int12 = idGenerator1.newId();
        int int13 = idGenerator1.newId();
        boolean boolean14 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion16 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty literalProperty5 = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(node0, node1, node2, node3, jSModule4);
        com.google.javascript.jscomp.JSModule jSModule6 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node7 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.lang.Class<?> wildcardClass11 = literalProperty5.getClass();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
            com.google.javascript.rhino.Node node11 = literalProperty5.getPrototype();
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.lang.String str14 = nameInfo7.toString();
        java.lang.String str15 = nameInfo7.toString();
        java.lang.Class<?> wildcardClass16 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        com.google.javascript.jscomp.JSModule jSModule14 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo7.getDeclarations();
        boolean boolean16 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        int int5 = idGenerator0.newId();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        int int7 = idGenerator0.newId();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean9 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        int int11 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        java.lang.String str9 = nameInfo7.name;
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str14 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        int int11 = idGenerator1.newId();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.lang.String str15 = nameInfo7.toString();
        boolean boolean16 = nameInfo7.readsClosureVariables();
        java.lang.String str17 = nameInfo7.name;
        boolean boolean18 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.isReferenced();
        java.lang.String str10 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean12 = nameInfo7.readsClosureVariables();
        boolean boolean13 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion11 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
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
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        int int3 = idGenerator0.newId();
        int int4 = idGenerator0.newId();
        boolean boolean5 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator0.hasGeneratedAnyIds();
        int int7 = idGenerator0.newId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("hi!");
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        com.google.javascript.jscomp.JSModule jSModule17 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str18 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        int int5 = idGenerator1.newId();
        int int6 = idGenerator1.newId();
        boolean boolean7 = idGenerator1.hasGeneratedAnyIds();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo11.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo11.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo11.getDeclarations();
        boolean boolean15 = nameInfo11.isReferenced();
        boolean boolean16 = nameInfo11.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}" + "'", str13, "var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion17 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, true);
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        java.lang.String str12 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator0 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int1 = idGenerator0.newId();
        int int2 = idGenerator0.newId();
        boolean boolean3 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean4 = idGenerator0.hasGeneratedAnyIds();
        int int5 = idGenerator0.newId();
        int int6 = idGenerator0.newId();
        boolean boolean7 = idGenerator0.hasGeneratedAnyIds();
        boolean boolean8 = idGenerator0.hasGeneratedAnyIds();
        int int9 = idGenerator0.newId();
        boolean boolean10 = idGenerator0.hasGeneratedAnyIds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        boolean boolean16 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo7.markReference(jSModule17);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, false, false);
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo6 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        boolean boolean8 = nameInfo6.markReference(jSModule7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule10 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean11 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
            java.lang.Class<?> wildcardClass15 = node14.getClass();
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator1 = new com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator();
        int int2 = idGenerator1.newId();
        int int3 = idGenerator1.newId();
        int int4 = idGenerator1.newId();
        boolean boolean5 = idGenerator1.hasGeneratedAnyIds();
        boolean boolean6 = idGenerator1.hasGeneratedAnyIds();
        int int7 = idGenerator1.newId();
        boolean boolean8 = idGenerator1.hasGeneratedAnyIds();
        int int9 = idGenerator1.newId();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion16 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        int int13 = idGenerator1.newId();
        int int14 = idGenerator1.newId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion16 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue11 = nameInfo7.getDeclarations();
        java.lang.String str12 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule13 = nameInfo7.getDeepestCommonModuleRef();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo7.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(symbolQueue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNotNull(symbolQueue14);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        java.lang.String str9 = nameInfo7.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue10 = nameInfo7.getDeclarations();
        boolean boolean11 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(symbolQueue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
            literalProperty5.remove();
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        com.google.javascript.rhino.Node node16 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node17 = literalProperty5.getValue();
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
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection8 = analyzePrototypeProperties4.getAllNameInfo();
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection9 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection12 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo14 = analyzePrototypeProperties4.new NameInfo("JSCompiler_stubMethod");
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo14.getDeclarations();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(nameInfoCollection8);
        org.junit.Assert.assertNotNull(nameInfoCollection9);
        org.junit.Assert.assertNotNull(nameInfoCollection12);
        org.junit.Assert.assertNotNull(symbolQueue15);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule9 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str10 = nameInfo7.toString();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        boolean boolean9 = nameInfo7.isReferenced();
        java.lang.String str10 = nameInfo7.name;
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str12 = nameInfo7.toString();
        java.lang.String str13 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        com.google.javascript.jscomp.JSModule jSModule18 = null;
        boolean boolean19 = nameInfo7.markReference(jSModule18);
        boolean boolean20 = nameInfo7.readsClosureVariables();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule18);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        com.google.javascript.rhino.Node node14 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        java.lang.String str10 = nameInfo9.toString();
        boolean boolean11 = nameInfo9.isReferenced();
        boolean boolean12 = nameInfo9.readsClosureVariables();
        boolean boolean13 = nameInfo9.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue14 = nameInfo9.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo9.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_unstubMethod" + "'", str10, "JSCompiler_unstubMethod");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(symbolQueue14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        com.google.javascript.jscomp.JSModule jSModule13 = literalProperty5.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue16 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        boolean boolean18 = nameInfo7.markReference(jSModule17);
        boolean boolean19 = nameInfo7.isReferenced();
        java.lang.Class<?> wildcardClass20 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(symbolQueue16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        boolean boolean18 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        com.google.javascript.rhino.Node node12 = literalProperty5.getValue();
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = literalProperty5.getPrototype();
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
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        int int12 = idGenerator1.newId();
        int int13 = idGenerator1.newId();
        boolean boolean14 = idGenerator1.hasGeneratedAnyIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CrossModuleMethodMotion crossModuleMethodMotion16 = new com.google.javascript.jscomp.CrossModuleMethodMotion(abstractCompiler0, idGenerator1, false);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        java.lang.String str18 = nameInfo7.toString();
        java.lang.String str19 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.JSModule jSModule8 = nameInfo7.getDeepestCommonModuleRef();
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        boolean boolean10 = nameInfo7.markReference(jSModule9);
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean17 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        boolean boolean14 = nameInfo7.markReference(jSModule13);
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue15 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        boolean boolean17 = nameInfo7.markReference(jSModule16);
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(symbolQueue15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
            literalProperty5.remove();
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        com.google.javascript.jscomp.JSModule jSModule15 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean16 = nameInfo7.isReferenced();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue17 = nameInfo7.getDeclarations();
        java.lang.Class<?> wildcardClass18 = nameInfo7.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(symbolQueue17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.readsClosureVariables();
        boolean boolean9 = nameInfo7.readsClosureVariables();
        java.lang.String str10 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule11 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.name;
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        com.google.javascript.jscomp.JSModule jSModule10 = null;
        boolean boolean11 = nameInfo7.markReference(jSModule10);
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        com.google.javascript.jscomp.JSModule jSModule14 = null;
        boolean boolean15 = nameInfo7.markReference(jSModule14);
        com.google.javascript.jscomp.JSModule jSModule16 = nameInfo7.getDeepestCommonModuleRef();
        boolean boolean17 = nameInfo7.readsClosureVariables();
        java.lang.String str18 = nameInfo7.toString();
        java.lang.String str19 = nameInfo7.name;
        boolean boolean20 = nameInfo7.isReferenced();
        com.google.javascript.jscomp.JSModule jSModule21 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(jSModule21);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.isReferenced();
        boolean boolean9 = nameInfo7.isReferenced();
        boolean boolean10 = nameInfo7.isReferenced();
        boolean boolean11 = nameInfo7.readsClosureVariables();
        boolean boolean12 = nameInfo7.readsClosureVariables();
        boolean boolean13 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        com.google.javascript.jscomp.JSModule jSModule17 = nameInfo7.getDeepestCommonModuleRef();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(symbolQueue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSModule17);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo9 = analyzePrototypeProperties4.new NameInfo("JSCompiler_unstubMethod");
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo11 = analyzePrototypeProperties4.new NameInfo("hi!");
        java.lang.Class<?> wildcardClass12 = analyzePrototypeProperties4.getClass();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        boolean boolean14 = idGenerator0.hasGeneratedAnyIds();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        com.google.javascript.jscomp.JSModule jSModule12 = literalProperty5.getModule();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        java.lang.String str8 = nameInfo7.toString();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        boolean boolean10 = nameInfo7.isReferenced();
        java.lang.String str11 = nameInfo7.toString();
        com.google.javascript.jscomp.JSModule jSModule12 = nameInfo7.getDeepestCommonModuleRef();
        java.lang.String str13 = nameInfo7.toString();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.lang.String str15 = nameInfo7.name;
        boolean boolean16 = nameInfo7.isReferenced();
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        com.google.javascript.rhino.Node node13 = literalProperty5.getValue();
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph1 = null;
        com.google.javascript.jscomp.AnalyzePrototypeProperties analyzePrototypeProperties4 = new com.google.javascript.jscomp.AnalyzePrototypeProperties(abstractCompiler0, jSModuleGraph1, true, true);
        java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> nameInfoCollection5 = analyzePrototypeProperties4.getAllNameInfo();
        com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo7 = analyzePrototypeProperties4.new NameInfo("");
        boolean boolean8 = nameInfo7.readsClosureVariables();
        java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> symbolQueue9 = nameInfo7.getDeclarations();
        java.lang.String str10 = nameInfo7.name;
        org.junit.Assert.assertNotNull(nameInfoCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(symbolQueue9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
    }
}

