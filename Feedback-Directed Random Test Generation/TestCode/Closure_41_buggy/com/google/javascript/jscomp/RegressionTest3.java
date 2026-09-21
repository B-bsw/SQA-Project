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
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass9 = astFunctionContents1.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable15 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(strIterable15);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass13 = strIterable12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strIterable12);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable12);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        boolean boolean12 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node13 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass13 = astFunctionContents1.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(strIterable13);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        boolean boolean11 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable14 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable15 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node16 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strIterable14);
        org.junit.Assert.assertNotNull(strIterable15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass5 = strIterable4.getClass();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Class<?> wildcardClass8 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean5 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Class<?> wildcardClass9 = astFunctionContents1.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable5);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable15 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node16 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable17 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strIterable15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(strIterable17);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Class<?> wildcardClass5 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable14 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strIterable13);
        org.junit.Assert.assertNotNull(strIterable14);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass9 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        boolean boolean15 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass6 = strIterable5.getClass();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        boolean boolean5 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Class<?> wildcardClass18 = astFunctionContents1.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        boolean boolean5 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Class<?> wildcardClass9 = astFunctionContents1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        boolean boolean12 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean15 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass8 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass14 = astFunctionContents1.getClass();
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable14 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node15 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(strIterable14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable6);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean16 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean17 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        boolean boolean12 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Class<?> wildcardClass5 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass7 = strIterable6.getClass();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean16 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        boolean boolean5 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Class<?> wildcardClass7 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean11 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node12 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable15 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node16 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(strIterable15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node17 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Class<?> wildcardClass9 = astFunctionContents1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents functionContents0 = com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.get();
        boolean boolean1 = functionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node2 = functionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(functionContents0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass14 = astFunctionContents1.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(strIterable13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean11 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean12 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Class<?> wildcardClass13 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strIterable13);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable11 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        boolean boolean11 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean12 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node13 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable14 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean15 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(strIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        boolean boolean11 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean12 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        boolean boolean5 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean15 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable14 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(strIterable14);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node15 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable16 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(strIterable16);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean11 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node12 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable13 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(strIterable13);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        boolean boolean15 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strIterable12);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Class<?> wildcardClass8 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNotNull(strIterable4);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable11 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable15 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(strIterable15);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass9 = strIterable8.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        java.lang.Class<?> wildcardClass5 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable11 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass9 = astFunctionContents1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertNotNull(strIterable13);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable12 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean13 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass7 = astFunctionContents1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Class<?> wildcardClass14 = astFunctionContents1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable6);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Class<?> wildcardClass10 = astFunctionContents1.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable5);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean12 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Class<?> wildcardClass12 = astFunctionContents1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean11 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable5);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Class<?> wildcardClass9 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass10 = strIterable9.getClass();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node16 = astFunctionContents1.getSourceNode();
        boolean boolean17 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean18 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node15 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable13 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertNotNull(strIterable13);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(strIterable12);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(strIterable12);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        java.lang.Class<?> wildcardClass13 = astFunctionContents1.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNotNull(strIterable12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        java.lang.Iterable<java.lang.String> strIterable14 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNotNull(strIterable14);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable15 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strIterable15);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean15 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable17 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strIterable17);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean14 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean15 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node16 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node12 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node12 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable13 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(strIterable13);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Class<?> wildcardClass13 = astFunctionContents1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable12 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(strIterable12);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node12 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean4 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass10 = strIterable9.getClass();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node9 = astFunctionContents1.getSourceNode();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        com.google.javascript.rhino.Node node16 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable10 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        boolean boolean12 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node13 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        astFunctionContents1.recordEscapedVarName("");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node3 = unknownFunctionContents0.getSourceNode();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node9 = unknownFunctionContents0.getSourceNode();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node8 = astFunctionContents1.getSourceNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node11 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        boolean boolean15 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node16 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable17 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node18 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(strIterable17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable11 = astFunctionContents1.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordNonEmptyReturn();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = astFunctionContents1.mayBeFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Class<?> wildcardClass7 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        boolean boolean5 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        boolean boolean6 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean9 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean10 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean8 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(strIterable10);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node8 = unknownFunctionContents0.getSourceNode();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable10 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass11 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strIterable10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable5 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node6 = unknownFunctionContents0.getSourceNode();
        boolean boolean7 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable11 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass12 = strIterable11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strIterable5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strIterable11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("hi!");
        java.lang.Iterable<java.lang.String> strIterable7 = astFunctionContents1.getEscapedVarNames();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node11 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable12 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(strIterable12);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node7 = astFunctionContents1.getSourceNode();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = astFunctionContents1.getEscapedVarNames();
        com.google.javascript.rhino.Node node10 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        astFunctionContents1.recordEscapedVarName("");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean2 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Class<?> wildcardClass3 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordNonEmptyReturn();
        boolean boolean3 = astFunctionContents1.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = astFunctionContents1.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable5 = astFunctionContents1.getEscapedVarNames();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertNotNull(strIterable5);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable11 = unknownFunctionContents0.getEscapedVarNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strIterable11);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean9 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Class<?> wildcardClass11 = unknownFunctionContents0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean2 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node4 = unknownFunctionContents0.getSourceNode();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean10 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean11 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable3 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean5 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean6 = unknownFunctionContents0.mayBeFromExterns();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(strIterable3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        boolean boolean1 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable2 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        boolean boolean4 = unknownFunctionContents0.mayBeFromExterns();
        com.google.javascript.rhino.Node node5 = unknownFunctionContents0.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node7 = unknownFunctionContents0.getSourceNode();
        boolean boolean8 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strIterable2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        boolean boolean2 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node3 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node4 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        java.lang.Iterable<java.lang.String> strIterable6 = astFunctionContents1.getEscapedVarNames();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        boolean boolean8 = astFunctionContents1.mayHaveNonEmptyReturns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents0 = new com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents();
        java.lang.Iterable<java.lang.String> strIterable1 = unknownFunctionContents0.getEscapedVarNames();
        com.google.javascript.rhino.Node node2 = unknownFunctionContents0.getSourceNode();
        boolean boolean3 = unknownFunctionContents0.mayBeFromExterns();
        java.lang.Iterable<java.lang.String> strIterable4 = unknownFunctionContents0.getEscapedVarNames();
        boolean boolean5 = unknownFunctionContents0.mayHaveNonEmptyReturns();
        java.lang.Iterable<java.lang.String> strIterable6 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable7 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable8 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Iterable<java.lang.String> strIterable9 = unknownFunctionContents0.getEscapedVarNames();
        java.lang.Class<?> wildcardClass10 = strIterable9.getClass();
        org.junit.Assert.assertNotNull(strIterable1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strIterable6);
        org.junit.Assert.assertNotNull(strIterable7);
        org.junit.Assert.assertNotNull(strIterable8);
        org.junit.Assert.assertNotNull(strIterable9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents astFunctionContents1 = new com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents(node0);
        astFunctionContents1.recordEscapedVarName("");
        astFunctionContents1.recordNonEmptyReturn();
        com.google.javascript.rhino.Node node5 = astFunctionContents1.getSourceNode();
        com.google.javascript.rhino.Node node6 = astFunctionContents1.getSourceNode();
        boolean boolean7 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        astFunctionContents1.recordEscapedVarName("");
        com.google.javascript.rhino.Node node12 = astFunctionContents1.getSourceNode();
        boolean boolean13 = astFunctionContents1.mayHaveNonEmptyReturns();
        com.google.javascript.rhino.Node node14 = astFunctionContents1.getSourceNode();
        boolean boolean15 = astFunctionContents1.mayHaveNonEmptyReturns();
        astFunctionContents1.recordEscapedVarName("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }
}

