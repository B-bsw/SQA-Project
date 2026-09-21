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
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isGlobal();
        com.google.javascript.rhino.jstype.JSType jSType9 = arguments6.getType();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = arguments6.input;
        int int11 = arguments6.index;
        com.google.javascript.rhino.Node node12 = arguments6.getNameNode();
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(scope13);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        com.google.javascript.jscomp.Scope scope8 = arguments6.getScope();
        java.lang.String str9 = arguments6.name;
        java.lang.String str10 = arguments6.getName();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        com.google.javascript.rhino.Node node14 = arguments6.nameNode;
        boolean boolean15 = arguments6.isTypeInferred();
        com.google.javascript.jscomp.Scope scope16 = arguments6.getScope();
        com.google.javascript.jscomp.Scope scope17 = scope16.getGlobalScope();
        java.lang.Class<?> wildcardClass18 = scope16.getClass();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        arguments10.resolveType(errorReporter14);
        boolean boolean16 = arguments10.isConst();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getDeclarativelyUnboundVarsWithoutTypes();
        int int21 = scope19.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = scope19.getTypeOfThis();
        boolean boolean23 = arguments10.equals((java.lang.Object) scope19);
        boolean boolean24 = scope19.isGlobal();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        int int14 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Var var16 = scope2.getVar("arguments");
        boolean boolean17 = scope2.isLocal();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        com.google.javascript.jscomp.Scope.Var var25 = arguments24.getDeclaration();
        boolean boolean27 = arguments24.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = arguments24.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope29 = arguments24.scope;
        com.google.javascript.jscomp.Scope.Var var30 = arguments24.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare((com.google.javascript.jscomp.Scope.Var) arguments24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(varItor21);
        org.junit.Assert.assertNull(var23);
        org.junit.Assert.assertNull(var25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertNotNull(scope29);
        org.junit.Assert.assertNotNull(var30);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope4 = scope3.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var5 = scope3.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = var5.getNameNode();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(scope4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        boolean boolean12 = arguments11.isDefine();
        boolean boolean13 = arguments11.isGlobal();
        com.google.javascript.rhino.Node node14 = arguments11.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments11);
        boolean boolean16 = arguments11.isConst();
        java.lang.String str17 = arguments11.getInputName();
        boolean boolean18 = arguments11.isGlobal();
        boolean boolean19 = arguments11.isConst();
        java.lang.String str20 = arguments11.getName();
        com.google.javascript.jscomp.Scope scope21 = arguments11.scope;
        boolean boolean22 = scope21.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = scope21.getAllSymbols();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = scope21.getTypeOfThis();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arguments" + "'", str20, "arguments");
        org.junit.Assert.assertNotNull(scope21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(varIterable23);
        org.junit.Assert.assertNull(objectType24);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.Node node13 = arguments10.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean17 = scope2.isDeclared("Scope.Var arguments{null}", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        com.google.javascript.jscomp.Scope.Var var26 = arguments25.getDeclaration();
        boolean boolean28 = arguments25.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = arguments25.getJSDocInfo();
        boolean boolean30 = arguments25.isLocal();
        boolean boolean31 = arguments25.isTypeInferred();
        com.google.javascript.jscomp.Scope scope32 = arguments25.scope;
        boolean boolean33 = arguments25.isTypeInferred();
        java.lang.String str34 = arguments25.getName();
        boolean boolean35 = arguments25.isConst();
        boolean boolean36 = arguments25.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare((com.google.javascript.jscomp.Scope.Var) arguments25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertNotNull(varItor22);
        org.junit.Assert.assertNull(var24);
        org.junit.Assert.assertNull(var26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jSDocInfo29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(scope32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arguments" + "'", str34, "arguments");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        boolean boolean15 = arguments6.isExtern();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = arguments6.getJSDocInfo();
        boolean boolean17 = arguments6.isNoShadow();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments6.getInput();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jSDocInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(compilerInput18);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        boolean boolean12 = arguments11.isDefine();
        boolean boolean13 = arguments11.isGlobal();
        com.google.javascript.rhino.Node node14 = arguments11.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments11);
        boolean boolean16 = arguments11.isConst();
        java.lang.String str17 = arguments11.getInputName();
        boolean boolean18 = arguments11.isGlobal();
        boolean boolean19 = arguments11.isConst();
        java.lang.String str20 = arguments11.getName();
        boolean boolean21 = arguments11.isDefine;
        com.google.javascript.rhino.jstype.JSType jSType22 = arguments11.getType();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arguments" + "'", str20, "arguments");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        boolean boolean12 = arguments6.isExtern();
        boolean boolean13 = arguments6.isDefine;
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = arguments6.getJSDocInfo();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSDocInfo14);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.jscomp.Scope scope9 = scope8.getGlobalScope();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope12.getVars();
        com.google.javascript.jscomp.Scope.Var var15 = scope12.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope12);
        boolean boolean17 = arguments16.isDefine();
        boolean boolean18 = arguments16.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope8.getScope((com.google.javascript.jscomp.Scope.Var) arguments16);
        com.google.javascript.rhino.Node node20 = arguments16.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType21 = arguments16.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments16);
        com.google.javascript.rhino.Node node23 = arguments16.getNameNode();
        com.google.javascript.rhino.Node node24 = arguments16.getNameNode();
        boolean boolean25 = arguments16.isLocal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        com.google.javascript.rhino.Node node14 = arguments6.nameNode;
        boolean boolean15 = arguments6.isTypeInferred();
        boolean boolean16 = arguments6.isTypeInferred();
        int int17 = arguments6.index;
        java.lang.String str18 = arguments6.name;
        com.google.javascript.rhino.Node node19 = arguments6.getParentNode();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arguments" + "'", str18, "arguments");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        com.google.javascript.rhino.Node node14 = arguments6.nameNode;
        boolean boolean15 = arguments6.isTypeInferred();
        boolean boolean16 = arguments6.isTypeInferred();
        com.google.javascript.jscomp.Scope scope17 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Var var18 = scope17.getArgumentsVar();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        com.google.javascript.jscomp.Scope.Var var12 = arguments11.getDeclaration();
        boolean boolean14 = arguments11.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = arguments11.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope16 = arguments11.scope;
        com.google.javascript.jscomp.Scope.Var var17 = arguments11.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var17);
        com.google.javascript.jscomp.Scope.Var var20 = scope2.getVar("arguments");
        boolean boolean23 = scope2.isDeclared("<non-file>", false);
        com.google.javascript.jscomp.Scope scope24 = scope2.getGlobalScope();
        int int25 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(jSTypeStaticScope18);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(scope24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        boolean boolean11 = arguments6.isLocal();
        boolean boolean12 = arguments6.isTypeInferred();
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.rhino.Node node14 = arguments6.getNode();
        java.lang.String str15 = arguments6.name;
        com.google.javascript.rhino.Node node16 = arguments6.getNode();
        boolean boolean17 = arguments6.isDefine;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isExtern();
        java.lang.String str16 = arguments10.getInputName();
        com.google.javascript.rhino.Node node17 = arguments10.getParentNode();
        boolean boolean18 = arguments10.isDefine();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int11 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Arguments arguments12 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = scope2.isBottom();
        int int15 = scope2.getVarCount();
        int int16 = scope2.getVarCount();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNotNull(varIterable7);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        com.google.javascript.jscomp.Scope scope8 = arguments6.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope8.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope8.getSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        int int7 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope8 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isLocal();
        com.google.javascript.rhino.Node node16 = arguments10.nameNode;
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = arguments10.getJSDocInfo();
        com.google.javascript.rhino.Node node18 = arguments10.nameNode;
        boolean boolean19 = arguments10.isDefine();
        java.lang.String str20 = arguments10.getName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(jSDocInfo17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arguments" + "'", str20, "arguments");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        java.lang.String str15 = arguments6.getName();
        java.lang.String str16 = arguments6.name;
        com.google.javascript.rhino.Node node17 = arguments6.getNode();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments6.getInput();
        boolean boolean19 = arguments6.isDefine();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = arguments6.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(compilerInput18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("arguments");
        com.google.javascript.jscomp.Scope.Var var13 = scope2.getArgumentsVar();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.rhino.Node node4 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getVars();
        int int7 = scope5.getVarCount();
        com.google.javascript.jscomp.Scope scope8 = scope5.getGlobalScope();
        boolean boolean9 = scope8.isLocal();
        int int10 = scope8.getDepth();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isGlobal();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = arguments6.input;
        com.google.javascript.rhino.Node node10 = arguments6.getNameNode();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope2.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("", node12, jSType13, compilerInput14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isDefine;
        int int9 = arguments6.index;
        com.google.javascript.jscomp.Scope scope10 = arguments6.scope;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope10.declare("Scope.Var arguments{null}", node12, jSType13, compilerInput14, true);
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        boolean boolean11 = arguments6.isLocal();
        boolean boolean12 = arguments6.isTypeInferred();
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        boolean boolean14 = arguments6.isTypeInferred();
        java.lang.String str15 = arguments6.getName();
        java.lang.String str16 = arguments6.getName();
        com.google.javascript.rhino.Node node17 = arguments6.getParentNode();
        com.google.javascript.jscomp.Scope.Var var18 = arguments6.getDeclaration();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(var18);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = arguments6.getParentNode();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = arguments6.input;
        java.lang.String str9 = arguments6.getName();
        boolean boolean10 = arguments6.isDefine;
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(scope11);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        com.google.javascript.rhino.Node node15 = arguments6.getNode();
        boolean boolean16 = arguments6.isDefine;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope19.getAllSymbols();
        int int21 = scope19.getDepth();
        int int22 = scope19.getVarCount();
        boolean boolean23 = arguments6.equals((java.lang.Object) scope19);
        com.google.javascript.jscomp.Scope scope24 = scope19.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(scope24);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = arguments6.getInputName();
        com.google.javascript.rhino.Node node11 = arguments6.getParentNode();
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = var12.input;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(compilerInput13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getVar("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope7.getVars();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        int int8 = scope2.getDepth();
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        java.lang.Object obj11 = null;
        boolean boolean12 = arguments6.equals(obj11);
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = arguments6.getJSDocInfo();
        boolean boolean15 = arguments6.isExtern();
        com.google.javascript.jscomp.CompilerInput compilerInput16 = arguments6.getInput();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = arguments6.input;
        boolean boolean18 = arguments6.isGlobal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(compilerInput16);
        org.junit.Assert.assertNull(compilerInput17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = var4.index;
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput7 = var6.input;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(compilerInput7);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = arguments6.getInputName();
        com.google.javascript.rhino.Node node11 = arguments6.getParentNode();
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = var12.getJSDocInfo();
        boolean boolean14 = var12.isConst();
        com.google.javascript.jscomp.Scope.Var var15 = var12.getSymbol();
        com.google.javascript.jscomp.Scope scope16 = var15.getScope();
        boolean boolean17 = var15.isLocal();
        boolean boolean18 = var15.isTypeInferred();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = arguments10.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope2.getVars();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNotNull(varItor15);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        boolean boolean15 = arguments6.isExtern();
        com.google.javascript.rhino.Node node16 = arguments6.getNameNode();
        com.google.javascript.jscomp.Scope.Var var17 = arguments6.getDeclaration();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(var17);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getOwnSlot("arguments");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.jscomp.Scope scope11 = scope10.getGlobalScope();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getVars();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        boolean boolean19 = arguments18.isDefine();
        boolean boolean20 = arguments18.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope10.getScope((com.google.javascript.jscomp.Scope.Var) arguments18);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        arguments18.resolveType(errorReporter22);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments18);
        com.google.javascript.jscomp.Scope scope25 = arguments18.scope;
        com.google.javascript.jscomp.Scope.Var var26 = arguments18.getDeclaration();
        boolean boolean27 = arguments18.isLocal();
        java.lang.String str28 = arguments18.toString();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope21);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNotNull(scope25);
        org.junit.Assert.assertNull(var26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Scope.Var arguments{null}" + "'", str28, "Scope.Var arguments{null}");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        java.lang.Object obj11 = null;
        boolean boolean12 = arguments6.equals(obj11);
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope15 = arguments6.scope;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNotNull(scope15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = arguments6.getParentNode();
        java.lang.String str8 = arguments6.name;
        int int9 = arguments6.index;
        com.google.javascript.rhino.Node node10 = arguments6.nameNode;
        boolean boolean11 = arguments6.isExtern();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var11 = arguments6.getSymbol();
        com.google.javascript.rhino.Node node12 = var11.getParentNode();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = var11.input;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(compilerInput13);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getOwnSlot("arguments");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.jscomp.Scope scope11 = scope10.getGlobalScope();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getVars();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        boolean boolean19 = arguments18.isDefine();
        boolean boolean20 = arguments18.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope10.getScope((com.google.javascript.jscomp.Scope.Var) arguments18);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        arguments18.resolveType(errorReporter22);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments18);
        com.google.javascript.jscomp.Scope scope25 = arguments18.scope;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = scope25.getTypeOfThis();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope21);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNotNull(scope25);
        org.junit.Assert.assertNull(objectType26);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        java.lang.String str8 = arguments6.name;
        com.google.javascript.rhino.Node node9 = arguments6.getNode();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = arguments6.input;
        java.lang.String str11 = arguments6.getInputName();
        com.google.javascript.jscomp.Scope scope12 = arguments6.scope;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
        org.junit.Assert.assertNotNull(scope12);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        int int7 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope8 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        boolean boolean12 = scope2.isLocal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        com.google.javascript.jscomp.Scope.Var var12 = arguments11.getDeclaration();
        boolean boolean14 = arguments11.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = arguments11.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope16 = arguments11.scope;
        com.google.javascript.jscomp.Scope.Var var17 = arguments11.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var17);
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var17.getJSDocInfo();
        boolean boolean20 = var17.isDefine();
        com.google.javascript.jscomp.Scope scope21 = var17.scope;
        java.lang.String str22 = var17.getInputName();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        var17.resolveType(errorReporter23);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(jSTypeStaticScope18);
        org.junit.Assert.assertNull(jSDocInfo19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(scope21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<non-file>" + "'", str22, "<non-file>");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments4 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str5 = arguments4.getInputName();
        com.google.javascript.rhino.jstype.JSType jSType6 = arguments4.getType();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(jSType6);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        boolean boolean15 = arguments6.isExtern();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = arguments6.getJSDocInfo();
        boolean boolean17 = arguments6.isNoShadow();
        java.lang.String str18 = arguments6.toString();
        com.google.javascript.jscomp.Scope.Var var19 = arguments6.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = arguments6.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jSDocInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Scope.Var arguments{null}" + "'", str18, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(var19);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        java.lang.String str13 = var12.getName();
        java.lang.String str14 = var12.getInputName();
        boolean boolean15 = var12.isGlobal();
        java.lang.String str16 = var12.name;
        com.google.javascript.jscomp.Scope scope17 = var12.getScope();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertNotNull(scope17);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = arguments6.input;
        boolean boolean12 = arguments6.isLocal();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = arguments6.getInput();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = compilerInput13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(compilerInput13);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        boolean boolean17 = arguments6.equals((java.lang.Object) objectType16);
        boolean boolean18 = arguments6.isDefine;
        com.google.javascript.jscomp.Scope.Var var19 = arguments6.getSymbol();
        boolean boolean20 = var19.isLocal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(var19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        boolean boolean11 = arguments6.isLocal();
        boolean boolean12 = arguments6.isTypeInferred();
        java.lang.String str13 = arguments6.toString();
        com.google.javascript.jscomp.Scope scope14 = arguments6.getScope();
        com.google.javascript.rhino.Node node15 = arguments6.getNameNode();
        com.google.javascript.rhino.Node node16 = arguments6.getParentNode();
        boolean boolean17 = arguments6.isExtern();
        com.google.javascript.rhino.Node node18 = arguments6.getNameNode();
        boolean boolean19 = arguments6.isGlobal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Scope.Var arguments{null}" + "'", str13, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isLocal();
        boolean boolean16 = arguments10.isNoShadow();
        boolean boolean17 = arguments10.isExtern();
        boolean boolean18 = arguments10.isConst();
        boolean boolean19 = arguments10.isGlobal();
        boolean boolean20 = arguments10.isLocal();
        int int21 = arguments10.index;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = arguments6.input;
        boolean boolean12 = arguments6.isLocal();
        com.google.javascript.rhino.Node node13 = arguments6.getNameNode();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = arguments6.getInputName();
        com.google.javascript.jscomp.Scope.Var var11 = arguments6.getDeclaration();
        com.google.javascript.rhino.Node node12 = arguments6.getNode();
        com.google.javascript.jscomp.Scope.Var var13 = arguments6.getSymbol();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = arguments6.getInputName();
        int int11 = arguments6.index;
        com.google.javascript.rhino.jstype.JSType jSType12 = arguments6.getType();
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        com.google.javascript.jscomp.Scope scope14 = arguments6.getScope();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(scope14);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        java.lang.Object obj11 = null;
        boolean boolean12 = arguments6.equals(obj11);
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.CompilerInput compilerInput15 = arguments6.input;
        boolean boolean16 = arguments6.isLocal();
        java.lang.String str17 = arguments6.name;
        boolean boolean18 = arguments6.isNoShadow();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNull(compilerInput15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        int int12 = scope11.getDepth();
        com.google.javascript.jscomp.Scope.Var var14 = scope11.getVar("");
        boolean boolean15 = scope11.isBottom();
        int int16 = scope11.getDepth();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope11.declare("", node18, jSType19, compilerInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        java.lang.String str15 = arguments6.getName();
        java.lang.String str16 = arguments6.name;
        com.google.javascript.rhino.Node node17 = arguments6.getNode();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments6.input;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(compilerInput18);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        com.google.javascript.rhino.Node node15 = arguments6.getNode();
        boolean boolean16 = arguments6.isDefine;
        boolean boolean17 = arguments6.isNoShadow();
        com.google.javascript.jscomp.Scope scope18 = arguments6.scope;
        boolean boolean19 = arguments6.isExtern();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("Scope.Var arguments{null}", node6, jSType7, compilerInput8, true);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        arguments10.resolveType(errorReporter14);
        boolean boolean16 = arguments10.isExtern();
        com.google.javascript.jscomp.Scope.Var var17 = arguments10.getSymbol();
        com.google.javascript.rhino.Node node18 = var17.nameNode;
        com.google.javascript.jscomp.Scope scope19 = var17.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput20 = var17.input;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        var17.resolveType(errorReporter21);
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(scope19);
        org.junit.Assert.assertNull(compilerInput20);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.Node node14 = arguments10.nameNode;
        com.google.javascript.jscomp.Scope scope15 = arguments10.getScope();
        com.google.javascript.rhino.jstype.JSType jSType16 = arguments10.getType();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isGlobal();
        java.lang.String str9 = arguments6.name;
        boolean boolean10 = arguments6.isTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType11 = arguments6.getType();
        com.google.javascript.rhino.Node node12 = arguments6.getNode();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isExtern();
        java.lang.String str16 = arguments10.getInputName();
        com.google.javascript.jscomp.Scope.Var var17 = arguments10.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType18 = arguments10.getType();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            arguments10.setType(jSType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isDefine();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = arguments6.getInput();
        java.lang.String str15 = arguments6.getName();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNull(compilerInput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        int int8 = scope7.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope7.getVars();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope12.getVars();
        com.google.javascript.jscomp.Scope.Var var15 = scope12.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope12);
        com.google.javascript.jscomp.Scope.Var var17 = arguments16.getDeclaration();
        boolean boolean19 = arguments16.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = arguments16.getJSDocInfo();
        boolean boolean21 = arguments16.isLocal();
        com.google.javascript.rhino.Node node22 = arguments16.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope7.getScope((com.google.javascript.jscomp.Scope.Var) arguments16);
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(jSTypeStaticScope23);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        boolean boolean12 = arguments11.isDefine();
        boolean boolean13 = arguments11.isGlobal();
        com.google.javascript.rhino.Node node14 = arguments11.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments11);
        boolean boolean16 = scope2.isGlobal();
        com.google.javascript.rhino.Node node17 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getVar("");
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(var13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        int int5 = scope2.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getVars();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        boolean boolean19 = arguments18.isDefine();
        boolean boolean20 = arguments18.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope10.getReferences((com.google.javascript.jscomp.Scope.Var) arguments18);
        boolean boolean22 = arguments18.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments18);
        boolean boolean24 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot26 = scope2.getOwnSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(varIterable7);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(varIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot26);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope8.getDeclarativelyUnboundVarsWithoutTypes();
        int int10 = scope8.getVarCount();
        com.google.javascript.jscomp.Scope.Var var11 = scope8.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getScope(var11);
        boolean boolean15 = scope2.isDeclared("", true);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("goog.scope", node17, jSType18, compilerInput19);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNotNull(jSTypeStaticScope12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable3 = scope2.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        boolean boolean6 = scope2.isBottom();
        org.junit.Assert.assertNotNull(varIterable3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isExtern();
        java.lang.String str16 = arguments10.getInputName();
        com.google.javascript.rhino.Node node17 = arguments10.getNode();
        com.google.javascript.rhino.Node node18 = arguments10.getParentNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.jscomp.Scope scope14 = arguments10.getScope();
        com.google.javascript.rhino.Node node15 = arguments10.nameNode;
        com.google.javascript.rhino.jstype.JSType jSType16 = arguments10.getType();
        boolean boolean17 = arguments10.isGlobal();
        int int18 = arguments10.index;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        com.google.javascript.jscomp.Scope scope13 = var12.scope;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = var12.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(scope13);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = arguments6.getInputName();
        com.google.javascript.rhino.Node node11 = arguments6.getParentNode();
        com.google.javascript.rhino.Node node12 = arguments6.getParentNode();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = arguments6.input;
        com.google.javascript.jscomp.Scope scope14 = arguments6.getScope();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(compilerInput13);
        org.junit.Assert.assertNotNull(scope14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope8.getDeclarativelyUnboundVarsWithoutTypes();
        int int10 = scope8.getVarCount();
        com.google.javascript.jscomp.Scope.Var var11 = scope8.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getScope(var11);
        boolean boolean13 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNotNull(jSTypeStaticScope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        boolean boolean14 = scope11.isDeclared("goog.scope", false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getVars();
        com.google.javascript.jscomp.Scope.Var var20 = scope17.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.rhino.Node node22 = arguments21.getParentNode();
        boolean boolean23 = arguments21.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var24 = arguments21.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            scope11.undeclare(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(var24);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        boolean boolean12 = arguments11.isDefine();
        boolean boolean13 = arguments11.isGlobal();
        com.google.javascript.rhino.Node node14 = arguments11.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments11);
        com.google.javascript.jscomp.Scope scope16 = arguments11.scope;
        boolean boolean17 = scope16.isBottom();
        int int18 = scope16.getVarCount();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = scope16.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope16.getOwnSlot("");
        java.lang.Class<?> wildcardClass22 = scope16.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(varIterable19);
        org.junit.Assert.assertNull(jSTypeStaticSlot21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getInputName();
        com.google.javascript.jscomp.Scope scope8 = arguments6.scope;
        com.google.javascript.jscomp.Scope scope9 = scope8.getGlobalScope();
        boolean boolean10 = scope8.isGlobal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<non-file>" + "'", str7, "<non-file>");
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        com.google.javascript.jscomp.Scope.Var var12 = arguments11.getDeclaration();
        boolean boolean14 = arguments11.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = arguments11.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope16 = arguments11.scope;
        com.google.javascript.jscomp.Scope.Var var17 = arguments11.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var17);
        com.google.javascript.jscomp.Scope.Var var20 = scope2.getVar("arguments");
        boolean boolean23 = scope2.isDeclared("<non-file>", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope2.getOwnSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot27 = scope2.getOwnSlot("arguments");
        com.google.javascript.jscomp.Scope.Var var29 = scope2.getVar("");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(jSTypeStaticScope18);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot25);
        org.junit.Assert.assertNull(jSTypeStaticSlot27);
        org.junit.Assert.assertNull(var29);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        java.lang.String str11 = arguments6.toString();
        boolean boolean12 = arguments6.isNoShadow();
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = scope13.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = var15.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(varIterable14);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        com.google.javascript.jscomp.Scope.Var var12 = arguments11.getDeclaration();
        boolean boolean14 = arguments11.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = arguments11.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope16 = arguments11.scope;
        com.google.javascript.jscomp.Scope.Var var17 = arguments11.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(jSTypeStaticScope18);
        org.junit.Assert.assertNotNull(varItor19);
        org.junit.Assert.assertNotNull(varItor20);
        org.junit.Assert.assertNotNull(varIterable21);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isExtern();
        java.lang.String str16 = arguments10.getInputName();
        com.google.javascript.jscomp.Scope.Var var17 = arguments10.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = arguments10.getJSDocInfo();
        boolean boolean19 = arguments10.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable3 = scope2.getAllSymbols();
        int int4 = scope2.getDepth();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        int int10 = scope2.getDepth();
        org.junit.Assert.assertNotNull(varIterable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isExtern();
        java.lang.String str16 = arguments10.getInputName();
        com.google.javascript.jscomp.Scope.Var var17 = arguments10.getSymbol();
        boolean boolean18 = arguments10.isGlobal();
        com.google.javascript.rhino.Node node19 = arguments10.getNameNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        boolean boolean12 = arguments11.isDefine();
        boolean boolean13 = arguments11.isGlobal();
        com.google.javascript.rhino.Node node14 = arguments11.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments11);
        boolean boolean16 = arguments11.isConst();
        boolean boolean17 = arguments11.isLocal();
        com.google.javascript.jscomp.Scope scope18 = arguments11.scope;
        boolean boolean21 = scope18.isDeclared("Scope.Var arguments{null}", false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        boolean boolean18 = arguments17.isDefine();
        boolean boolean19 = arguments17.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope9.getReferences((com.google.javascript.jscomp.Scope.Var) arguments17);
        com.google.javascript.jscomp.Scope scope21 = arguments17.getScope();
        com.google.javascript.rhino.Node node22 = arguments17.nameNode;
        com.google.javascript.rhino.jstype.JSType jSType23 = arguments17.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments17);
        com.google.javascript.jscomp.CompilerInput compilerInput25 = arguments17.input;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertNotNull(scope21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(jSTypeStaticScope24);
        org.junit.Assert.assertNull(compilerInput25);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = arguments6.getInputName();
        com.google.javascript.rhino.Node node11 = arguments6.getParentNode();
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = var12.getJSDocInfo();
        boolean boolean14 = var12.isConst();
        com.google.javascript.jscomp.Scope.Var var15 = var12.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = var12.getJSDocInfo();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertNull(jSDocInfo16);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.rhino.Node node4 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope5.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope5.getSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Var var10 = scope5.getVar("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope11 = scope5.getParent();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        boolean boolean13 = arguments6.isLocal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = arguments6.getInputName();
        com.google.javascript.rhino.Node node11 = arguments6.getParentNode();
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput13 = var12.getInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        com.google.javascript.jscomp.Scope scope13 = var12.scope;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getVars();
        com.google.javascript.rhino.Node node18 = scope16.getRootNode();
        com.google.javascript.jscomp.Scope scope19 = scope16.getGlobalScope();
        com.google.javascript.jscomp.Scope scope20 = scope19.getGlobalScope();
        boolean boolean21 = var12.equals((java.lang.Object) scope20);
        boolean boolean22 = var12.isDefine();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(scope19);
        org.junit.Assert.assertNotNull(scope20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        java.lang.String str11 = arguments6.toString();
        boolean boolean12 = arguments6.isDefine;
        boolean boolean13 = arguments6.isLocal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope scope8 = scope2.getParent();
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope9.getSlot("hi!");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = arguments6.input;
        boolean boolean12 = arguments6.isDefine();
        com.google.javascript.jscomp.Scope.Var var13 = arguments6.getDeclaration();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(var13);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.jscomp.Scope scope14 = arguments10.getScope();
        com.google.javascript.jscomp.Scope scope15 = scope14.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope14.getOwnSlot("arguments");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope8 = arguments7.getScope();
        java.lang.String str9 = arguments7.getInputName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        boolean boolean11 = arguments6.isLocal();
        com.google.javascript.rhino.Node node12 = arguments6.getNode();
        boolean boolean13 = arguments6.isDefine();
        boolean boolean14 = arguments6.isConst();
        com.google.javascript.jscomp.Scope scope15 = arguments6.getScope();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(scope15);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        java.lang.String str8 = arguments6.name;
        com.google.javascript.rhino.Node node9 = arguments6.nameNode;
        boolean boolean10 = arguments6.isNoShadow();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = arguments6.input;
        boolean boolean12 = arguments6.isExtern();
        boolean boolean13 = arguments6.isLocal();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = arguments6.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        java.lang.String str15 = arguments6.getName();
        java.lang.String str16 = arguments6.getInputName();
        boolean boolean17 = arguments6.isDefine();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = arguments6.getInputName();
        int int11 = arguments6.index;
        java.lang.String str12 = arguments6.getInputName();
        java.lang.String str13 = arguments6.getInputName();
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope14.getOwnSlot("arguments");
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<non-file>" + "'", str12, "<non-file>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        int int12 = arguments6.index;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        arguments6.resolveType(errorReporter13);
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        boolean boolean12 = arguments11.isDefine();
        boolean boolean13 = arguments11.isGlobal();
        com.google.javascript.rhino.Node node14 = arguments11.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments11);
        boolean boolean16 = arguments11.isConst();
        boolean boolean17 = arguments11.isLocal();
        com.google.javascript.jscomp.Scope scope18 = arguments11.scope;
        boolean boolean19 = scope18.isBottom();
        boolean boolean20 = scope18.isGlobal();
        boolean boolean21 = scope18.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.jscomp.Scope scope9 = scope8.getGlobalScope();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope12.getVars();
        com.google.javascript.jscomp.Scope.Var var15 = scope12.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope12);
        boolean boolean17 = arguments16.isDefine();
        boolean boolean18 = arguments16.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope8.getScope((com.google.javascript.jscomp.Scope.Var) arguments16);
        com.google.javascript.rhino.Node node20 = arguments16.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType21 = arguments16.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments16);
        boolean boolean23 = scope2.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = scope2.getTypeOfThis();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(objectType24);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        com.google.javascript.jscomp.Scope.Var var12 = arguments11.getDeclaration();
        boolean boolean14 = arguments11.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = arguments11.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope16 = arguments11.scope;
        com.google.javascript.jscomp.Scope.Var var17 = arguments11.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var17);
        com.google.javascript.jscomp.Scope.Var var20 = scope2.getVar("arguments");
        boolean boolean21 = scope2.isLocal();
        int int22 = scope2.getVarCount();
        java.lang.Class<?> wildcardClass23 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(jSTypeStaticScope18);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        boolean boolean13 = scope11.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope11.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope11.getOwnSlot("arguments");
        com.google.javascript.jscomp.Scope.Var var18 = scope11.getVar("hi!");
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(scope11, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNull(var18);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        boolean boolean11 = arguments6.isLocal();
        boolean boolean12 = arguments6.isTypeInferred();
        java.lang.String str13 = arguments6.toString();
        com.google.javascript.jscomp.Scope scope14 = arguments6.getScope();
        com.google.javascript.jscomp.Scope scope15 = arguments6.getScope();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = arguments6.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Scope.Var arguments{null}" + "'", str13, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNotNull(scope15);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        int int12 = arguments6.index;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = arguments6.getInput();
        boolean boolean14 = arguments6.isGlobal();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(compilerInput13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        int int8 = scope7.getDepth();
        boolean boolean9 = scope7.isBottom();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        java.lang.String str13 = var12.getName();
        java.lang.String str14 = var12.getInputName();
        com.google.javascript.rhino.Node node15 = var12.nameNode;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        com.google.javascript.rhino.Node node15 = arguments6.getNode();
        boolean boolean16 = arguments6.isDefine;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope19.getAllSymbols();
        int int21 = scope19.getDepth();
        int int22 = scope19.getVarCount();
        boolean boolean23 = arguments6.equals((java.lang.Object) scope19);
        com.google.javascript.jscomp.Scope scope24 = scope19.getGlobalScope();
        com.google.javascript.rhino.Node node25 = scope24.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope24.getVars();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(scope24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(varItor26);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        java.lang.String str11 = arguments6.toString();
        boolean boolean12 = arguments6.isNoShadow();
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        java.lang.Object obj11 = null;
        boolean boolean12 = arguments6.equals(obj11);
        com.google.javascript.jscomp.Scope scope13 = arguments6.getScope();
        java.lang.String str14 = arguments6.name;
        boolean boolean15 = arguments6.isConst();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arguments" + "'", str14, "arguments");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        java.lang.Object obj11 = null;
        boolean boolean12 = arguments6.equals(obj11);
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = arguments6.getJSDocInfo();
        boolean boolean15 = arguments6.isExtern();
        java.lang.String str16 = arguments6.toString();
        com.google.javascript.rhino.Node node17 = arguments6.getParentNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = arguments6.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Scope.Var arguments{null}" + "'", str16, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        boolean boolean11 = arguments6.isLocal();
        boolean boolean12 = arguments6.isTypeInferred();
        java.lang.String str13 = arguments6.toString();
        com.google.javascript.jscomp.Scope scope14 = arguments6.getScope();
        int int15 = arguments6.index;
        boolean boolean16 = arguments6.isDefine();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        arguments6.resolveType(errorReporter17);
        boolean boolean19 = arguments6.isGlobal();
        com.google.javascript.rhino.jstype.JSType jSType20 = arguments6.getType();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Scope.Var arguments{null}" + "'", str13, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = arguments6.getParentNode();
        boolean boolean8 = arguments6.isTypeInferred();
        java.lang.String str9 = arguments6.getInputName();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var11 = arguments6.getSymbol();
        boolean boolean12 = var11.isConst();
        java.lang.String str13 = var11.toString();
        boolean boolean14 = var11.isDefine();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Scope.Var arguments{null}" + "'", str13, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope7.getVars();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        boolean boolean12 = arguments11.isDefine();
        boolean boolean13 = arguments11.isGlobal();
        com.google.javascript.rhino.Node node14 = arguments11.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments11);
        boolean boolean16 = arguments11.isConst();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = arguments11.getJSDocInfo();
        int int18 = arguments11.index;
        com.google.javascript.rhino.Node node19 = arguments11.getParentNode();
        boolean boolean20 = arguments11.isDefine();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSDocInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isTypeInferred();
        boolean boolean6 = var4.isDefine;
        boolean boolean7 = var4.isNoShadow();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope11 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Var var12 = arguments6.getSymbol();
        boolean boolean13 = var12.isTypeInferred();
        com.google.javascript.jscomp.Scope scope14 = var12.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope14.getTypeOfThis();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(objectType15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        java.lang.Object obj11 = null;
        boolean boolean12 = arguments6.equals(obj11);
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.CompilerInput compilerInput15 = arguments6.input;
        com.google.javascript.jscomp.Scope.Var var16 = arguments6.getSymbol();
        int int17 = var16.index;
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNull(compilerInput15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        arguments10.resolveType(errorReporter14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        arguments10.resolveType(errorReporter16);
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments10.input;
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope13);
        org.junit.Assert.assertNull(compilerInput18);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int9 = scope2.getVarCount();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isExtern();
        boolean boolean16 = arguments10.isTypeInferred();
        java.lang.String str17 = arguments10.name;
        int int18 = arguments10.index;
        boolean boolean19 = arguments10.isExtern();
        com.google.javascript.jscomp.CompilerInput compilerInput20 = arguments10.input;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(compilerInput20);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        boolean boolean15 = arguments10.isExtern();
        java.lang.String str16 = arguments10.getInputName();
        com.google.javascript.jscomp.Scope.Var var17 = arguments10.getSymbol();
        boolean boolean18 = var17.isLocal();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = var17.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        boolean boolean14 = arguments10.isGlobal();
        com.google.javascript.jscomp.Scope.Var var15 = arguments10.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput16 = arguments10.input;
        com.google.javascript.jscomp.Scope scope17 = arguments10.getScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertNull(compilerInput16);
        org.junit.Assert.assertNotNull(scope17);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("arguments");
        boolean boolean13 = scope2.isDeclared("", false);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope2.getVars();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(varItor14);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        java.lang.String str14 = arguments6.getInputName();
        java.lang.String str15 = arguments6.getName();
        java.lang.String str16 = arguments6.getInputName();
        com.google.javascript.jscomp.Scope scope17 = arguments6.getScope();
        boolean boolean18 = scope17.isBottom();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var24 = scope17.declare("", node20, jSType21, compilerInput22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        boolean boolean12 = arguments10.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.Node node14 = arguments10.getNameNode();
        com.google.javascript.jscomp.Scope.Var var15 = arguments10.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType16 = arguments10.getType();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        arguments10.resolveType(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = arguments10.getType();
        com.google.javascript.rhino.Node node20 = arguments10.getParentNode();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope7.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope7.getAllSymbols();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope12.getVars();
        com.google.javascript.jscomp.Scope.Var var15 = scope12.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope12);
        boolean boolean17 = arguments16.isDefine();
        boolean boolean18 = arguments16.isGlobal();
        com.google.javascript.rhino.Node node19 = arguments16.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope7.getScope((com.google.javascript.jscomp.Scope.Var) arguments16);
        com.google.javascript.rhino.Node node21 = arguments16.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType22 = arguments16.getType();
        com.google.javascript.rhino.Node node23 = arguments16.nameNode;
        com.google.javascript.rhino.Node node24 = arguments16.getNameNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments16);
        boolean boolean26 = arguments16.isExtern();
        boolean boolean27 = arguments16.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        arguments16.resolveType(errorReporter28);
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(jSTypeStaticScope20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(varIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNotNull(varIterable7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(objectType9);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        boolean boolean11 = arguments6.isLocal();
        boolean boolean12 = arguments6.isTypeInferred();
        java.lang.String str13 = arguments6.toString();
        com.google.javascript.jscomp.Scope scope14 = arguments6.getScope();
        boolean boolean15 = arguments6.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput16 = arguments6.getInput();
        int int17 = arguments6.index;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments6.getInput();
        com.google.javascript.jscomp.Scope scope19 = arguments6.scope;
        boolean boolean20 = arguments6.isConst();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Scope.Var arguments{null}" + "'", str13, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(compilerInput16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(compilerInput18);
        org.junit.Assert.assertNotNull(scope19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isGlobal();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope9.getVars();
        com.google.javascript.jscomp.Scope.Var var12 = scope9.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.jscomp.Scope.Var var14 = arguments13.getDeclaration();
        boolean boolean16 = arguments13.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = arguments13.getJSDocInfo();
        boolean boolean18 = arguments13.isLocal();
        boolean boolean19 = arguments13.isTypeInferred();
        java.lang.String str20 = arguments13.toString();
        com.google.javascript.jscomp.Scope scope21 = arguments13.getScope();
        int int22 = arguments13.index;
        boolean boolean23 = arguments13.isDefine();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments13);
        com.google.javascript.jscomp.Scope.Var var25 = arguments13.getSymbol();
        java.lang.String str26 = var25.name;
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSDocInfo17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Scope.Var arguments{null}" + "'", str20, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNotNull(var25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arguments" + "'", str26, "arguments");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        arguments6.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = arguments6.nameNode;
        boolean boolean14 = arguments6.isTypeInferred();
        boolean boolean15 = arguments6.isDefine;
        com.google.javascript.rhino.Node node16 = arguments6.getNameNode();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }
}

