package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope15.getAllSymbols();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        boolean boolean25 = arguments24.isDefine();
        boolean boolean26 = arguments24.isGlobal();
        com.google.javascript.rhino.Node node27 = arguments24.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope15.getScope((com.google.javascript.jscomp.Scope.Var) arguments24);
        boolean boolean29 = arguments24.isConst();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable30 = scope11.getReferences((com.google.javascript.jscomp.Scope.Var) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments24", arguments6.equals(arguments24) ? arguments6.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node8 = arguments7.getNameNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getVars();
        com.google.javascript.jscomp.Scope.Var var20 = scope17.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.jscomp.Scope.Var var22 = arguments21.getDeclaration();
        boolean boolean24 = arguments21.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = arguments21.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope26 = arguments21.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope26.getParentScope();
        boolean boolean28 = arguments6.equals((java.lang.Object) scope26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean17 = arguments16.isNoShadow();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments16", arguments11.equals(arguments16) ? arguments11.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        arguments16.resolveType(errorReporter17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments16", arguments11.equals(arguments16) ? arguments11.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope2.getAllSymbols();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments16", arguments11.equals(arguments16) ? arguments11.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getVars();
        com.google.javascript.jscomp.Scope.Var var19 = scope16.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
        com.google.javascript.jscomp.Scope.Var var21 = arguments20.getDeclaration();
        boolean boolean23 = arguments20.equals((java.lang.Object) (byte) -1);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope13.getReferences((com.google.javascript.jscomp.Scope.Var) arguments20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("hi!", node20, jSType21, compilerInput22);
        boolean boolean26 = scope2.isDeclared("", false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var23.", arguments11.equals(var23) == var23.equals(arguments11));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.jscomp.Scope scope18 = scope17.getGlobalScope();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        boolean boolean26 = arguments25.isDefine();
        boolean boolean27 = arguments25.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope17.getScope((com.google.javascript.jscomp.Scope.Var) arguments25);
        boolean boolean29 = arguments10.equals((java.lang.Object) scope17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments25", arguments10.equals(arguments25) ? arguments10.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        com.google.javascript.rhino.jstype.JSType jSType29 = var28.getType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str17 = arguments16.name;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments16", arguments11.equals(arguments16) ? arguments11.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        com.google.javascript.jscomp.Scope scope13 = var12.getScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int25 = scope2.getVarCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments24", arguments11.equals(arguments24) ? arguments11.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        com.google.javascript.jscomp.Scope.Var var24 = scope2.getArgumentsVar();
        boolean boolean25 = var24.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var24", arguments11.equals(var24) ? arguments11.hashCode() == var24.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        boolean boolean13 = scope2.isLocal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        com.google.javascript.jscomp.Scope.Var var24 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var24", arguments11.equals(var24) ? arguments11.hashCode() == var24.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope2.getVars();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments19", arguments11.equals(arguments19) ? arguments11.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("hi!", node20, jSType21, compilerInput22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.jscomp.Scope scope26 = new com.google.javascript.jscomp.Scope(node24, objectType25);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope26.getVars();
        com.google.javascript.jscomp.Scope.Var var29 = scope26.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments30 = new com.google.javascript.jscomp.Scope.Arguments(scope26);
        com.google.javascript.jscomp.Scope.Var var31 = arguments30.getDeclaration();
        boolean boolean33 = arguments30.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = arguments30.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        arguments30.resolveType(errorReporter35);
        com.google.javascript.rhino.Node node37 = arguments30.nameNode;
        java.lang.String str38 = arguments30.getInputName();
        java.lang.String str39 = arguments30.getName();
        java.lang.String str40 = arguments30.name;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope41 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var23.", arguments11.equals(var23) == var23.equals(arguments11));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        java.lang.String str23 = arguments22.getName();
        com.google.javascript.rhino.Node node24 = arguments22.getNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments15", arguments10.equals(arguments15) ? arguments10.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        var28.resolveType(errorReporter29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        com.google.javascript.jscomp.Scope scope12 = arguments6.getScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.jscomp.Scope.Var var18 = scope15.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        com.google.javascript.jscomp.Scope.Var var20 = arguments19.getDeclaration();
        boolean boolean22 = arguments19.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = arguments19.getJSDocInfo();
        boolean boolean24 = arguments19.isLocal();
        boolean boolean25 = arguments19.isTypeInferred();
        java.lang.String str26 = arguments19.toString();
        com.google.javascript.jscomp.Scope scope27 = arguments19.getScope();
        boolean boolean28 = arguments19.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput29 = arguments19.getInput();
        boolean boolean30 = arguments6.equals((java.lang.Object) arguments19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments19", arguments6.equals(arguments19) ? arguments6.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        boolean boolean13 = var12.isLocal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node25 = arguments24.getNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments24", arguments11.equals(arguments24) ? arguments11.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        com.google.javascript.jscomp.Scope.Var var24 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope27.getVars();
        com.google.javascript.jscomp.Scope.Var var30 = scope27.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments31 = new com.google.javascript.jscomp.Scope.Arguments(scope27);
        boolean boolean32 = arguments31.isDefine();
        boolean boolean33 = arguments31.isGlobal();
        com.google.javascript.rhino.jstype.JSType jSType34 = arguments31.getType();
        boolean boolean35 = arguments31.isDefine;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var24", arguments11.equals(var24) ? arguments11.hashCode() == var24.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        com.google.javascript.rhino.Node node16 = arguments6.getParentNode();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope19.getParentScope();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        boolean boolean28 = arguments27.isDefine();
        boolean boolean29 = arguments27.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable30 = scope19.getReferences((com.google.javascript.jscomp.Scope.Var) arguments27);
        boolean boolean31 = arguments27.isGlobal();
        java.lang.String str32 = arguments27.name;
        boolean boolean33 = arguments6.equals((java.lang.Object) arguments27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments27", arguments6.equals(arguments27) ? arguments6.hashCode() == arguments27.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        boolean boolean13 = arguments6.isDefine;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.jscomp.Scope scope17 = scope16.getGlobalScope();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        boolean boolean25 = arguments24.isDefine();
        boolean boolean26 = arguments24.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope16.getScope((com.google.javascript.jscomp.Scope.Var) arguments24);
        boolean boolean28 = arguments6.equals((java.lang.Object) scope16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments24", arguments6.equals(arguments24) ? arguments6.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        boolean boolean27 = arguments22.isLocal();
        boolean boolean28 = arguments22.isTypeInferred();
        java.lang.String str29 = arguments22.toString();
        com.google.javascript.jscomp.Scope scope30 = arguments22.getScope();
        int int31 = arguments22.index;
        boolean boolean32 = arguments22.isNoShadow();
        boolean boolean33 = arguments6.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope2.getVars();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope23.getParentScope();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope27.getVars();
        com.google.javascript.jscomp.Scope.Var var30 = scope27.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments31 = new com.google.javascript.jscomp.Scope.Arguments(scope27);
        boolean boolean32 = arguments31.isDefine();
        boolean boolean33 = arguments31.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable34 = scope23.getReferences((com.google.javascript.jscomp.Scope.Var) arguments31);
        boolean boolean35 = scope23.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments36 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable37 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments31", arguments11.equals(arguments31) ? arguments11.hashCode() == arguments31.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.JSType jSType16 = arguments15.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments15", arguments10.equals(arguments15) ? arguments10.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope13.getAllSymbols();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope27 = arguments22.scope;
        com.google.javascript.jscomp.Scope.Var var28 = arguments22.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope13.getScope(var28);
        boolean boolean30 = arguments6.equals((java.lang.Object) jSTypeStaticScope29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.jscomp.Scope.Var var18 = arguments17.getDeclaration();
        boolean boolean20 = arguments17.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = arguments17.getJSDocInfo();
        boolean boolean22 = arguments17.isLocal();
        boolean boolean23 = arguments17.isTypeInferred();
        java.lang.String str24 = arguments17.toString();
        com.google.javascript.jscomp.Scope scope25 = arguments17.getScope();
        int int26 = arguments17.index;
        boolean boolean27 = arguments17.isNoShadow();
        com.google.javascript.rhino.Node node28 = arguments17.getNode();
        java.lang.String str29 = arguments17.getName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments17", arguments6.equals(arguments17) ? arguments6.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("hi!", node20, jSType21, compilerInput22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        var23.setType(jSType24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var23.", arguments11.equals(var23) == var23.equals(arguments11));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope18.getAllSymbols();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        com.google.javascript.jscomp.Scope.Var var28 = arguments27.getDeclaration();
        boolean boolean30 = arguments27.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = arguments27.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope32 = arguments27.scope;
        com.google.javascript.jscomp.Scope.Var var33 = arguments27.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = scope18.getScope(var33);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = scope14.getScope(var33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var33", arguments6.equals(var33) ? arguments6.hashCode() == var33.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        com.google.javascript.rhino.Node node14 = arguments6.getNode();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getVars();
        com.google.javascript.jscomp.Scope.Var var20 = scope17.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.jscomp.Scope.Var var22 = arguments21.getDeclaration();
        boolean boolean24 = arguments21.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = arguments21.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        arguments21.resolveType(errorReporter26);
        com.google.javascript.rhino.Node node28 = arguments21.nameNode;
        com.google.javascript.jscomp.Scope scope29 = arguments21.scope;
        com.google.javascript.rhino.Node node30 = scope29.getRootNode();
        boolean boolean31 = arguments6.equals((java.lang.Object) scope29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.jscomp.Scope scope20 = scope19.getGlobalScope();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        boolean boolean28 = arguments27.isDefine();
        boolean boolean29 = arguments27.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope19.getScope((com.google.javascript.jscomp.Scope.Var) arguments27);
        int int31 = scope19.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor32 = scope19.getVars();
        boolean boolean33 = arguments6.equals((java.lang.Object) varItor32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments27", arguments6.equals(arguments27) ? arguments6.hashCode() == arguments27.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean17 = arguments16.isConst();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments16", arguments11.equals(arguments16) ? arguments11.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("<non-file>");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.JSType jSType15 = var14.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var14", arguments10.equals(var14) ? arguments10.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        boolean boolean9 = scope2.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope2.getParentScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments19", arguments11.equals(arguments19) ? arguments11.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node9, jSType10, compilerInput11, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        boolean boolean18 = scope2.isGlobal();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        java.lang.String str26 = arguments25.getName();
        com.google.javascript.rhino.Node node27 = arguments25.getNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable28 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments25", arguments10.equals(arguments25) ? arguments10.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var27 = arguments22.getSymbol();
        com.google.javascript.rhino.Node node28 = var27.getParentNode();
        boolean boolean29 = arguments10.equals((java.lang.Object) node28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments22", arguments10.equals(arguments22) ? arguments10.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        boolean boolean8 = arguments6.isNoShadow();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope11.getVars();
        com.google.javascript.jscomp.Scope.Var var14 = scope11.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope11);
        boolean boolean16 = arguments15.isDefine();
        int int17 = arguments15.index;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments15.input;
        boolean boolean19 = arguments6.equals((java.lang.Object) compilerInput18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments15", arguments6.equals(arguments15) ? arguments6.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        boolean boolean15 = arguments6.isNoShadow();
        java.lang.String str16 = arguments6.toString();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getDeclarativelyUnboundVarsWithoutTypes();
        int int21 = scope19.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = scope19.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        boolean boolean24 = arguments6.equals((java.lang.Object) arguments23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments23", arguments6.equals(arguments23) ? arguments6.hashCode() == arguments23.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean17 = arguments16.isLocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments16", arguments11.equals(arguments16) ? arguments11.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Var var22 = scope19.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        com.google.javascript.jscomp.Scope.Var var24 = arguments23.getDeclaration();
        boolean boolean26 = arguments23.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = arguments23.getJSDocInfo();
        java.lang.Object obj28 = null;
        boolean boolean29 = arguments23.equals(obj28);
        boolean boolean30 = arguments23.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable31 = scope16.getReferences((com.google.javascript.jscomp.Scope.Var) arguments23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments23", arguments11.equals(arguments23) ? arguments11.hashCode() == arguments23.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean16 = arguments15.isDefine;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments15", arguments10.equals(arguments15) ? arguments10.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope20 = scope2.getGlobalScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments19", arguments11.equals(arguments19) ? arguments11.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable29 = scope2.getAllSymbols();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        java.lang.String str8 = arguments6.name;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope11.getAllSymbols();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getVars();
        com.google.javascript.jscomp.Scope.Var var19 = scope16.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
        boolean boolean21 = arguments20.isDefine();
        boolean boolean22 = arguments20.isGlobal();
        com.google.javascript.rhino.Node node23 = arguments20.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope11.getScope((com.google.javascript.jscomp.Scope.Var) arguments20);
        boolean boolean25 = arguments20.isConst();
        java.lang.String str26 = arguments20.getInputName();
        com.google.javascript.rhino.Node node27 = arguments20.nameNode;
        boolean boolean28 = arguments6.equals((java.lang.Object) arguments20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        com.google.javascript.jscomp.Scope scope18 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        boolean boolean20 = scope18.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments19", arguments10.equals(arguments19) ? arguments10.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getVars();
        com.google.javascript.jscomp.Scope.Var var20 = scope17.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        boolean boolean22 = arguments21.isDefine();
        java.lang.String str23 = arguments21.name;
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = arguments21.getJSDocInfo();
        boolean boolean25 = arguments10.equals((java.lang.Object) arguments21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments21", arguments10.equals(arguments21) ? arguments10.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getVars();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        com.google.javascript.jscomp.Scope.Var var19 = arguments18.getDeclaration();
        boolean boolean21 = arguments18.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = arguments18.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        arguments18.resolveType(errorReporter23);
        com.google.javascript.rhino.Node node25 = arguments18.nameNode;
        com.google.javascript.jscomp.Scope scope26 = arguments18.scope;
        boolean boolean27 = arguments18.isTypeInferred();
        boolean boolean28 = arguments6.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments18", arguments6.equals(arguments18) ? arguments6.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope8.getVars();
        com.google.javascript.jscomp.Scope.Var var11 = scope8.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments12 = new com.google.javascript.jscomp.Scope.Arguments(scope8);
        boolean boolean13 = arguments12.isDefine();
        java.lang.String str14 = arguments12.name;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        int int23 = scope18.getVarCount();
        boolean boolean24 = arguments12.equals((java.lang.Object) scope18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments12 and arguments22", arguments12.equals(arguments22) ? arguments12.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope14.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str25 = arguments24.name;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments24", arguments11.equals(arguments24) ? arguments11.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Var var22 = scope19.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        com.google.javascript.jscomp.Scope.Var var24 = arguments23.getDeclaration();
        boolean boolean26 = arguments23.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = arguments23.getJSDocInfo();
        java.lang.Object obj28 = null;
        boolean boolean29 = arguments23.equals(obj28);
        com.google.javascript.jscomp.Scope scope30 = arguments23.scope;
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = arguments23.getJSDocInfo();
        boolean boolean32 = arguments23.isExtern();
        boolean boolean33 = arguments23.isDefine();
        boolean boolean34 = arguments6.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments23", arguments6.equals(arguments23) ? arguments6.hashCode() == arguments23.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        int int16 = arguments6.index;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Var var22 = scope19.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        com.google.javascript.jscomp.Scope.Var var24 = arguments23.getDeclaration();
        boolean boolean26 = arguments23.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = arguments23.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var28 = arguments23.getSymbol();
        com.google.javascript.rhino.Node node29 = var28.getParentNode();
        com.google.javascript.jscomp.Scope scope30 = var28.scope;
        boolean boolean31 = arguments6.equals((java.lang.Object) var28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var28", arguments6.equals(var28) ? arguments6.hashCode() == var28.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        boolean boolean29 = var28.isDefine;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("Scope.Var arguments{null}", node15, jSType16, compilerInput17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        com.google.javascript.jscomp.Scope.Var var27 = arguments26.getDeclaration();
        boolean boolean29 = arguments26.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = arguments26.getJSDocInfo();
        boolean boolean31 = arguments26.isLocal();
        boolean boolean32 = arguments26.isTypeInferred();
        java.lang.String str33 = arguments26.toString();
        com.google.javascript.jscomp.Scope scope34 = arguments26.getScope();
        boolean boolean35 = arguments26.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput36 = arguments26.getInput();
        int int37 = arguments26.index;
        com.google.javascript.jscomp.CompilerInput compilerInput38 = arguments26.getInput();
        boolean boolean39 = var19.equals((java.lang.Object) compilerInput38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var19.", arguments10.equals(var19) == var19.equals(arguments10));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getArgumentsVar();
        boolean boolean15 = scope2.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var14", arguments10.equals(var14) ? arguments10.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope16.declare("hi!", node21, jSType22, compilerInput23, true);
        com.google.javascript.rhino.Node node26 = var25.getParentNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        com.google.javascript.rhino.jstype.ObjectType objectType26 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope2.declare("<non-file>", node28, jSType29, compilerInput30, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput36 = null;
        com.google.javascript.jscomp.Scope.Var var37 = scope2.declare("arguments", node34, jSType35, compilerInput36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var32.", arguments11.equals(var32) == var32.equals(arguments11));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        java.lang.String str13 = var12.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope11.getVars();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        boolean boolean27 = arguments22.isLocal();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = arguments22.getJSDocInfo();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable29 = scope11.getReferences((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isDefine;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope11.getDeclarativelyUnboundVarsWithoutTypes();
        int int13 = scope11.getVarCount();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope11.declare("hi!", node15, jSType16, compilerInput17, true);
        boolean boolean20 = arguments6.equals((java.lang.Object) compilerInput17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var19.", arguments6.equals(var19) == var19.equals(arguments6));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        boolean boolean14 = scope11.isLocal();
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope11.getSlot("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getOwnSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments15", arguments10.equals(arguments15) ? arguments10.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        boolean boolean12 = arguments6.isLocal();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.jscomp.Scope.Var var18 = scope15.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        boolean boolean20 = arguments19.isDefine();
        boolean boolean21 = arguments19.isGlobal();
        com.google.javascript.rhino.Node node22 = arguments19.getNode();
        boolean boolean23 = arguments19.isDefine();
        boolean boolean24 = arguments6.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments19", arguments6.equals(arguments19) ? arguments6.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        int int14 = scope2.getDepth();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getVars();
        com.google.javascript.jscomp.Scope.Var var20 = scope17.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.jscomp.Scope.Var var22 = arguments21.getDeclaration();
        boolean boolean24 = arguments21.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = arguments21.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        arguments21.resolveType(errorReporter26);
        com.google.javascript.rhino.Node node28 = arguments21.nameNode;
        java.lang.String str29 = arguments21.getInputName();
        com.google.javascript.rhino.Node node30 = arguments21.getNode();
        boolean boolean31 = arguments21.isDefine;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments21", arguments10.equals(arguments21) ? arguments10.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        boolean boolean15 = scope11.isLocal();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        boolean boolean27 = arguments26.isDefine();
        boolean boolean28 = arguments26.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable29 = scope18.getReferences((com.google.javascript.jscomp.Scope.Var) arguments26);
        boolean boolean30 = arguments26.isGlobal();
        boolean boolean31 = arguments26.isLocal();
        boolean boolean32 = arguments26.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable33 = scope11.getReferences((com.google.javascript.jscomp.Scope.Var) arguments26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments26", arguments6.equals(arguments26) ? arguments6.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("Scope.Var arguments{null}", node9, jSType10, compilerInput11);
        java.lang.Class<?> wildcardClass13 = var12.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope11.declare("goog.scope", node16, jSType17, compilerInput18, false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope11.getOwnSlot("<non-file>");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var20.", arguments6.equals(var20) == var20.equals(arguments6));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        boolean boolean8 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = var12.input;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var12", arguments6.equals(var12) ? arguments6.hashCode() == var12.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        com.google.javascript.jscomp.Scope scope26 = scope24.getParent();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments25", arguments11.equals(arguments25) ? arguments11.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Var var22 = scope19.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        com.google.javascript.jscomp.Scope.Var var24 = arguments23.getDeclaration();
        boolean boolean26 = arguments23.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = arguments23.getJSDocInfo();
        boolean boolean28 = arguments23.isLocal();
        com.google.javascript.rhino.Node node29 = arguments23.getNode();
        boolean boolean30 = arguments10.equals((java.lang.Object) node29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments23", arguments10.equals(arguments23) ? arguments10.hashCode() == arguments23.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope11.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var16 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope19.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope19.getAllSymbols();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        boolean boolean29 = arguments28.isDefine();
        boolean boolean30 = arguments28.isGlobal();
        com.google.javascript.rhino.Node node31 = arguments28.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope19.getScope((com.google.javascript.jscomp.Scope.Var) arguments28);
        boolean boolean33 = arguments28.isConst();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = scope11.getScope((com.google.javascript.jscomp.Scope.Var) arguments28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var16", arguments6.equals(var16) ? arguments6.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope16.declare("hi!", node21, jSType22, compilerInput23, true);
        int int26 = scope16.getVarCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("<non-file>", node12, jSType13, compilerInput14);
        com.google.javascript.rhino.jstype.JSType jSType16 = var15.getType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope16.getParentScope();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        boolean boolean25 = arguments24.isDefine();
        boolean boolean26 = arguments24.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable27 = scope16.getReferences((com.google.javascript.jscomp.Scope.Var) arguments24);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope16.getVars();
        boolean boolean29 = var12.equals((java.lang.Object) scope16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var12 and arguments24", var12.equals(arguments24) ? var12.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("<non-file>", node12, jSType13, compilerInput14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope11.getVars();
        com.google.javascript.rhino.Node node13 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope scope14 = scope11.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var15 = scope14.getArgumentsVar();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope2.getReferences(var15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot26 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments24", arguments11.equals(arguments24) ? arguments11.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        boolean boolean18 = arguments6.isDefine;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        com.google.javascript.jscomp.Scope.Var var26 = arguments25.getDeclaration();
        boolean boolean28 = arguments25.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = arguments25.getJSDocInfo();
        java.lang.Object obj30 = null;
        boolean boolean31 = arguments25.equals(obj30);
        java.lang.String str32 = arguments25.name;
        java.lang.String str33 = arguments25.toString();
        boolean boolean34 = arguments6.equals((java.lang.Object) arguments25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments25", arguments6.equals(arguments25) ? arguments6.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("<non-file>", node12, jSType13, compilerInput14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        arguments22.resolveType(errorReporter27);
        com.google.javascript.rhino.Node node29 = arguments22.nameNode;
        com.google.javascript.rhino.Node node30 = arguments22.nameNode;
        boolean boolean31 = arguments22.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope20 = scope18.getGlobalScope();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope23.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = scope23.getAllSymbols();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope28.getVars();
        com.google.javascript.jscomp.Scope.Var var31 = scope28.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments32 = new com.google.javascript.jscomp.Scope.Arguments(scope28);
        boolean boolean33 = arguments32.isDefine();
        boolean boolean34 = arguments32.isGlobal();
        com.google.javascript.rhino.Node node35 = arguments32.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope23.getScope((com.google.javascript.jscomp.Scope.Var) arguments32);
        boolean boolean37 = arguments32.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable38 = scope18.getReferences((com.google.javascript.jscomp.Scope.Var) arguments32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments32", arguments6.equals(arguments32) ? arguments6.hashCode() == arguments32.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope16.declare("hi!", node21, jSType22, compilerInput23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope28.getDeclarativelyUnboundVarsWithoutTypes();
        int int30 = scope28.getVarCount();
        boolean boolean33 = scope28.isDeclared("", true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput37 = null;
        com.google.javascript.jscomp.Scope.Var var39 = scope28.declare("<non-file>", node35, jSType36, compilerInput37, false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope40 = scope16.getScope(var39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments24", arguments11.equals(arguments24) ? arguments11.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        boolean boolean14 = scope11.isLocal();
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        boolean boolean18 = scope11.isDeclared("arguments", false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        boolean boolean8 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope14.getParentScope();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        boolean boolean23 = arguments22.isDefine();
        boolean boolean24 = arguments22.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = scope14.getReferences((com.google.javascript.jscomp.Scope.Var) arguments22);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot27 = scope14.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var28 = scope14.getArgumentsVar();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable29 = scope11.getReferences(var28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("Scope.Var arguments{null}", node9, jSType10, compilerInput11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("hi!", node14, jSType15, compilerInput16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        boolean boolean29 = var28.isConst();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        boolean boolean20 = scope2.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope2.getAllSymbols();
        int int22 = scope2.getDepth();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope25.getVars();
        com.google.javascript.jscomp.Scope.Var var28 = scope25.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        com.google.javascript.jscomp.Scope.Var var30 = arguments29.getDeclaration();
        boolean boolean32 = arguments29.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = arguments29.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope34 = arguments29.scope;
        com.google.javascript.jscomp.Scope.Var var35 = arguments29.getSymbol();
        java.lang.String str36 = var35.getName();
        com.google.javascript.jscomp.Scope.Var var37 = var35.getDeclaration();
        com.google.javascript.rhino.jstype.JSType jSType38 = var35.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = var35.getJSDocInfo();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable40 = scope2.getReferences(var35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var35", arguments10.equals(var35) ? arguments10.hashCode() == var35.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("Scope.Var arguments{null}", node13, jSType14, compilerInput15, false);
        boolean boolean18 = var17.isNoShadow();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope18.declare("arguments", node21, jSType22, compilerInput23);
        com.google.javascript.rhino.Node node25 = var24.getParentNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var24.", arguments6.equals(var24) == var24.equals(arguments6));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        boolean boolean8 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope12 = scope11.getGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.jscomp.Scope.Var var18 = scope15.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        com.google.javascript.jscomp.Scope.Var var20 = arguments19.getDeclaration();
        boolean boolean22 = arguments19.equals((java.lang.Object) (byte) -1);
        java.lang.String str23 = arguments19.getInputName();
        int int24 = arguments19.index;
        java.lang.String str25 = arguments19.getInputName();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = scope11.getReferences((com.google.javascript.jscomp.Scope.Var) arguments19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments19", arguments6.equals(arguments19) ? arguments6.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("Scope.Var arguments{null}", node13, jSType14, compilerInput15, false);
        java.lang.String str18 = var17.getInputName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        com.google.javascript.rhino.Node node16 = arguments6.getNode();
        com.google.javascript.rhino.Node node17 = arguments6.getNameNode();
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope29.getParentScope();
        boolean boolean31 = scope29.isBottom();
        com.google.javascript.jscomp.Scope scope32 = scope29.getGlobalScope();
        int int33 = scope32.getDepth();
        com.google.javascript.rhino.Node node34 = scope32.getRootNode();
        boolean boolean35 = arguments6.equals((java.lang.Object) node34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments24", arguments6.equals(arguments24) ? arguments6.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope15.getAllSymbols();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        boolean boolean25 = arguments24.isDefine();
        boolean boolean26 = arguments24.isGlobal();
        com.google.javascript.rhino.Node node27 = arguments24.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope15.getScope((com.google.javascript.jscomp.Scope.Var) arguments24);
        boolean boolean29 = arguments24.isConst();
        java.lang.String str30 = arguments24.getInputName();
        boolean boolean31 = arguments24.isGlobal();
        boolean boolean32 = arguments24.isConst();
        java.lang.String str33 = arguments24.getName();
        com.google.javascript.jscomp.Scope scope34 = arguments24.scope;
        boolean boolean35 = arguments6.equals((java.lang.Object) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments24", arguments6.equals(arguments24) ? arguments6.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments25", arguments11.equals(arguments25) ? arguments11.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope22.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope22.getAllSymbols();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope27.getVars();
        com.google.javascript.jscomp.Scope.Var var30 = scope27.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments31 = new com.google.javascript.jscomp.Scope.Arguments(scope27);
        boolean boolean32 = arguments31.isDefine();
        boolean boolean33 = arguments31.isGlobal();
        com.google.javascript.rhino.Node node34 = arguments31.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = scope22.getScope((com.google.javascript.jscomp.Scope.Var) arguments31);
        boolean boolean36 = arguments31.isConst();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = arguments31.getJSDocInfo();
        int int38 = arguments31.index;
        com.google.javascript.rhino.Node node39 = arguments31.getParentNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope40 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments19", arguments11.equals(arguments19) ? arguments11.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope11.declare("goog.scope", node16, jSType17, compilerInput18, false);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = scope11.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var20.", arguments6.equals(var20) == var20.equals(arguments6));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        com.google.javascript.rhino.Node node13 = arguments10.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("<non-file>", node16, jSType17, compilerInput18, false);
        int int21 = scope2.getDepth();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var20.", arguments10.equals(var20) == var20.equals(arguments10));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope9.getVars();
        com.google.javascript.jscomp.Scope.Var var12 = scope9.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.jscomp.Scope.Var var14 = arguments13.getDeclaration();
        boolean boolean16 = arguments13.equals((java.lang.Object) (byte) -1);
        boolean boolean17 = arguments13.isConst();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments13.input;
        boolean boolean19 = arguments13.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments13", arguments6.equals(arguments13) ? arguments6.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        com.google.javascript.jscomp.Scope.Var var24 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope25 = scope2.getGlobalScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var24", arguments11.equals(var24) ? arguments11.hashCode() == var24.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("hi!", node20, jSType21, compilerInput22);
        boolean boolean24 = var23.isNoShadow();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var23.", arguments11.equals(var23) == var23.equals(arguments11));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        int int20 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node24, jSType25, compilerInput26, false);
        boolean boolean29 = var28.isLocal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var28.", arguments10.equals(var28) == var28.equals(arguments10));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        com.google.javascript.rhino.Node node13 = scope11.getRootNode();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getVars();
        com.google.javascript.jscomp.Scope.Var var19 = scope16.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
        com.google.javascript.jscomp.Scope.Var var21 = arguments20.getDeclaration();
        boolean boolean23 = arguments20.equals((java.lang.Object) (byte) -1);
        boolean boolean24 = arguments20.isConst();
        com.google.javascript.jscomp.CompilerInput compilerInput25 = arguments20.input;
        com.google.javascript.rhino.Node node26 = arguments20.getParentNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable27 = scope11.getReferences((com.google.javascript.jscomp.Scope.Var) arguments20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getArgumentsVar();
        boolean boolean15 = var14.isConst();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var14", arguments10.equals(var14) ? arguments10.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope2.getVars();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope2.declare("Scope.Var arguments{null}", node22, jSType23, compilerInput24);
        boolean boolean26 = var25.isDefine;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var16 = var15.getSymbol();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var16", arguments6.equals(var16) ? arguments6.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        java.lang.String str8 = arguments6.getName();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope11.getAllSymbols();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getVars();
        com.google.javascript.jscomp.Scope.Var var19 = scope16.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
        boolean boolean21 = arguments20.isDefine();
        boolean boolean22 = arguments20.isGlobal();
        com.google.javascript.rhino.Node node23 = arguments20.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope11.getScope((com.google.javascript.jscomp.Scope.Var) arguments20);
        com.google.javascript.rhino.Node node25 = arguments20.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType26 = arguments20.getType();
        com.google.javascript.rhino.Node node27 = arguments20.nameNode;
        boolean boolean28 = arguments6.equals((java.lang.Object) node27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope16.declare("hi!", node21, jSType22, compilerInput23, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput29 = null;
        com.google.javascript.jscomp.Scope.Var var30 = scope16.declare("arguments", node27, jSType28, compilerInput29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope13.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope18 = scope13.getGlobalScope();
        boolean boolean19 = arguments6.equals((java.lang.Object) scope18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope18.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        boolean boolean22 = scope18.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean16 = scope2.isLocal();
        int int17 = scope2.getVarCount();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        com.google.javascript.jscomp.Scope.Var var25 = arguments24.getDeclaration();
        boolean boolean27 = arguments24.equals((java.lang.Object) (byte) -1);
        java.lang.String str28 = arguments24.getInputName();
        int int29 = arguments24.index;
        java.lang.String str30 = arguments24.getInputName();
        java.lang.String str31 = arguments24.getInputName();
        java.lang.String str32 = arguments24.name;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable33 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments24", arguments10.equals(arguments24) ? arguments10.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var16 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getVars();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var16", arguments10.equals(var16) ? arguments10.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("arguments", node12, jSType13, compilerInput14);
        com.google.javascript.jscomp.Scope.Var var17 = scope2.getVar("hi!");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var15.", arguments10.equals(var15) == var15.equals(arguments10));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        int int8 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope13.getAllSymbols();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        boolean boolean23 = arguments22.isDefine();
        boolean boolean24 = arguments22.isGlobal();
        com.google.javascript.rhino.Node node25 = arguments22.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope13.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        com.google.javascript.rhino.Node node27 = arguments22.getNameNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable28 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and arguments22", var10.equals(arguments22) ? var10.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        boolean boolean13 = var12.isExtern();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope16.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = scope16.getAllSymbols();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        boolean boolean26 = arguments25.isDefine();
        boolean boolean27 = arguments25.isGlobal();
        com.google.javascript.rhino.Node node28 = arguments25.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope16.getScope((com.google.javascript.jscomp.Scope.Var) arguments25);
        boolean boolean30 = arguments25.isConst();
        java.lang.String str31 = arguments25.getInputName();
        com.google.javascript.rhino.Node node32 = arguments25.nameNode;
        com.google.javascript.jscomp.Scope.Var var33 = arguments25.getDeclaration();
        boolean boolean34 = var12.equals((java.lang.Object) var33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var12 and arguments25", var12.equals(arguments25) ? var12.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        java.lang.String str29 = var28.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope20 = scope18.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getArgumentsVar();
        int int22 = scope18.getDepth();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var21", arguments6.equals(var21) ? arguments6.hashCode() == var21.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        boolean boolean20 = scope2.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope2.declare("Scope.Var arguments{null}", node23, jSType24, compilerInput25);
        java.lang.String str27 = var26.name;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var26.", arguments10.equals(var26) == var26.equals(arguments10));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope13.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope18 = scope13.getGlobalScope();
        boolean boolean19 = arguments6.equals((java.lang.Object) scope18);
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope23.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = scope23.getAllSymbols();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope28.getVars();
        com.google.javascript.jscomp.Scope.Var var31 = scope28.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments32 = new com.google.javascript.jscomp.Scope.Arguments(scope28);
        boolean boolean33 = arguments32.isDefine();
        boolean boolean34 = arguments32.isGlobal();
        com.google.javascript.rhino.Node node35 = arguments32.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope23.getScope((com.google.javascript.jscomp.Scope.Var) arguments32);
        com.google.javascript.jscomp.Scope.Var var37 = arguments32.getSymbol();
        boolean boolean38 = var37.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable39 = scope18.getReferences(var37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var16 = scope2.getArgumentsVar();
        boolean boolean17 = var16.isLocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var16", arguments10.equals(var16) ? arguments10.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        com.google.javascript.rhino.jstype.ObjectType objectType26 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope2.declare("<non-file>", node28, jSType29, compilerInput30, true);
        boolean boolean33 = scope2.isGlobal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var32.", arguments11.equals(var32) == var32.equals(arguments11));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
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
        boolean boolean22 = arguments16.isTypeInferred();
        java.lang.String str23 = arguments16.toString();
        com.google.javascript.jscomp.Scope scope24 = arguments16.getScope();
        boolean boolean25 = arguments16.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput26 = arguments16.getInput();
        int int27 = arguments16.index;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = arguments16.getInput();
        com.google.javascript.jscomp.CompilerInput compilerInput29 = arguments16.input;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable30 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments16);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        com.google.javascript.jscomp.Scope scope33 = new com.google.javascript.jscomp.Scope(node31, objectType32);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor34 = scope33.getVars();
        com.google.javascript.jscomp.Scope.Var var36 = scope33.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments37 = new com.google.javascript.jscomp.Scope.Arguments(scope33);
        com.google.javascript.jscomp.Scope.Var var38 = arguments37.getDeclaration();
        boolean boolean40 = arguments37.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = arguments37.getJSDocInfo();
        boolean boolean42 = arguments37.isLocal();
        boolean boolean43 = arguments37.isTypeInferred();
        java.lang.String str44 = arguments37.toString();
        com.google.javascript.jscomp.Scope scope45 = arguments37.getScope();
        int int46 = arguments37.index;
        boolean boolean47 = arguments37.isNoShadow();
        com.google.javascript.rhino.Node node48 = arguments37.getNode();
        java.lang.String str49 = arguments37.getName();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable50 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments16 and arguments37", arguments16.equals(arguments37) ? arguments16.hashCode() == arguments37.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope16 = var15.getScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var15", arguments10.equals(var15) ? arguments10.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope24.declare("goog.scope", node26, jSType27, compilerInput28);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor30 = scope24.getDeclarativelyUnboundVarsWithoutTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var29.", arguments11.equals(var29) == var29.equals(arguments11));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope2.getVars();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope2.declare("Scope.Var arguments{null}", node22, jSType23, compilerInput24);
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope28.getVars();
        com.google.javascript.jscomp.Scope.Var var31 = scope28.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments32 = new com.google.javascript.jscomp.Scope.Arguments(scope28);
        boolean boolean33 = arguments32.isDefine();
        boolean boolean34 = arguments32.isGlobal();
        com.google.javascript.rhino.Node node35 = arguments32.getNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable36 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments32", arguments11.equals(arguments32) ? arguments11.hashCode() == arguments32.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        boolean boolean9 = scope2.isBottom();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("Scope.Var arguments{null}", node9, jSType10, compilerInput11);
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = var12.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        boolean boolean17 = scope14.isBottom();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope20.getParentScope();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        boolean boolean29 = arguments28.isDefine();
        boolean boolean30 = arguments28.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable31 = scope20.getReferences((com.google.javascript.jscomp.Scope.Var) arguments28);
        boolean boolean32 = arguments28.isGlobal();
        boolean boolean33 = arguments28.isLocal();
        com.google.javascript.rhino.Node node34 = arguments28.nameNode;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable35 = scope14.getReferences((com.google.javascript.jscomp.Scope.Var) arguments28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments28", arguments6.equals(arguments28) ? arguments6.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("<non-file>", node12, jSType13, compilerInput14);
        com.google.javascript.jscomp.Scope scope16 = var15.getScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope11.declare("goog.scope", node16, jSType17, compilerInput18, false);
        int int21 = scope11.getVarCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var20.", arguments6.equals(var20) == var20.equals(arguments6));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope13.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope18 = scope13.getGlobalScope();
        boolean boolean19 = arguments6.equals((java.lang.Object) scope18);
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope scope21 = scope18.getParent();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        int int14 = scope13.getVarCount();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope13.declare("<non-file>", node16, jSType17, compilerInput18);
        com.google.javascript.rhino.Node node20 = scope13.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var19.", arguments6.equals(var19) == var19.equals(arguments6));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        boolean boolean8 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope12 = scope11.getGlobalScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope11.declare("arguments", node14, jSType15, compilerInput16);
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope29.getParentScope();
        boolean boolean31 = scope29.isLocal();
        boolean boolean32 = scope29.isLocal();
        boolean boolean33 = var17.equals((java.lang.Object) scope29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        java.lang.String str8 = arguments6.name;
        com.google.javascript.rhino.Node node9 = arguments6.getNode();
        java.lang.String str10 = arguments6.getName();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.jscomp.Scope.Var var18 = arguments17.getDeclaration();
        boolean boolean20 = arguments17.equals((java.lang.Object) (byte) -1);
        java.lang.String str21 = arguments17.getInputName();
        com.google.javascript.jscomp.Scope.Var var22 = arguments17.getDeclaration();
        boolean boolean23 = arguments6.equals((java.lang.Object) var22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments17", arguments6.equals(arguments17) ? arguments6.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        boolean boolean8 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope12 = scope11.getGlobalScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope11.declare("arguments", node14, jSType15, compilerInput16);
        java.lang.String str18 = var17.getName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.jscomp.Scope.Var var18 = scope15.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        com.google.javascript.jscomp.Scope.Var var20 = arguments19.getDeclaration();
        boolean boolean22 = arguments19.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = arguments19.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope24 = arguments19.scope;
        com.google.javascript.jscomp.Scope.Var var25 = arguments19.getSymbol();
        boolean boolean27 = arguments19.equals((java.lang.Object) 0.0d);
        boolean boolean28 = arguments6.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments19", arguments6.equals(arguments19) ? arguments6.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        boolean boolean16 = arguments11.isNoShadow();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Var var22 = scope19.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        boolean boolean24 = arguments23.isDefine();
        com.google.javascript.jscomp.Scope scope25 = arguments23.getScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot27 = scope25.getSlot("Scope.Var arguments{null}");
        boolean boolean28 = arguments11.equals((java.lang.Object) scope25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments23", arguments11.equals(arguments23) ? arguments11.hashCode() == arguments23.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope9.getVars();
        com.google.javascript.jscomp.Scope.Var var12 = scope9.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.jscomp.Scope.Var var14 = arguments13.getDeclaration();
        boolean boolean16 = arguments13.equals((java.lang.Object) (byte) -1);
        java.lang.String str17 = arguments13.getInputName();
        com.google.javascript.rhino.Node node18 = arguments13.getParentNode();
        com.google.javascript.jscomp.Scope.Var var19 = arguments13.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = var19.getJSDocInfo();
        boolean boolean21 = var19.isConst();
        com.google.javascript.jscomp.Scope.Var var22 = var19.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope2.getScope(var22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var22", arguments6.equals(var22) ? arguments6.hashCode() == var22.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var20 = scope2.getArgumentsVar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments19", arguments11.equals(arguments19) ? arguments11.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope19.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope19.getAllSymbols();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        boolean boolean29 = arguments28.isDefine();
        boolean boolean30 = arguments28.isGlobal();
        com.google.javascript.rhino.Node node31 = arguments28.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope19.getScope((com.google.javascript.jscomp.Scope.Var) arguments28);
        boolean boolean33 = arguments28.isConst();
        java.lang.String str34 = arguments28.getInputName();
        com.google.javascript.rhino.Node node35 = arguments28.nameNode;
        com.google.javascript.jscomp.Scope.Var var36 = arguments28.getDeclaration();
        boolean boolean37 = arguments6.equals((java.lang.Object) arguments28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments28", arguments6.equals(arguments28) ? arguments6.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        int int20 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node24, jSType25, compilerInput26, false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot30 = scope2.getSlot("Scope.Var arguments{null}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var28.", arguments10.equals(var28) == var28.equals(arguments10));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        com.google.javascript.jscomp.Scope scope19 = arguments11.getScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.jscomp.Scope scope23 = scope22.getGlobalScope();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.jscomp.Scope scope26 = new com.google.javascript.jscomp.Scope(node24, objectType25);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope26.getVars();
        com.google.javascript.jscomp.Scope.Var var29 = scope26.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments30 = new com.google.javascript.jscomp.Scope.Arguments(scope26);
        boolean boolean31 = arguments30.isDefine();
        boolean boolean32 = arguments30.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope33 = scope22.getScope((com.google.javascript.jscomp.Scope.Var) arguments30);
        com.google.javascript.rhino.Node node34 = arguments30.nameNode;
        com.google.javascript.jscomp.Scope scope35 = arguments30.getScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable36 = scope19.getReferences((com.google.javascript.jscomp.Scope.Var) arguments30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments30", arguments11.equals(arguments30) ? arguments11.hashCode() == arguments30.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        int int16 = scope13.getVarCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("arguments", node12, jSType13, compilerInput14);
        com.google.javascript.jscomp.Scope.Var var16 = var15.getDeclaration();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var15.", arguments10.equals(var15) == var15.equals(arguments10));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("Scope.Var arguments{null}", node13, jSType14, compilerInput15, false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope2.getOwnSlot("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope16.declare("hi!", node21, jSType22, compilerInput23, true);
        com.google.javascript.jscomp.CompilerInput compilerInput26 = var25.getInput();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope18.declare("arguments", node21, jSType22, compilerInput23);
        boolean boolean25 = scope18.isLocal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var24.", arguments6.equals(var24) == var24.equals(arguments6));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        java.lang.Object obj27 = null;
        boolean boolean28 = arguments22.equals(obj27);
        com.google.javascript.jscomp.Scope scope29 = arguments22.scope;
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = arguments22.getJSDocInfo();
        com.google.javascript.jscomp.CompilerInput compilerInput31 = arguments22.input;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope11.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("<non-file>", node12, jSType13, compilerInput14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        var15.resolveType(errorReporter16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        com.google.javascript.rhino.Node node17 = scope14.getRootNode();
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
        java.lang.String str31 = var30.getName();
        java.lang.String str32 = var30.getInputName();
        boolean boolean33 = var30.isGlobal();
        com.google.javascript.rhino.Node node34 = var30.getParentNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = scope14.getScope(var30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var30", arguments6.equals(var30) ? arguments6.hashCode() == var30.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope11.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var16 = scope11.getArgumentsVar();
        boolean boolean17 = var16.isExtern();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var16", arguments6.equals(var16) ? arguments6.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        java.lang.String str8 = arguments6.name;
        boolean boolean9 = arguments6.isNoShadow();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope12.getVars();
        com.google.javascript.rhino.Node node14 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope scope15 = scope12.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        boolean boolean17 = arguments6.equals((java.lang.Object) scope15);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        com.google.javascript.jscomp.Scope.Var var25 = arguments24.getDeclaration();
        boolean boolean27 = arguments24.equals((java.lang.Object) (byte) -1);
        java.lang.String str28 = arguments24.getInputName();
        com.google.javascript.rhino.Node node29 = arguments24.getParentNode();
        com.google.javascript.rhino.Node node30 = arguments24.getParentNode();
        com.google.javascript.rhino.Node node31 = arguments24.nameNode;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable32 = scope15.getReferences((com.google.javascript.jscomp.Scope.Var) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments24", arguments6.equals(arguments24) ? arguments6.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
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
        boolean boolean22 = arguments16.isTypeInferred();
        java.lang.String str23 = arguments16.toString();
        com.google.javascript.jscomp.Scope scope24 = arguments16.getScope();
        int int25 = arguments16.index;
        boolean boolean26 = arguments16.isNoShadow();
        boolean boolean27 = arguments6.equals((java.lang.Object) arguments16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments16", arguments6.equals(arguments16) ? arguments6.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope16.declare("hi!", node21, jSType22, compilerInput23, true);
        com.google.javascript.rhino.Node node26 = scope16.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        com.google.javascript.rhino.Node node8 = arguments6.getNode();
        int int9 = arguments6.index;
        java.lang.String str10 = arguments6.toString();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        java.lang.String str18 = arguments17.getName();
        boolean boolean19 = arguments6.equals((java.lang.Object) arguments17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments17", arguments6.equals(arguments17) ? arguments6.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        boolean boolean31 = scope2.isDeclared("arguments", false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("goog.scope");
        int int18 = scope14.getVarCount();
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
        com.google.javascript.rhino.Node node31 = arguments25.getNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable32 = scope14.getReferences((com.google.javascript.jscomp.Scope.Var) arguments25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments25", arguments6.equals(arguments25) ? arguments6.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        boolean boolean18 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope19 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope22.getParentScope();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.jscomp.Scope scope26 = new com.google.javascript.jscomp.Scope(node24, objectType25);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope26.getVars();
        com.google.javascript.jscomp.Scope.Var var29 = scope26.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments30 = new com.google.javascript.jscomp.Scope.Arguments(scope26);
        boolean boolean31 = arguments30.isDefine();
        boolean boolean32 = arguments30.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable33 = scope22.getReferences((com.google.javascript.jscomp.Scope.Var) arguments30);
        com.google.javascript.rhino.Node node34 = arguments30.getNode();
        com.google.javascript.jscomp.Scope.Var var35 = arguments30.getDeclaration();
        boolean boolean36 = arguments30.isDefine;
        java.lang.String str37 = arguments30.name;
        java.lang.String str38 = arguments30.getInputName();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable39 = scope19.getReferences((com.google.javascript.jscomp.Scope.Var) arguments30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments30", arguments10.equals(arguments30) ? arguments10.hashCode() == arguments30.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        com.google.javascript.rhino.Node node16 = arguments11.getNameNode();
        java.lang.String str17 = arguments11.name;
        java.lang.String str18 = arguments11.getInputName();
        java.lang.String str19 = arguments11.getName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = arguments11.getJSDocInfo();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope23.getParentScope();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope27.getVars();
        com.google.javascript.jscomp.Scope.Var var30 = scope27.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments31 = new com.google.javascript.jscomp.Scope.Arguments(scope27);
        boolean boolean32 = arguments31.isDefine();
        boolean boolean33 = arguments31.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable34 = scope23.getReferences((com.google.javascript.jscomp.Scope.Var) arguments31);
        boolean boolean35 = scope23.isGlobal();
        com.google.javascript.rhino.Node node36 = scope23.getRootNode();
        boolean boolean39 = scope23.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node40 = scope23.getRootNode();
        boolean boolean41 = scope23.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable42 = scope23.getAllSymbols();
        int int43 = scope23.getDepth();
        com.google.javascript.jscomp.Scope scope44 = scope23.getParent();
        boolean boolean45 = arguments11.equals((java.lang.Object) scope44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments31", arguments11.equals(arguments31) ? arguments11.hashCode() == arguments31.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("hi!", node20, jSType21, compilerInput22);
        com.google.javascript.jscomp.Scope.Var var24 = scope2.getArgumentsVar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var23.", arguments11.equals(var23) == var23.equals(arguments11));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        boolean boolean26 = scope2.isGlobal();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope2.declare("hi!", node28, jSType29, compilerInput30, false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot34 = scope2.getSlot("Scope.Var arguments{null}");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var32.", arguments11.equals(var32) == var32.equals(arguments11));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        int int14 = scope13.getVarCount();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope13.declare("<non-file>", node16, jSType17, compilerInput18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        var19.setType(jSType20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var19.", arguments6.equals(var19) == var19.equals(arguments6));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getOwnSlot("");
        int int16 = scope2.getDepth();
        boolean boolean17 = scope2.isLocal();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        com.google.javascript.jscomp.Scope.Var var25 = arguments24.getDeclaration();
        boolean boolean27 = arguments24.equals((java.lang.Object) (byte) -1);
        java.lang.String str28 = arguments24.getInputName();
        int int29 = arguments24.index;
        java.lang.String str30 = arguments24.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput31 = arguments24.getInput();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments24", arguments10.equals(arguments24) ? arguments10.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope18.declare("Scope.Var arguments{null}", node21, jSType22, compilerInput23, false);
        boolean boolean26 = var25.isGlobal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope18.declare("arguments", node21, jSType22, compilerInput23);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot26 = scope18.getOwnSlot("arguments");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and jSTypeStaticSlot26.", arguments6.equals(jSTypeStaticSlot26) == jSTypeStaticSlot26.equals(arguments6));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean16 = arguments15.isDefine();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments15", arguments10.equals(arguments15) ? arguments10.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        boolean boolean17 = scope14.isBottom();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = scope14.getAllSymbols();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        com.google.javascript.jscomp.Scope.Var var26 = arguments25.getDeclaration();
        boolean boolean28 = arguments25.equals((java.lang.Object) (byte) -1);
        boolean boolean29 = arguments25.isConst();
        java.lang.String str30 = arguments25.toString();
        boolean boolean31 = arguments25.isNoShadow();
        com.google.javascript.jscomp.Scope scope32 = arguments25.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope33 = scope14.getScope((com.google.javascript.jscomp.Scope.Var) arguments25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments25", arguments6.equals(arguments25) ? arguments6.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isGlobal();
        com.google.javascript.rhino.Node node9 = arguments6.getNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = arguments6.getJSDocInfo();
        boolean boolean11 = arguments6.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getVars();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        com.google.javascript.jscomp.Scope.Var var19 = arguments18.getDeclaration();
        boolean boolean21 = arguments18.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = arguments18.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope23 = arguments18.scope;
        int int24 = scope23.getDepth();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope23.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean28 = arguments6.equals((java.lang.Object) varItor27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments18", arguments6.equals(arguments18) ? arguments6.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        com.google.javascript.jscomp.Scope.Var var17 = scope11.getArgumentsVar();
        java.lang.String str18 = var17.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var17", arguments6.equals(var17) ? arguments6.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        boolean boolean8 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope12 = scope11.getGlobalScope();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope11.declare("arguments", node14, jSType15, compilerInput16);
        boolean boolean18 = var17.isExtern();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isGlobal();
        java.lang.String str9 = arguments6.name;
        java.lang.String str10 = arguments6.toString();
        com.google.javascript.rhino.Node node11 = arguments6.getNode();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getVars();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        com.google.javascript.jscomp.Scope.Var var19 = arguments18.getDeclaration();
        boolean boolean21 = arguments18.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = arguments18.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        arguments18.resolveType(errorReporter23);
        com.google.javascript.rhino.Node node25 = arguments18.nameNode;
        com.google.javascript.jscomp.Scope scope26 = arguments18.scope;
        boolean boolean27 = arguments18.isTypeInferred();
        java.lang.String str28 = arguments18.toString();
        boolean boolean29 = arguments6.equals((java.lang.Object) str28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments18", arguments6.equals(arguments18) ? arguments6.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        com.google.javascript.jscomp.Scope.Var var29 = var28.getSymbol();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var29.", arguments11.equals(var29) == var29.equals(arguments11));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope19.getParentScope();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        boolean boolean28 = arguments27.isDefine();
        boolean boolean29 = arguments27.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable30 = scope19.getReferences((com.google.javascript.jscomp.Scope.Var) arguments27);
        boolean boolean31 = arguments27.isGlobal();
        com.google.javascript.jscomp.Scope.Var var32 = arguments27.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput33 = arguments27.input;
        boolean boolean34 = arguments10.equals((java.lang.Object) arguments27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments27", arguments10.equals(arguments27) ? arguments10.hashCode() == arguments27.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope20 = scope18.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var22 = var21.getDeclaration();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var21", arguments6.equals(var21) ? arguments6.hashCode() == var21.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        com.google.javascript.jscomp.Scope scope18 = var17.getScope();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        var17.resolveType(errorReporter19);
        com.google.javascript.jscomp.Scope scope21 = var17.scope;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        java.lang.String str29 = arguments28.getName();
        boolean boolean30 = arguments28.isDefine();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable31 = scope21.getReferences((com.google.javascript.jscomp.Scope.Var) arguments28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments28", arguments10.equals(arguments28) ? arguments10.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        boolean boolean9 = var8.isNoShadow();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = arguments11.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope21 = arguments11.scope;
        boolean boolean22 = arguments11.isGlobal();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope25.getVars();
        com.google.javascript.jscomp.Scope.Var var28 = scope25.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        com.google.javascript.jscomp.Scope.Var var30 = arguments29.getDeclaration();
        boolean boolean32 = arguments29.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = arguments29.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope34 = arguments29.scope;
        int int35 = scope34.getDepth();
        com.google.javascript.jscomp.Scope.Var var37 = scope34.getVar("");
        boolean boolean38 = scope34.isBottom();
        boolean boolean39 = arguments11.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments29", arguments11.equals(arguments29) ? arguments11.hashCode() == arguments29.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
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
        boolean boolean22 = arguments16.isTypeInferred();
        java.lang.String str23 = arguments16.toString();
        com.google.javascript.jscomp.Scope scope24 = arguments16.getScope();
        boolean boolean25 = arguments16.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput26 = arguments16.getInput();
        int int27 = arguments16.index;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = arguments16.getInput();
        com.google.javascript.jscomp.CompilerInput compilerInput29 = arguments16.input;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable30 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments16);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput34 = null;
        com.google.javascript.jscomp.Scope.Var var35 = scope2.declare("Scope.Var arguments{null}", node32, jSType33, compilerInput34);
        java.lang.String str36 = var35.name;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments16 and var35.", arguments16.equals(var35) == var35.equals(arguments16));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        com.google.javascript.rhino.Node node13 = arguments10.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("<non-file>", node16, jSType17, compilerInput18, false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getOwnSlot("goog.scope");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var20.", arguments10.equals(var20) == var20.equals(arguments10));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope16.declare("hi!", node21, jSType22, compilerInput23, true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope16.getDeclarativelyUnboundVarsWithoutTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = var11.getType();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope16.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = scope16.getAllSymbols();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        boolean boolean26 = arguments25.isDefine();
        boolean boolean27 = arguments25.isGlobal();
        com.google.javascript.rhino.Node node28 = arguments25.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope16.getScope((com.google.javascript.jscomp.Scope.Var) arguments25);
        boolean boolean30 = arguments25.isConst();
        java.lang.String str31 = arguments25.getInputName();
        com.google.javascript.rhino.Node node32 = arguments25.nameNode;
        boolean boolean33 = arguments25.isLocal();
        boolean boolean34 = var11.equals((java.lang.Object) arguments25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var11 and arguments25", var11.equals(arguments25) ? var11.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        int int20 = scope2.getDepth();
        com.google.javascript.jscomp.Scope.Var var22 = scope2.getVar("goog.scope");
        int int23 = scope2.getDepth();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope27.getVars();
        com.google.javascript.jscomp.Scope.Var var30 = scope27.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments31 = new com.google.javascript.jscomp.Scope.Arguments(scope27);
        boolean boolean32 = arguments31.isDefine();
        boolean boolean33 = arguments31.isGlobal();
        com.google.javascript.rhino.Node node34 = arguments31.getNode();
        boolean boolean35 = arguments31.isDefine();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments31", arguments10.equals(arguments31) ? arguments10.hashCode() == arguments31.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        boolean boolean15 = scope2.isLocal();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("Scope.Var arguments{null}", node17, jSType18, compilerInput19);
        com.google.javascript.jscomp.CompilerInput compilerInput21 = var20.input;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var20.", arguments10.equals(var20) == var20.equals(arguments10));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope16 = var15.getScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        boolean boolean13 = var12.isGlobal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("Scope.Var arguments{null}", node9, jSType10, compilerInput11);
        com.google.javascript.rhino.Node node13 = var12.nameNode;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        boolean boolean8 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = var12.getNameNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var12", arguments6.equals(var12) ? arguments6.hashCode() == var12.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = arguments11.getJSDocInfo();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope21.getParentScope();
        boolean boolean27 = scope21.isBottom();
        boolean boolean28 = arguments11.equals((java.lang.Object) scope21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments25", arguments11.equals(arguments25) ? arguments11.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope11.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var16 = scope11.getArgumentsVar();
        boolean boolean17 = var16.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var16", arguments6.equals(var16) ? arguments6.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope24.declare("goog.scope", node26, jSType27, compilerInput28);
        boolean boolean30 = var29.isNoShadow();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var29.", arguments11.equals(var29) == var29.equals(arguments11));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str8 = arguments7.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        boolean boolean24 = scope2.isGlobal();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope27.getVars();
        com.google.javascript.jscomp.Scope.Var var30 = scope27.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments31 = new com.google.javascript.jscomp.Scope.Arguments(scope27);
        com.google.javascript.jscomp.Scope.Var var32 = arguments31.getDeclaration();
        boolean boolean34 = arguments31.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = arguments31.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        arguments31.resolveType(errorReporter36);
        com.google.javascript.rhino.Node node38 = arguments31.nameNode;
        java.lang.String str39 = arguments31.getInputName();
        boolean boolean40 = arguments31.isGlobal();
        com.google.javascript.jscomp.Scope.Var var41 = arguments31.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope42 = scope2.getScope(var41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var41", arguments11.equals(var41) ? arguments11.hashCode() == var41.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        java.lang.String str8 = arguments6.name;
        com.google.javascript.rhino.Node node9 = arguments6.getNode();
        java.lang.String str10 = arguments6.getName();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope13.getAllSymbols();
        com.google.javascript.jscomp.Scope scope16 = scope13.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope13.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope13.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope13.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope13.getOwnSlot("");
        boolean boolean23 = arguments6.equals((java.lang.Object) scope13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable3 = scope2.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("goog.scope", node8, jSType9, compilerInput10, true);
        com.google.javascript.jscomp.Scope scope13 = var12.getScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments5 and var12.", arguments5.equals(var12) == var12.equals(arguments5));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getVars();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        com.google.javascript.jscomp.Scope.Var var19 = arguments18.getDeclaration();
        boolean boolean21 = arguments18.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = arguments18.getJSDocInfo();
        boolean boolean23 = arguments18.isLocal();
        boolean boolean24 = arguments18.isTypeInferred();
        com.google.javascript.jscomp.Scope scope25 = arguments18.scope;
        com.google.javascript.rhino.Node node26 = arguments18.getNode();
        java.lang.String str27 = arguments18.name;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments9 and arguments18", arguments9.equals(arguments18) ? arguments9.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
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
        boolean boolean21 = scope9.isGlobal();
        com.google.javascript.rhino.Node node22 = scope9.getRootNode();
        boolean boolean25 = scope9.isDeclared("<non-file>", true);
        boolean boolean26 = arguments6.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments17", arguments6.equals(arguments17) ? arguments6.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        int int13 = scope11.getVarCount();
        boolean boolean14 = scope11.isLocal();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getVars();
        com.google.javascript.jscomp.Scope.Var var20 = scope17.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.jscomp.Scope.Var var22 = arguments21.getDeclaration();
        boolean boolean24 = arguments21.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = arguments21.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var26 = arguments21.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope11.getScope((com.google.javascript.jscomp.Scope.Var) arguments21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope4 = scope3.getGlobalScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable5 = scope4.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var6 = scope4.getArgumentsVar();
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
        java.lang.String str23 = arguments13.getInputName();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope4.getReferences((com.google.javascript.jscomp.Scope.Var) arguments13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var6 and arguments13", var6.equals(arguments13) ? var6.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope13.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope18 = scope13.getGlobalScope();
        boolean boolean19 = arguments6.equals((java.lang.Object) scope18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope18.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = scope18.getTypeOfThis();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        com.google.javascript.jscomp.Scope.Var var29 = arguments28.getDeclaration();
        boolean boolean31 = arguments28.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = arguments28.getJSDocInfo();
        boolean boolean33 = arguments28.isLocal();
        boolean boolean34 = arguments28.isTypeInferred();
        com.google.javascript.jscomp.Scope scope35 = arguments28.scope;
        boolean boolean36 = arguments28.isTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType37 = arguments28.getType();
        boolean boolean38 = arguments28.isConst();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope39 = scope18.getScope((com.google.javascript.jscomp.Scope.Var) arguments28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments28", arguments6.equals(arguments28) ? arguments6.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        com.google.javascript.jscomp.Scope.Var var13 = var12.getDeclaration();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope17.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = scope17.getAllSymbols();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        boolean boolean27 = arguments26.isDefine();
        boolean boolean28 = arguments26.isGlobal();
        com.google.javascript.rhino.Node node29 = arguments26.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope17.getScope((com.google.javascript.jscomp.Scope.Var) arguments26);
        com.google.javascript.rhino.Node node31 = arguments26.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType32 = arguments26.getType();
        com.google.javascript.rhino.Node node33 = arguments26.nameNode;
        boolean boolean34 = arguments26.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = scope13.getScope((com.google.javascript.jscomp.Scope.Var) arguments26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments14", arguments6.equals(arguments14) ? arguments6.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean10 = scope2.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments9", arguments6.equals(arguments9) ? arguments6.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        com.google.javascript.jscomp.Scope.Var var25 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope26 = scope2.getGlobalScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments18 and var25", arguments18.equals(var25) ? arguments18.hashCode() == var25.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        boolean boolean15 = scope2.isLocal();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("Scope.Var arguments{null}", node17, jSType18, compilerInput19);
        java.lang.String str21 = var20.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var20.", arguments10.equals(var20) == var20.equals(arguments10));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("<non-file>", node12, jSType13, compilerInput14);
        com.google.javascript.rhino.Node node16 = var15.getNameNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean16 = scope2.isLocal();
        boolean boolean17 = scope2.isGlobal();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope2.declare("<non-file>", node19, jSType20, compilerInput21);
        boolean boolean23 = scope2.isGlobal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var22.", arguments10.equals(var22) == var22.equals(arguments10));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        java.lang.String str13 = arguments6.toString();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getVars();
        com.google.javascript.jscomp.Scope.Var var19 = scope16.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
        com.google.javascript.jscomp.Scope.Var var21 = arguments20.getDeclaration();
        boolean boolean23 = arguments20.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = arguments20.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        arguments20.resolveType(errorReporter25);
        com.google.javascript.rhino.Node node27 = arguments20.nameNode;
        java.lang.String str28 = arguments20.getInputName();
        boolean boolean29 = arguments20.isGlobal();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = arguments20.getJSDocInfo();
        boolean boolean31 = arguments6.equals((java.lang.Object) arguments20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        boolean boolean14 = scope11.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope11.getTypeOfThis();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope11.declare("arguments", node17, jSType18, compilerInput19);
        java.lang.String str21 = var20.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var20.", arguments6.equals(var20) == var20.equals(arguments6));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope11.declare("goog.scope", node16, jSType17, compilerInput18, false);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope11.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var20.", arguments6.equals(var20) == var20.equals(arguments6));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isGlobal();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = arguments6.input;
        com.google.javascript.jscomp.Scope scope10 = arguments6.getScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope10.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope12 = scope10.getParent();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope15.getAllSymbols();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        boolean boolean25 = arguments24.isDefine();
        boolean boolean26 = arguments24.isGlobal();
        com.google.javascript.rhino.Node node27 = arguments24.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope15.getScope((com.google.javascript.jscomp.Scope.Var) arguments24);
        boolean boolean29 = arguments24.isConst();
        java.lang.String str30 = arguments24.getInputName();
        boolean boolean31 = arguments24.isGlobal();
        boolean boolean32 = arguments24.isConst();
        java.lang.String str33 = arguments24.getName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = arguments24.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = scope10.getScope((com.google.javascript.jscomp.Scope.Var) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments24", arguments6.equals(arguments24) ? arguments6.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope15 = var14.scope;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var14", arguments10.equals(var14) ? arguments10.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getDeclarativelyUnboundVarsWithoutTypes();
        int int18 = scope16.getVarCount();
        com.google.javascript.jscomp.Scope.Var var19 = scope16.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var20 = scope16.getArgumentsVar();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope13.getReferences(var20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var20", arguments6.equals(var20) ? arguments6.hashCode() == var20.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("Scope.Var arguments{null}", node15, jSType16, compilerInput17, true);
        boolean boolean20 = var19.isDefine();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var19.", arguments10.equals(var19) == var19.equals(arguments10));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        boolean boolean17 = scope14.isBottom();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments16", arguments6.equals(arguments16) ? arguments6.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        com.google.javascript.jscomp.Scope scope8 = arguments6.getScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope8.getSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        boolean boolean18 = arguments17.isDefine();
        java.lang.String str19 = arguments17.getName();
        boolean boolean20 = arguments17.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope8.getScope((com.google.javascript.jscomp.Scope.Var) arguments17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments17", arguments6.equals(arguments17) ? arguments6.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope20.getOwnSlot("arguments");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        com.google.javascript.jscomp.Scope scope29 = scope28.getGlobalScope();
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.jscomp.Scope scope32 = new com.google.javascript.jscomp.Scope(node30, objectType31);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor33 = scope32.getVars();
        com.google.javascript.jscomp.Scope.Var var35 = scope32.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments36 = new com.google.javascript.jscomp.Scope.Arguments(scope32);
        boolean boolean37 = arguments36.isDefine();
        boolean boolean38 = arguments36.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope39 = scope28.getScope((com.google.javascript.jscomp.Scope.Var) arguments36);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        arguments36.resolveType(errorReporter40);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable42 = scope20.getReferences((com.google.javascript.jscomp.Scope.Var) arguments36);
        int int43 = arguments36.index;
        boolean boolean44 = arguments11.equals((java.lang.Object) arguments36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments36", arguments11.equals(arguments36) ? arguments11.hashCode() == arguments36.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        com.google.javascript.jscomp.Scope scope8 = arguments6.getScope();
        com.google.javascript.rhino.Node node9 = arguments6.getNode();
        boolean boolean10 = arguments6.isExtern();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.jscomp.Scope.Var var18 = arguments17.getDeclaration();
        boolean boolean20 = arguments17.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = arguments17.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        arguments17.resolveType(errorReporter22);
        com.google.javascript.rhino.Node node24 = arguments17.nameNode;
        java.lang.String str25 = arguments17.getInputName();
        boolean boolean26 = arguments17.isExtern();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = arguments17.getJSDocInfo();
        boolean boolean28 = arguments17.isNoShadow();
        boolean boolean29 = arguments6.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments17", arguments6.equals(arguments17) ? arguments6.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        boolean boolean9 = scope2.isGlobal();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("Scope.Var arguments{null}", node11, jSType12, compilerInput13, true);
        java.lang.String str16 = var15.getInputName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        boolean boolean18 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope19 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        com.google.javascript.jscomp.Scope.Var var27 = arguments26.getDeclaration();
        boolean boolean29 = arguments26.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = arguments26.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope31 = arguments26.scope;
        int int32 = arguments26.index;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable33 = scope19.getReferences((com.google.javascript.jscomp.Scope.Var) arguments26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments26", arguments10.equals(arguments26) ? arguments10.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        int int17 = scope14.getDepth();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments16", arguments6.equals(arguments16) ? arguments6.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        java.lang.String str14 = arguments10.getName();
        boolean boolean15 = arguments10.isNoShadow();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        boolean boolean27 = arguments22.isLocal();
        boolean boolean28 = arguments22.isTypeInferred();
        java.lang.String str29 = arguments22.toString();
        com.google.javascript.jscomp.Scope scope30 = arguments22.getScope();
        int int31 = arguments22.index;
        boolean boolean32 = arguments22.isNoShadow();
        java.lang.String str33 = arguments22.name;
        boolean boolean34 = arguments10.equals((java.lang.Object) str33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments22", arguments10.equals(arguments22) ? arguments10.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        com.google.javascript.rhino.jstype.JSType jSType16 = var15.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        com.google.javascript.jscomp.Scope.Var var17 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getNameNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var17", arguments6.equals(var17) ? arguments6.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str17 = arguments16.getInputName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments16", arguments11.equals(arguments16) ? arguments11.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("hi!", node20, jSType21, compilerInput22);
        boolean boolean24 = var23.isExtern();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var23.", arguments11.equals(var23) == var23.equals(arguments11));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        java.lang.String str8 = arguments6.name;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.jscomp.Scope.Var var18 = scope15.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        boolean boolean20 = arguments19.isDefine();
        boolean boolean21 = arguments19.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope11.getReferences((com.google.javascript.jscomp.Scope.Var) arguments19);
        boolean boolean23 = arguments6.equals((java.lang.Object) scope11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments19", arguments6.equals(arguments19) ? arguments6.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        com.google.javascript.jscomp.Scope scope19 = arguments11.getScope();
        boolean boolean20 = arguments11.isDefine;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope23.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = scope23.getAllSymbols();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope28.getVars();
        com.google.javascript.jscomp.Scope.Var var31 = scope28.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments32 = new com.google.javascript.jscomp.Scope.Arguments(scope28);
        boolean boolean33 = arguments32.isDefine();
        boolean boolean34 = arguments32.isGlobal();
        com.google.javascript.rhino.Node node35 = arguments32.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope23.getScope((com.google.javascript.jscomp.Scope.Var) arguments32);
        boolean boolean37 = arguments32.isConst();
        java.lang.String str38 = arguments32.getInputName();
        boolean boolean39 = arguments32.isGlobal();
        boolean boolean40 = arguments32.isConst();
        java.lang.String str41 = arguments32.getName();
        boolean boolean42 = arguments32.isDefine;
        boolean boolean43 = arguments32.isLocal();
        com.google.javascript.jscomp.DiagnosticType diagnosticType44 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY;
        boolean boolean45 = arguments32.equals((java.lang.Object) diagnosticType44);
        boolean boolean46 = arguments11.equals((java.lang.Object) boolean45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments32", arguments11.equals(arguments32) ? arguments11.hashCode() == arguments32.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.rhino.Node node15 = arguments14.nameNode;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments14", arguments6.equals(arguments14) ? arguments6.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        boolean boolean15 = scope2.isLocal();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("Scope.Var arguments{null}", node17, jSType18, compilerInput19);
        boolean boolean21 = scope2.isLocal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var20.", arguments10.equals(var20) == var20.equals(arguments10));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("<non-file>", node12, jSType13, compilerInput14);
        java.lang.String str16 = var15.getInputName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.rhino.Node node17 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope scope18 = scope15.getGlobalScope();
        com.google.javascript.jscomp.Scope scope19 = scope15.getParent();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope15.getSlot("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        boolean boolean23 = var12.equals((java.lang.Object) scope15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var12 and arguments22", var12.equals(arguments22) ? var12.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope20 = scope18.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getArgumentsVar();
        com.google.javascript.jscomp.CompilerInput compilerInput22 = var21.getInput();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var21", arguments6.equals(var21) ? arguments6.hashCode() == var21.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        boolean boolean26 = arguments25.isConst();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments25", arguments11.equals(arguments25) ? arguments11.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments4 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("goog.scope", node6, jSType7, compilerInput8);
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getArgumentsVar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments4 and var9.", arguments4.equals(var9) == var9.equals(arguments4));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope25.getVars();
        com.google.javascript.jscomp.Scope.Var var28 = scope25.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        boolean boolean30 = arguments29.isDefine();
        boolean boolean31 = arguments29.isGlobal();
        com.google.javascript.rhino.Node node32 = arguments29.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope33 = scope21.getScope((com.google.javascript.jscomp.Scope.Var) arguments29);
        boolean boolean36 = scope21.isDeclared("Scope.Var arguments{null}", true);
        com.google.javascript.jscomp.Scope scope37 = scope21.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments38 = new com.google.javascript.jscomp.Scope.Arguments(scope37);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable39 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments29", arguments10.equals(arguments29) ? arguments10.hashCode() == arguments29.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope11.declare("goog.scope", node16, jSType17, compilerInput18, false);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = var20.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var20.", arguments6.equals(var20) == var20.equals(arguments6));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        com.google.javascript.jscomp.Scope.Var var27 = arguments26.getDeclaration();
        boolean boolean29 = arguments26.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = arguments26.getJSDocInfo();
        boolean boolean31 = arguments26.isLocal();
        boolean boolean32 = arguments26.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable33 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments19", arguments11.equals(arguments19) ? arguments11.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        com.google.javascript.rhino.Node node18 = arguments11.getNameNode();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        boolean boolean25 = scope21.isGlobal();
        boolean boolean26 = scope21.isGlobal();
        int int27 = scope21.getVarCount();
        com.google.javascript.rhino.Node node28 = scope21.getRootNode();
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput32 = null;
        com.google.javascript.jscomp.Scope.Var var34 = scope21.declare("Scope.Var arguments{null}", node30, jSType31, compilerInput32, true);
        boolean boolean35 = arguments11.equals((java.lang.Object) compilerInput32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var34.", arguments11.equals(var34) == var34.equals(arguments11));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope22.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope22.getAllSymbols();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope27.getVars();
        com.google.javascript.jscomp.Scope.Var var30 = scope27.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments31 = new com.google.javascript.jscomp.Scope.Arguments(scope27);
        boolean boolean32 = arguments31.isDefine();
        boolean boolean33 = arguments31.isGlobal();
        com.google.javascript.rhino.Node node34 = arguments31.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = scope22.getScope((com.google.javascript.jscomp.Scope.Var) arguments31);
        com.google.javascript.rhino.Node node36 = arguments31.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType37 = arguments31.getType();
        com.google.javascript.rhino.Node node38 = arguments31.nameNode;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable39 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments31", arguments10.equals(arguments31) ? arguments10.hashCode() == arguments31.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("Scope.Var arguments{null}");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments12 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean15 = scope2.isDeclared("", false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments12", arguments6.equals(arguments12) ? arguments6.hashCode() == arguments12.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        com.google.javascript.rhino.Node node13 = var12.getNameNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope20 = scope18.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope scope22 = arguments21.scope;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        com.google.javascript.jscomp.Scope.Var var25 = scope24.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var26 = scope24.getArgumentsVar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var26", arguments11.equals(var26) ? arguments11.hashCode() == var26.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope20.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope20.getAllSymbols();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope25.getVars();
        com.google.javascript.jscomp.Scope.Var var28 = scope25.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        boolean boolean30 = arguments29.isDefine();
        boolean boolean31 = arguments29.isGlobal();
        com.google.javascript.rhino.Node node32 = arguments29.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope33 = scope20.getScope((com.google.javascript.jscomp.Scope.Var) arguments29);
        boolean boolean34 = arguments29.isConst();
        java.lang.String str35 = arguments29.getInputName();
        int int36 = arguments29.index;
        boolean boolean37 = arguments6.equals((java.lang.Object) int36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments29", arguments6.equals(arguments29) ? arguments6.hashCode() == arguments29.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str8 = arguments7.name;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        boolean boolean15 = arguments10.isConst();
        com.google.javascript.rhino.Node node16 = arguments10.getNameNode();
        boolean boolean17 = arguments10.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments10.input;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        com.google.javascript.jscomp.Scope.Var var26 = arguments25.getDeclaration();
        boolean boolean28 = arguments25.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = arguments25.getJSDocInfo();
        java.lang.Object obj30 = null;
        boolean boolean31 = arguments25.equals(obj30);
        com.google.javascript.jscomp.CompilerInput compilerInput32 = arguments25.input;
        boolean boolean33 = arguments10.equals((java.lang.Object) arguments25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments25", arguments10.equals(arguments25) ? arguments10.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        com.google.javascript.jscomp.CompilerInput compilerInput16 = arguments6.getInput();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope19.getParentScope();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        boolean boolean28 = arguments27.isDefine();
        boolean boolean29 = arguments27.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable30 = scope19.getReferences((com.google.javascript.jscomp.Scope.Var) arguments27);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable31 = scope19.getAllSymbols();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = scope19.getTypeOfThis();
        boolean boolean33 = arguments6.equals((java.lang.Object) scope19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments27", arguments6.equals(arguments27) ? arguments6.hashCode() == arguments27.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope21.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = scope21.getAllSymbols();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.jscomp.Scope scope26 = new com.google.javascript.jscomp.Scope(node24, objectType25);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope26.getVars();
        com.google.javascript.jscomp.Scope.Var var29 = scope26.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments30 = new com.google.javascript.jscomp.Scope.Arguments(scope26);
        boolean boolean31 = arguments30.isDefine();
        boolean boolean32 = arguments30.isGlobal();
        com.google.javascript.rhino.Node node33 = arguments30.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = scope21.getScope((com.google.javascript.jscomp.Scope.Var) arguments30);
        boolean boolean35 = arguments30.isConst();
        java.lang.String str36 = arguments30.getInputName();
        boolean boolean37 = arguments30.isGlobal();
        com.google.javascript.jscomp.Scope scope38 = arguments30.getScope();
        com.google.javascript.rhino.Node node39 = scope38.getRootNode();
        boolean boolean40 = arguments6.equals((java.lang.Object) node39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments30", arguments6.equals(arguments30) ? arguments6.hashCode() == arguments30.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        boolean boolean14 = scope11.isLocal();
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        int int16 = scope11.getDepth();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = arguments11.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope21 = arguments11.scope;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        com.google.javascript.jscomp.Scope.Var var29 = arguments28.getDeclaration();
        boolean boolean31 = arguments28.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = arguments28.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        arguments28.resolveType(errorReporter33);
        com.google.javascript.rhino.Node node35 = arguments28.nameNode;
        java.lang.String str36 = arguments28.getInputName();
        java.lang.String str37 = arguments28.getName();
        java.lang.String str38 = arguments28.getInputName();
        boolean boolean39 = arguments11.equals((java.lang.Object) arguments28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments28", arguments11.equals(arguments28) ? arguments11.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        boolean boolean14 = arguments6.isDefine;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.jscomp.Scope scope18 = scope17.getGlobalScope();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        boolean boolean26 = arguments25.isDefine();
        boolean boolean27 = arguments25.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope17.getScope((com.google.javascript.jscomp.Scope.Var) arguments25);
        com.google.javascript.jscomp.Scope.Var var29 = scope17.getArgumentsVar();
        boolean boolean30 = arguments6.equals((java.lang.Object) var29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments25", arguments6.equals(arguments25) ? arguments6.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getInputName();
        com.google.javascript.jscomp.Scope scope8 = arguments6.scope;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.jscomp.Scope.Var var18 = scope15.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        boolean boolean20 = arguments19.isDefine();
        boolean boolean21 = arguments19.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope11.getReferences((com.google.javascript.jscomp.Scope.Var) arguments19);
        boolean boolean23 = arguments19.isGlobal();
        java.lang.String str24 = arguments19.name;
        com.google.javascript.jscomp.Scope scope25 = arguments19.getScope();
        int int26 = arguments19.index;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope8.getScope((com.google.javascript.jscomp.Scope.Var) arguments19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments19", arguments6.equals(arguments19) ? arguments6.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.jscomp.Scope scope18 = scope17.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getVar("hi!");
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        com.google.javascript.jscomp.Scope.Var var28 = arguments27.getDeclaration();
        boolean boolean30 = arguments27.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = arguments27.getJSDocInfo();
        java.lang.Object obj32 = null;
        boolean boolean33 = arguments27.equals(obj32);
        com.google.javascript.jscomp.Scope scope34 = arguments27.scope;
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = arguments27.getJSDocInfo();
        boolean boolean36 = arguments27.isExtern();
        com.google.javascript.jscomp.CompilerInput compilerInput37 = arguments27.getInput();
        com.google.javascript.jscomp.CompilerInput compilerInput38 = arguments27.input;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope39 = scope18.getScope((com.google.javascript.jscomp.Scope.Var) arguments27);
        boolean boolean40 = arguments14.equals((java.lang.Object) jSTypeStaticScope39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments14", arguments6.equals(arguments14) ? arguments6.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
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
        boolean boolean22 = arguments16.isTypeInferred();
        java.lang.String str23 = arguments16.toString();
        com.google.javascript.jscomp.Scope scope24 = arguments16.getScope();
        boolean boolean25 = arguments16.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput26 = arguments16.getInput();
        int int27 = arguments16.index;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = arguments16.getInput();
        com.google.javascript.jscomp.CompilerInput compilerInput29 = arguments16.input;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable30 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments16);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput34 = null;
        com.google.javascript.jscomp.Scope.Var var35 = scope2.declare("Scope.Var arguments{null}", node32, jSType33, compilerInput34);
        com.google.javascript.jscomp.Scope.Var var36 = var35.getSymbol();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments16 and var36.", arguments16.equals(var36) == var36.equals(arguments16));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        com.google.javascript.rhino.Node node15 = arguments6.nameNode;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        boolean boolean27 = arguments22.isLocal();
        boolean boolean28 = arguments22.isTypeInferred();
        java.lang.String str29 = arguments22.toString();
        com.google.javascript.jscomp.Scope scope30 = arguments22.getScope();
        java.lang.Class<?> wildcardClass31 = scope30.getClass();
        boolean boolean32 = arguments6.equals((java.lang.Object) scope30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope13.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope18 = scope13.getGlobalScope();
        boolean boolean19 = arguments6.equals((java.lang.Object) scope18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope18.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var22 = scope18.getArgumentsVar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        boolean boolean17 = scope14.isBottom();
        boolean boolean18 = scope14.isLocal();
        com.google.javascript.jscomp.Scope.Var var19 = scope14.getArgumentsVar();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope14.getTypeOfThis();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var19", arguments6.equals(var19) ? arguments6.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        com.google.javascript.rhino.Node node8 = arguments6.getNode();
        int int9 = arguments6.index;
        java.lang.String str10 = arguments6.toString();
        boolean boolean11 = arguments6.isNoShadow();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getVars();
        com.google.javascript.jscomp.Scope.Var var17 = scope14.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        boolean boolean19 = arguments18.isDefine();
        boolean boolean20 = arguments18.isGlobal();
        com.google.javascript.rhino.Node node21 = arguments18.getNode();
        com.google.javascript.rhino.jstype.JSType jSType22 = arguments18.getType();
        boolean boolean23 = arguments6.equals((java.lang.Object) jSType22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments18", arguments6.equals(arguments18) ? arguments6.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        java.lang.String str14 = arguments10.getName();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getDeclarativelyUnboundVarsWithoutTypes();
        int int19 = scope17.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope17.getTypeOfThis();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.jscomp.Scope scope24 = scope23.getGlobalScope();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope27.getVars();
        com.google.javascript.jscomp.Scope.Var var30 = scope27.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments31 = new com.google.javascript.jscomp.Scope.Arguments(scope27);
        boolean boolean32 = arguments31.isDefine();
        boolean boolean33 = arguments31.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = scope23.getScope((com.google.javascript.jscomp.Scope.Var) arguments31);
        com.google.javascript.rhino.Node node35 = arguments31.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType36 = arguments31.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope37 = scope17.getScope((com.google.javascript.jscomp.Scope.Var) arguments31);
        com.google.javascript.rhino.Node node38 = arguments31.getNameNode();
        boolean boolean39 = arguments10.equals((java.lang.Object) arguments31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments31", arguments10.equals(arguments31) ? arguments10.hashCode() == arguments31.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        boolean boolean11 = arguments10.isDefine();
        java.lang.String str12 = arguments10.name;
        com.google.javascript.rhino.Node node13 = arguments10.nameNode;
        boolean boolean14 = arguments10.isNoShadow();
        boolean boolean15 = arguments10.isConst();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope2.getOwnSlot("goog.scope");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope21.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = scope21.getAllSymbols();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.jscomp.Scope scope26 = new com.google.javascript.jscomp.Scope(node24, objectType25);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope26.getVars();
        com.google.javascript.jscomp.Scope.Var var29 = scope26.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments30 = new com.google.javascript.jscomp.Scope.Arguments(scope26);
        boolean boolean31 = arguments30.isDefine();
        boolean boolean32 = arguments30.isGlobal();
        com.google.javascript.rhino.Node node33 = arguments30.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = scope21.getScope((com.google.javascript.jscomp.Scope.Var) arguments30);
        com.google.javascript.rhino.Node node35 = arguments30.getNameNode();
        java.lang.String str36 = arguments30.name;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable37 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments30", arguments10.equals(arguments30) ? arguments10.hashCode() == arguments30.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.rhino.Node node24 = scope22.getRootNode();
        com.google.javascript.jscomp.Scope scope25 = scope22.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var26 = scope25.getArgumentsVar();
        com.google.javascript.rhino.Node node27 = scope25.getRootNode();
        boolean boolean28 = arguments6.equals((java.lang.Object) scope25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var26", arguments6.equals(var26) ? arguments6.hashCode() == var26.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        java.lang.Class<?> wildcardClass16 = var15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        int int20 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node24, jSType25, compilerInput26, false);
        com.google.javascript.jscomp.CompilerInput compilerInput29 = var28.input;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var28.", arguments10.equals(var28) == var28.equals(arguments10));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        com.google.javascript.jscomp.Scope.Var var17 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getParentNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var17", arguments6.equals(var17) ? arguments6.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.jscomp.Scope scope8 = scope7.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments9", var4.equals(arguments9) ? var4.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments4 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("goog.scope", node6, jSType7, compilerInput8);
        boolean boolean10 = var9.isDefine();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments4 and var9.", arguments4.equals(var9) == var9.equals(arguments4));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        int int14 = scope13.getVarCount();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope13.declare("<non-file>", node16, jSType17, compilerInput18);
        com.google.javascript.rhino.Node node20 = var19.getParentNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var19.", arguments6.equals(var19) == var19.equals(arguments6));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope16.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = scope16.getAllSymbols();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        boolean boolean26 = arguments25.isDefine();
        boolean boolean27 = arguments25.isGlobal();
        com.google.javascript.rhino.Node node28 = arguments25.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope16.getScope((com.google.javascript.jscomp.Scope.Var) arguments25);
        boolean boolean30 = arguments25.isConst();
        boolean boolean31 = arguments25.isLocal();
        com.google.javascript.jscomp.Scope scope32 = arguments25.scope;
        boolean boolean33 = scope32.isBottom();
        com.google.javascript.rhino.Node node34 = scope32.getRootNode();
        boolean boolean35 = arguments6.equals((java.lang.Object) node34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments25", arguments6.equals(arguments25) ? arguments6.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope24.declare("goog.scope", node26, jSType27, compilerInput28);
        boolean boolean30 = var29.isConst();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var29.", arguments11.equals(var29) == var29.equals(arguments11));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("hi!", node17, jSType18, compilerInput19, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments15", arguments10.equals(arguments15) ? arguments10.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope13.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope18 = scope13.getGlobalScope();
        boolean boolean19 = arguments6.equals((java.lang.Object) scope18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope18.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        arguments21.resolveType(errorReporter22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("arguments", node9, jSType10, compilerInput11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.jscomp.Scope.Var var18 = scope15.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        com.google.javascript.jscomp.Scope.Var var20 = arguments19.getDeclaration();
        boolean boolean22 = arguments19.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = arguments19.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        arguments19.resolveType(errorReporter24);
        com.google.javascript.rhino.Node node26 = arguments19.nameNode;
        com.google.javascript.jscomp.Scope scope27 = arguments19.scope;
        com.google.javascript.jscomp.Scope scope28 = arguments19.scope;
        com.google.javascript.jscomp.CompilerInput compilerInput29 = arguments19.getInput();
        com.google.javascript.jscomp.Scope.Var var30 = arguments19.getDeclaration();
        boolean boolean31 = var12.equals((java.lang.Object) arguments19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        com.google.javascript.jscomp.Scope scope19 = arguments11.getScope();
        com.google.javascript.rhino.Node node20 = arguments11.getNameNode();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        arguments11.resolveType(errorReporter21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope25.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable27 = scope25.getAllSymbols();
        com.google.javascript.jscomp.Scope scope28 = scope25.getParent();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope25.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope25.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope31 = scope25.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments32 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        boolean boolean33 = arguments11.equals((java.lang.Object) arguments32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments32", arguments11.equals(arguments32) ? arguments11.hashCode() == arguments32.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        boolean boolean15 = arguments10.isConst();
        com.google.javascript.rhino.Node node16 = arguments10.getNameNode();
        boolean boolean17 = arguments10.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments10.input;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope21.getParentScope();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope25.getVars();
        com.google.javascript.jscomp.Scope.Var var28 = scope25.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        boolean boolean30 = arguments29.isDefine();
        boolean boolean31 = arguments29.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable32 = scope21.getReferences((com.google.javascript.jscomp.Scope.Var) arguments29);
        boolean boolean33 = arguments29.isGlobal();
        boolean boolean34 = arguments29.isExtern();
        java.lang.String str35 = arguments29.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput36 = arguments29.input;
        boolean boolean37 = arguments10.equals((java.lang.Object) arguments29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments29", arguments10.equals(arguments29) ? arguments10.hashCode() == arguments29.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        com.google.javascript.jscomp.Scope.Var var16 = scope15.getArgumentsVar();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope15.getAllSymbols();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var16", arguments10.equals(var16) ? arguments10.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        com.google.javascript.jscomp.Scope scope13 = var11.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope13.declare("hi!", node16, jSType17, compilerInput18);
        boolean boolean20 = scope13.isBottom();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var19.", arguments6.equals(var19) == var19.equals(arguments6));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("<non-file>", node11, jSType12, compilerInput13);
        com.google.javascript.rhino.jstype.JSType jSType15 = var14.getType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var14.", arguments6.equals(var14) == var14.equals(arguments6));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        int int14 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("<non-file>", node18, jSType19, compilerInput20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        com.google.javascript.jscomp.Scope.Var var29 = arguments28.getDeclaration();
        boolean boolean31 = arguments28.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = arguments28.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var33 = arguments28.getSymbol();
        boolean boolean34 = var33.isConst();
        com.google.javascript.rhino.jstype.JSType jSType35 = var33.getType();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable36 = scope2.getReferences(var33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var21.", arguments10.equals(var21) == var21.equals(arguments10));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        boolean boolean16 = arguments10.isGlobal();
        com.google.javascript.jscomp.Scope scope17 = arguments10.scope;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        com.google.javascript.rhino.Node node25 = arguments24.getParentNode();
        boolean boolean26 = arguments24.isDefine;
        int int27 = arguments24.index;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable28 = scope17.getReferences((com.google.javascript.jscomp.Scope.Var) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments24", arguments10.equals(arguments24) ? arguments10.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var15 = var14.getSymbol();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var15", arguments10.equals(var15) ? arguments10.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        int int14 = scope2.getDepth();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope16 = scope2.getParent();
        boolean boolean19 = scope2.isDeclared("", true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        com.google.javascript.jscomp.Scope.Var var27 = arguments26.getDeclaration();
        boolean boolean29 = arguments26.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = arguments26.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope31 = arguments26.scope;
        int int32 = scope31.getDepth();
        com.google.javascript.jscomp.Scope.Var var34 = scope31.getVar("");
        com.google.javascript.jscomp.Scope.Var var35 = scope31.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope2.getScope(var35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments26", arguments10.equals(arguments26) ? arguments10.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = arguments11.getJSDocInfo();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        com.google.javascript.jscomp.Scope.Var var29 = arguments28.getDeclaration();
        boolean boolean31 = arguments28.equals((java.lang.Object) (byte) -1);
        java.lang.String str32 = arguments28.getInputName();
        com.google.javascript.jscomp.Scope.Var var33 = arguments28.getDeclaration();
        com.google.javascript.rhino.Node node34 = arguments28.getNode();
        boolean boolean35 = arguments11.equals((java.lang.Object) node34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments28", arguments11.equals(arguments28) ? arguments11.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("Scope.Var arguments{null}", node13, jSType14, compilerInput15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope20.getParentScope();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        boolean boolean29 = arguments28.isDefine();
        boolean boolean30 = arguments28.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable31 = scope20.getReferences((com.google.javascript.jscomp.Scope.Var) arguments28);
        boolean boolean32 = arguments28.isGlobal();
        boolean boolean33 = arguments28.isExtern();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        com.google.javascript.jscomp.Scope scope18 = arguments10.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput19 = arguments10.getInput();
        com.google.javascript.jscomp.Scope.Var var20 = arguments10.getSymbol();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        com.google.javascript.rhino.Node node28 = arguments27.getParentNode();
        boolean boolean29 = arguments27.isTypeInferred();
        boolean boolean30 = var20.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var20 and arguments27", var20.equals(arguments27) ? var20.hashCode() == arguments27.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope18.declare("Scope.Var arguments{null}", node21, jSType22, compilerInput23, false);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope18.getVars();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        boolean boolean18 = arguments11.isTypeInferred();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        com.google.javascript.jscomp.Scope.Var var26 = arguments25.getDeclaration();
        boolean boolean28 = arguments25.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = arguments25.getJSDocInfo();
        java.lang.Object obj30 = null;
        boolean boolean31 = arguments25.equals(obj30);
        com.google.javascript.jscomp.Scope scope32 = arguments25.scope;
        boolean boolean33 = scope32.isBottom();
        com.google.javascript.jscomp.Scope scope34 = scope32.getGlobalScope();
        boolean boolean35 = arguments11.equals((java.lang.Object) scope32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments25", arguments11.equals(arguments25) ? arguments11.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope18.declare("Scope.Var arguments{null}", node21, jSType22, compilerInput23, false);
        boolean boolean26 = scope18.isGlobal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var25.", arguments11.equals(var25) == var25.equals(arguments11));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        boolean boolean17 = arguments16.isConst();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments16", arguments6.equals(arguments16) ? arguments6.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope10.getSlot("hi!");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope10.declare("hi!", node14, jSType15, compilerInput16);
        boolean boolean18 = arguments6.equals((java.lang.Object) "hi!");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        boolean boolean20 = scope2.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope2.declare("Scope.Var arguments{null}", node23, jSType24, compilerInput25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope2.declare("arguments", node28, jSType29, compilerInput30, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var26.", arguments10.equals(var26) == var26.equals(arguments10));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("arguments");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean11 = arguments10.isNoShadow();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments10", arguments6.equals(arguments10) ? arguments6.hashCode() == arguments10.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = var15.getJSDocInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope9 = var8.scope;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        com.google.javascript.rhino.jstype.ObjectType objectType26 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope2.declare("<non-file>", node28, jSType29, compilerInput30, true);
        com.google.javascript.jscomp.Scope.Var var33 = scope2.getArgumentsVar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var32.", arguments11.equals(var32) == var32.equals(arguments11));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        int int16 = scope11.getDepth();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments4 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node7, jSType8, compilerInput9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments4 and var5", arguments4.equals(var5) ? arguments4.hashCode() == var5.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        com.google.javascript.jscomp.Scope.Var var25 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope2.getParentScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments18 and var25", arguments18.equals(var25) ? arguments18.hashCode() == var25.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        java.lang.String str15 = arguments10.name;
        com.google.javascript.jscomp.Scope scope16 = arguments10.getScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope16.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope.Var var20 = scope16.getVar("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
        com.google.javascript.jscomp.Scope.Var var22 = arguments21.getDeclaration();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments21", arguments10.equals(arguments21) ? arguments10.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        boolean boolean9 = scope2.isGlobal();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("Scope.Var arguments{null}", node11, jSType12, compilerInput13, true);
        com.google.javascript.jscomp.Scope scope16 = scope2.getGlobalScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope11.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope11.declare("hi!", node17, jSType18, compilerInput19, false);
        com.google.javascript.jscomp.CompilerInput compilerInput22 = var21.getInput();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var21.", arguments6.equals(var21) == var21.equals(arguments6));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.jscomp.Scope scope10 = scope9.getGlobalScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        boolean boolean18 = arguments17.isDefine();
        boolean boolean19 = arguments17.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope9.getScope((com.google.javascript.jscomp.Scope.Var) arguments17);
        com.google.javascript.rhino.Node node21 = arguments17.getNameNode();
        com.google.javascript.jscomp.Scope.Var var22 = arguments17.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput23 = arguments17.getInput();
        java.lang.String str24 = arguments17.name;
        com.google.javascript.rhino.Node node25 = arguments17.getNameNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments17);
        boolean boolean27 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean31 = scope2.isDeclared("hi!", true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments17 and arguments28", arguments17.equals(arguments28) ? arguments17.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope14.getSlot("<non-file>");
        boolean boolean19 = scope14.isGlobal();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope14.declare("arguments", node21, jSType22, compilerInput23, false);
        int int26 = var25.index;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var25.", arguments6.equals(var25) == var25.equals(arguments6));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("hi!", true);
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
        boolean boolean22 = arguments16.isTypeInferred();
        java.lang.String str23 = arguments16.toString();
        com.google.javascript.jscomp.Scope scope24 = arguments16.getScope();
        boolean boolean25 = arguments16.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput26 = arguments16.getInput();
        int int27 = arguments16.index;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = arguments16.getInput();
        com.google.javascript.jscomp.CompilerInput compilerInput29 = arguments16.input;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable30 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments16);
        boolean boolean33 = scope2.isDeclared("arguments", true);
        boolean boolean34 = scope2.isLocal();
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.jscomp.Scope scope37 = new com.google.javascript.jscomp.Scope(node35, objectType36);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor38 = scope37.getVars();
        com.google.javascript.jscomp.Scope.Var var40 = scope37.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot42 = scope37.getOwnSlot("arguments");
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.jscomp.Scope scope45 = new com.google.javascript.jscomp.Scope(node43, objectType44);
        com.google.javascript.jscomp.Scope scope46 = scope45.getGlobalScope();
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.jscomp.Scope scope49 = new com.google.javascript.jscomp.Scope(node47, objectType48);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor50 = scope49.getVars();
        com.google.javascript.jscomp.Scope.Var var52 = scope49.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments53 = new com.google.javascript.jscomp.Scope.Arguments(scope49);
        boolean boolean54 = arguments53.isDefine();
        boolean boolean55 = arguments53.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope56 = scope45.getScope((com.google.javascript.jscomp.Scope.Var) arguments53);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        arguments53.resolveType(errorReporter57);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable59 = scope37.getReferences((com.google.javascript.jscomp.Scope.Var) arguments53);
        boolean boolean60 = arguments53.isNoShadow();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope61 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments16 and arguments53", arguments16.equals(arguments53) ? arguments16.hashCode() == arguments53.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope2.declare("<non-file>", node26, jSType27, compilerInput28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments24", arguments11.equals(arguments24) ? arguments11.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
        java.lang.String str17 = arguments11.name;
        java.lang.String str18 = arguments11.getInputName();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope21.getParentScope();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope25.getVars();
        com.google.javascript.jscomp.Scope.Var var28 = scope25.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        boolean boolean30 = arguments29.isDefine();
        boolean boolean31 = arguments29.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable32 = scope21.getReferences((com.google.javascript.jscomp.Scope.Var) arguments29);
        com.google.javascript.jscomp.CompilerInput compilerInput33 = arguments29.getInput();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        arguments29.resolveType(errorReporter34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = arguments29.getJSDocInfo();
        boolean boolean37 = arguments29.isGlobal();
        boolean boolean38 = arguments11.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments29", arguments11.equals(arguments29) ? arguments11.hashCode() == arguments29.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("Scope.Var arguments{null}", node9, jSType10, compilerInput11);
        com.google.javascript.jscomp.Scope scope13 = scope2.getGlobalScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var12.", arguments6.equals(var12) == var12.equals(arguments6));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        boolean boolean9 = var8.isConst();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = arguments14.getJSDocInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments14", arguments6.equals(arguments14) ? arguments6.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
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
        com.google.javascript.rhino.jstype.ObjectType objectType26 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope2.declare("<non-file>", node28, jSType29, compilerInput30, true);
        com.google.javascript.rhino.Node node33 = var32.getNameNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var32.", arguments11.equals(var32) == var32.equals(arguments11));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        boolean boolean15 = scope2.isLocal();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.jscomp.Scope scope19 = scope18.getGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        boolean boolean27 = arguments26.isDefine();
        boolean boolean28 = arguments26.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope18.getScope((com.google.javascript.jscomp.Scope.Var) arguments26);
        com.google.javascript.rhino.Node node30 = arguments26.getNameNode();
        com.google.javascript.jscomp.Scope.Var var31 = arguments26.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput32 = arguments26.getInput();
        java.lang.String str33 = arguments26.name;
        com.google.javascript.rhino.Node node34 = arguments26.getNameNode();
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.jscomp.Scope scope37 = new com.google.javascript.jscomp.Scope(node35, objectType36);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor38 = scope37.getDeclarativelyUnboundVarsWithoutTypes();
        int int39 = scope37.getVarCount();
        com.google.javascript.rhino.Node node40 = scope37.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot42 = scope37.getOwnSlot("hi!");
        boolean boolean43 = arguments26.equals((java.lang.Object) jSTypeStaticSlot42);
        boolean boolean44 = arguments26.isTypeInferred();
        com.google.javascript.rhino.Node node45 = arguments26.getParentNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable46 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments26", arguments10.equals(arguments26) ? arguments10.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments4 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope8.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = scope8.getAllSymbols();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        boolean boolean18 = arguments17.isDefine();
        boolean boolean19 = arguments17.isGlobal();
        com.google.javascript.rhino.Node node20 = arguments17.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope8.getScope((com.google.javascript.jscomp.Scope.Var) arguments17);
        boolean boolean22 = arguments17.isConst();
        java.lang.String str23 = arguments17.getInputName();
        com.google.javascript.rhino.Node node24 = arguments17.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope25 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments4 and var5", arguments4.equals(var5) ? arguments4.hashCode() == var5.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean8 = scope2.isLocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("<non-file>", node12, jSType13, compilerInput14);
        java.lang.String str16 = var15.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var15.", arguments6.equals(var15) == var15.equals(arguments6));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope20 = scope18.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.rhino.Node node22 = arguments21.getParentNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        boolean boolean20 = scope2.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope2.declare("Scope.Var arguments{null}", node23, jSType24, compilerInput25);
        com.google.javascript.rhino.Node node27 = var26.getNameNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var26.", arguments10.equals(var26) == var26.equals(arguments10));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.jscomp.Scope scope31 = new com.google.javascript.jscomp.Scope(node29, objectType30);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor32 = scope31.getVars();
        com.google.javascript.jscomp.Scope.Var var34 = scope31.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments35 = new com.google.javascript.jscomp.Scope.Arguments(scope31);
        com.google.javascript.jscomp.Scope.Var var36 = arguments35.getDeclaration();
        boolean boolean38 = arguments35.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = arguments35.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope40 = arguments35.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope41 = scope40.getParentScope();
        boolean boolean42 = scope40.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = scope40.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot45 = scope40.getOwnSlot("arguments");
        boolean boolean48 = scope40.isDeclared("Scope.Var arguments{null}", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot50 = scope40.getOwnSlot("<non-file>");
        boolean boolean51 = var28.equals((java.lang.Object) scope40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = arguments15.input;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments15", arguments10.equals(arguments15) ? arguments10.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope11.declare("goog.scope", node16, jSType17, compilerInput18, false);
        com.google.javascript.jscomp.CompilerInput compilerInput21 = var20.input;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var20.", arguments6.equals(var20) == var20.equals(arguments6));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        com.google.javascript.jscomp.Scope scope18 = arguments6.scope;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        com.google.javascript.jscomp.Scope.Var var26 = arguments25.getDeclaration();
        boolean boolean28 = arguments25.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = arguments25.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        arguments25.resolveType(errorReporter30);
        com.google.javascript.rhino.Node node32 = arguments25.nameNode;
        java.lang.String str33 = arguments25.getInputName();
        com.google.javascript.rhino.Node node34 = arguments25.getNode();
        boolean boolean35 = arguments25.isDefine;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.jscomp.Scope scope38 = new com.google.javascript.jscomp.Scope(node36, objectType37);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable39 = scope38.getAllSymbols();
        int int40 = scope38.getDepth();
        int int41 = scope38.getVarCount();
        boolean boolean42 = arguments25.equals((java.lang.Object) scope38);
        boolean boolean43 = arguments6.equals((java.lang.Object) arguments25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments25", arguments6.equals(arguments25) ? arguments6.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope10.getVars();
        com.google.javascript.jscomp.Scope.Var var13 = scope10.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope10);
        com.google.javascript.jscomp.Scope.Var var15 = arguments14.getDeclaration();
        boolean boolean17 = arguments14.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = arguments14.getJSDocInfo();
        boolean boolean19 = arguments14.isLocal();
        boolean boolean20 = arguments14.isTypeInferred();
        java.lang.String str21 = arguments14.toString();
        com.google.javascript.jscomp.Scope scope22 = arguments14.getScope();
        com.google.javascript.rhino.Node node23 = arguments14.getNameNode();
        boolean boolean24 = arguments14.isLocal();
        boolean boolean25 = arguments7.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments7 and arguments14", arguments7.equals(arguments14) ? arguments7.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        boolean boolean8 = arguments6.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = arguments6.getJSDocInfo();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = arguments6.input;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope13.declare("hi!", node17, jSType18, compilerInput19, true);
        boolean boolean22 = arguments6.equals((java.lang.Object) var21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var21.", arguments6.equals(var21) == var21.equals(arguments6));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        boolean boolean15 = arguments6.isNoShadow();
        java.lang.String str16 = arguments6.getName();
        java.lang.String str17 = arguments6.name;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.jscomp.Scope scope21 = scope20.getGlobalScope();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        boolean boolean29 = arguments28.isDefine();
        boolean boolean30 = arguments28.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope31 = scope20.getScope((com.google.javascript.jscomp.Scope.Var) arguments28);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        arguments28.resolveType(errorReporter32);
        boolean boolean34 = arguments28.isExtern();
        com.google.javascript.jscomp.Scope.Var var35 = arguments28.getSymbol();
        boolean boolean36 = arguments6.equals((java.lang.Object) arguments28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments28", arguments6.equals(arguments28) ? arguments6.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope19.getAllSymbols();
        boolean boolean25 = scope19.isGlobal();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope28.getVars();
        com.google.javascript.jscomp.Scope.Var var31 = scope28.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments32 = new com.google.javascript.jscomp.Scope.Arguments(scope28);
        com.google.javascript.jscomp.Scope.Var var33 = arguments32.getDeclaration();
        boolean boolean35 = arguments32.equals((java.lang.Object) (byte) -1);
        boolean boolean36 = arguments32.isConst();
        com.google.javascript.jscomp.CompilerInput compilerInput37 = arguments32.input;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable38 = scope19.getReferences((com.google.javascript.jscomp.Scope.Var) arguments32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments32", arguments6.equals(arguments32) ? arguments6.hashCode() == arguments32.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        boolean boolean17 = scope14.isBottom();
        boolean boolean18 = scope14.isLocal();
        com.google.javascript.jscomp.Scope.Var var19 = scope14.getArgumentsVar();
        boolean boolean20 = scope14.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var19", arguments6.equals(var19) ? arguments6.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments4 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isDefine();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments4 and var5", arguments4.equals(var5) ? arguments4.hashCode() == var5.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        boolean boolean20 = scope2.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean23 = arguments22.isDefine();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments22", arguments10.equals(arguments22) ? arguments10.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope20 = scope18.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        boolean boolean22 = arguments21.isLocal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope15.getAllSymbols();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        boolean boolean25 = arguments24.isDefine();
        boolean boolean26 = arguments24.isGlobal();
        com.google.javascript.rhino.Node node27 = arguments24.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope15.getScope((com.google.javascript.jscomp.Scope.Var) arguments24);
        boolean boolean29 = arguments24.isConst();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = arguments24.getJSDocInfo();
        boolean boolean31 = arguments6.equals((java.lang.Object) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments24", arguments6.equals(arguments24) ? arguments6.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var20 = arguments19.getDeclaration();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments19", arguments11.equals(arguments19) ? arguments11.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope13.getAllSymbols();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        boolean boolean23 = arguments22.isDefine();
        boolean boolean24 = arguments22.isGlobal();
        com.google.javascript.rhino.Node node25 = arguments22.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope13.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        boolean boolean27 = arguments22.isConst();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = arguments22.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = scope2.getAllSymbols();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        arguments22.resolveType(errorReporter27);
        com.google.javascript.rhino.Node node29 = arguments22.nameNode;
        java.lang.String str30 = arguments22.getInputName();
        boolean boolean31 = arguments22.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments22", arguments10.equals(arguments22) ? arguments10.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = arguments11.getJSDocInfo();
        com.google.javascript.rhino.Node node22 = arguments11.getParentNode();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope25.getVars();
        com.google.javascript.jscomp.Scope.Var var28 = scope25.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        boolean boolean30 = arguments29.isDefine();
        com.google.javascript.jscomp.Scope scope31 = arguments29.getScope();
        java.lang.String str32 = arguments29.getInputName();
        boolean boolean33 = arguments11.equals((java.lang.Object) arguments29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments29", arguments11.equals(arguments29) ? arguments11.hashCode() == arguments29.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        com.google.javascript.jscomp.Scope.Var var25 = scope24.getArgumentsVar();
        com.google.javascript.rhino.Node node26 = var25.nameNode;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var25", arguments11.equals(var25) ? arguments11.hashCode() == var25.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var21 = scope2.getVar("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments19", arguments11.equals(arguments19) ? arguments11.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getArgumentsVar();
        java.lang.String str16 = var15.getInputName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var15", arguments6.equals(var15) ? arguments6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
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
        int int15 = scope11.getVarCount();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope11.getAllSymbols();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope11.declare("goog.scope", node18, jSType19, compilerInput20);
        com.google.javascript.jscomp.Scope.Var var22 = scope11.getArgumentsVar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var21.", arguments6.equals(var21) == var21.equals(arguments6));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        boolean boolean26 = scope2.isGlobal();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope2.declare("hi!", node28, jSType29, compilerInput30, false);
        com.google.javascript.jscomp.Scope scope33 = scope2.getGlobalScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var32.", arguments11.equals(var32) == var32.equals(arguments11));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        com.google.javascript.jscomp.Scope scope13 = var11.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        boolean boolean15 = scope13.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope13.declare("goog.scope", node18, jSType19, compilerInput20);
        boolean boolean22 = var21.isGlobal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var21.", arguments6.equals(var21) == var21.equals(arguments6));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
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
        boolean boolean26 = scope2.isGlobal();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope2.declare("hi!", node28, jSType29, compilerInput30, false);
        boolean boolean33 = scope2.isGlobal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var32.", arguments11.equals(var32) == var32.equals(arguments11));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope20.getVars();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        com.google.javascript.jscomp.Scope.Var var25 = arguments24.getDeclaration();
        boolean boolean27 = arguments24.equals((java.lang.Object) (byte) -1);
        java.lang.String str28 = arguments24.getInputName();
        int int29 = arguments24.index;
        java.lang.String str30 = arguments24.getInputName();
        java.lang.String str31 = arguments24.getInputName();
        java.lang.String str32 = arguments24.name;
        boolean boolean33 = arguments24.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType34 = arguments24.getType();
        boolean boolean35 = arguments11.equals((java.lang.Object) jSType34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments24", arguments11.equals(arguments24) ? arguments11.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        int int14 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("<non-file>", node18, jSType19, compilerInput20);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot23 = scope2.getOwnSlot("<non-file>");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and jSTypeStaticSlot23.", arguments10.equals(jSTypeStaticSlot23) == jSTypeStaticSlot23.equals(arguments10));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        java.lang.String str15 = arguments10.name;
        com.google.javascript.jscomp.Scope scope16 = arguments10.getScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope16.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope.Var var20 = scope16.getVar("Scope.Var arguments{null}");
        boolean boolean23 = scope16.isDeclared("", true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.jscomp.Scope scope26 = new com.google.javascript.jscomp.Scope(node24, objectType25);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable27 = scope26.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope26.getParentScope();
        boolean boolean29 = scope26.isBottom();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput33 = null;
        com.google.javascript.jscomp.Scope.Var var34 = scope26.declare("goog.scope", node31, jSType32, compilerInput33);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = scope16.getScope(var34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var34.", arguments10.equals(var34) == var34.equals(arguments10));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("Scope.Var arguments{null}", node13, jSType14, compilerInput15, false);
        boolean boolean18 = var17.isConst();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var17.", arguments6.equals(var17) == var17.equals(arguments6));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        boolean boolean17 = scope14.isBottom();
        boolean boolean18 = scope14.isLocal();
        com.google.javascript.jscomp.Scope.Var var19 = scope14.getArgumentsVar();
        com.google.javascript.rhino.jstype.JSType jSType20 = var19.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var19", arguments6.equals(var19) ? arguments6.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
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
        com.google.javascript.rhino.Node node16 = arguments11.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType17 = arguments11.getType();
        com.google.javascript.rhino.Node node18 = arguments11.nameNode;
        boolean boolean19 = arguments11.isExtern();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope22.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        com.google.javascript.jscomp.Scope.Var var27 = arguments26.getDeclaration();
        boolean boolean29 = arguments26.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = arguments26.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        arguments26.resolveType(errorReporter31);
        com.google.javascript.rhino.Node node33 = arguments26.nameNode;
        java.lang.String str34 = arguments26.getInputName();
        java.lang.String str35 = arguments26.getName();
        java.lang.String str36 = arguments26.getInputName();
        com.google.javascript.jscomp.Scope scope37 = arguments26.getScope();
        boolean boolean38 = scope37.isBottom();
        boolean boolean39 = arguments11.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments26", arguments11.equals(arguments26) ? arguments11.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope11.getVar("arguments");
        int int16 = scope11.getVarCount();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Var var22 = scope19.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        java.lang.String str24 = arguments23.getName();
        boolean boolean25 = arguments23.isNoShadow();
        boolean boolean26 = arguments23.isConst();
        com.google.javascript.rhino.Node node27 = arguments23.nameNode;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable28 = scope11.getReferences((com.google.javascript.jscomp.Scope.Var) arguments23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments23", arguments6.equals(arguments23) ? arguments6.hashCode() == arguments23.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope16.declare("arguments", node21, jSType22, compilerInput23);
        java.lang.String str25 = var24.name;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var24.", arguments11.equals(var24) == var24.equals(arguments11));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope11.getSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var17 = scope11.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope18 = var17.scope;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var17", arguments6.equals(var17) ? arguments6.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments4 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = var5.getJSDocInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments4 and var5", arguments4.equals(var5) ? arguments4.hashCode() == var5.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
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
        com.google.javascript.jscomp.Scope.Var var17 = scope16.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var18 = var17.getSymbol();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var18", arguments11.equals(var18) ? arguments11.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        com.google.javascript.jscomp.Scope scope13 = var11.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        boolean boolean15 = scope13.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope13.declare("goog.scope", node18, jSType19, compilerInput20);
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var21.", arguments6.equals(var21) == var21.equals(arguments6));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean16 = scope2.isLocal();
        boolean boolean17 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int19 = scope2.getDepth();
        boolean boolean20 = scope2.isGlobal();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        com.google.javascript.jscomp.Scope.Var var28 = arguments27.getDeclaration();
        boolean boolean30 = arguments27.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = arguments27.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var32 = arguments27.getSymbol();
        boolean boolean33 = var32.isConst();
        com.google.javascript.rhino.jstype.JSType jSType34 = var32.getType();
        boolean boolean35 = var32.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable36 = scope2.getReferences(var32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var32", arguments10.equals(var32) ? arguments10.hashCode() == var32.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
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
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope21.getVars();
        com.google.javascript.jscomp.Scope.Var var24 = scope21.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope21);
        boolean boolean26 = arguments25.isDefine();
        java.lang.String str27 = arguments25.name;
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = arguments25.getJSDocInfo();
        int int29 = arguments25.index;
        boolean boolean30 = arguments11.equals((java.lang.Object) int29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments25", arguments11.equals(arguments25) ? arguments11.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        arguments15.resolveType(errorReporter16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments15", arguments10.equals(arguments15) ? arguments10.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        com.google.javascript.jscomp.Scope.Arguments arguments16 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        com.google.javascript.jscomp.Scope.Var var18 = scope14.getVar("arguments");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments16", arguments6.equals(arguments16) ? arguments6.hashCode() == arguments16.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
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
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        arguments10.resolveType(errorReporter15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Var var22 = scope19.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        boolean boolean24 = arguments23.isDefine();
        boolean boolean25 = arguments23.isGlobal();
        com.google.javascript.jscomp.CompilerInput compilerInput26 = arguments23.input;
        com.google.javascript.rhino.Node node27 = arguments23.getNameNode();
        boolean boolean28 = arguments23.isConst();
        java.lang.String str29 = arguments23.toString();
        boolean boolean30 = arguments10.equals((java.lang.Object) arguments23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments23", arguments10.equals(arguments23) ? arguments10.hashCode() == arguments23.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node25, jSType26, compilerInput27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.jscomp.Scope scope31 = new com.google.javascript.jscomp.Scope(node29, objectType30);
        com.google.javascript.jscomp.Scope scope32 = scope31.getGlobalScope();
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.jscomp.Scope scope35 = new com.google.javascript.jscomp.Scope(node33, objectType34);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor36 = scope35.getVars();
        com.google.javascript.jscomp.Scope.Var var38 = scope35.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments39 = new com.google.javascript.jscomp.Scope.Arguments(scope35);
        boolean boolean40 = arguments39.isDefine();
        boolean boolean41 = arguments39.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope42 = scope31.getScope((com.google.javascript.jscomp.Scope.Var) arguments39);
        com.google.javascript.rhino.Node node43 = arguments39.nameNode;
        boolean boolean44 = arguments39.isConst();
        com.google.javascript.rhino.Node node45 = arguments39.getNameNode();
        boolean boolean46 = arguments39.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput47 = arguments39.getInput();
        int int48 = arguments39.index;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable49 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
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
        com.google.javascript.rhino.Node node14 = arguments10.getNode();
        com.google.javascript.jscomp.Scope.Var var15 = arguments10.getDeclaration();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.jscomp.Scope.Var var23 = arguments22.getDeclaration();
        boolean boolean25 = arguments22.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = arguments22.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        arguments22.resolveType(errorReporter27);
        com.google.javascript.rhino.Node node29 = arguments22.nameNode;
        com.google.javascript.rhino.Node node30 = arguments22.nameNode;
        boolean boolean31 = arguments22.isNoShadow();
        java.lang.String str32 = arguments22.getName();
        boolean boolean33 = arguments22.isConst();
        boolean boolean34 = arguments22.isConst();
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.jscomp.Scope scope37 = new com.google.javascript.jscomp.Scope(node35, objectType36);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope38 = scope37.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot40 = scope37.getOwnSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot42 = scope37.getSlot("hi!");
        com.google.javascript.jscomp.Scope scope43 = scope37.getParent();
        boolean boolean44 = arguments22.equals((java.lang.Object) scope43);
        boolean boolean45 = arguments10.equals((java.lang.Object) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments22", arguments10.equals(arguments22) ? arguments10.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Var var22 = scope19.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        com.google.javascript.jscomp.Scope.Var var24 = arguments23.getDeclaration();
        boolean boolean26 = arguments23.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = arguments23.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope28 = arguments23.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope28.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope28.getParentScope();
        com.google.javascript.jscomp.Scope scope31 = scope28.getParent();
        boolean boolean32 = arguments10.equals((java.lang.Object) scope28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments23", arguments10.equals(arguments23) ? arguments10.hashCode() == arguments23.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        com.google.javascript.jscomp.Scope scope14 = arguments6.scope;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getVars();
        com.google.javascript.jscomp.Scope.Var var20 = scope17.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.jscomp.Scope.Var var22 = arguments21.getDeclaration();
        boolean boolean24 = arguments21.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = arguments21.getJSDocInfo();
        java.lang.Object obj26 = null;
        boolean boolean27 = arguments21.equals(obj26);
        java.lang.String str28 = arguments21.name;
        java.lang.String str29 = arguments21.toString();
        int int30 = arguments21.index;
        boolean boolean31 = arguments21.isDefine;
        com.google.javascript.jscomp.Scope scope32 = arguments21.scope;
        boolean boolean33 = arguments6.equals((java.lang.Object) arguments21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments21", arguments6.equals(arguments21) ? arguments6.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
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
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope21.declare("hi!", node24, jSType25, compilerInput26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.jscomp.Scope scope31 = new com.google.javascript.jscomp.Scope(node29, objectType30);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor32 = scope31.getVars();
        com.google.javascript.jscomp.Scope.Var var34 = scope31.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments35 = new com.google.javascript.jscomp.Scope.Arguments(scope31);
        com.google.javascript.jscomp.Scope.Var var36 = arguments35.getDeclaration();
        boolean boolean38 = arguments35.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = arguments35.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope40 = arguments35.scope;
        com.google.javascript.jscomp.Scope.Var var41 = arguments35.getSymbol();
        boolean boolean42 = var41.isTypeInferred();
        com.google.javascript.jscomp.Scope scope43 = var41.getScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope44 = scope21.getScope(var41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
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
        com.google.javascript.rhino.Node node13 = arguments10.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("<non-file>", node16, jSType17, compilerInput18, false);
        com.google.javascript.rhino.Node node21 = var20.getParentNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var20.", arguments10.equals(var20) == var20.equals(arguments10));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("<non-file>", node16, jSType17, compilerInput18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope22.getParentScope();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.jscomp.Scope scope26 = new com.google.javascript.jscomp.Scope(node24, objectType25);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope26.getVars();
        com.google.javascript.jscomp.Scope.Var var29 = scope26.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments30 = new com.google.javascript.jscomp.Scope.Arguments(scope26);
        boolean boolean31 = arguments30.isDefine();
        boolean boolean32 = arguments30.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable33 = scope22.getReferences((com.google.javascript.jscomp.Scope.Var) arguments30);
        java.lang.String str34 = arguments30.getName();
        com.google.javascript.rhino.Node node35 = arguments30.getNode();
        boolean boolean36 = var19.equals((java.lang.Object) node35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var19.", arguments10.equals(var19) == var19.equals(arguments10));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope13.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope18 = scope13.getGlobalScope();
        boolean boolean19 = arguments6.equals((java.lang.Object) scope18);
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        java.lang.String str21 = arguments20.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments20", arguments6.equals(arguments20) ? arguments6.hashCode() == arguments20.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        int int13 = arguments6.index;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getVars();
        com.google.javascript.jscomp.Scope.Var var19 = scope16.getVar("");
        boolean boolean20 = scope16.isGlobal();
        boolean boolean23 = scope16.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.jscomp.Scope scope26 = new com.google.javascript.jscomp.Scope(node24, objectType25);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope26.getVars();
        com.google.javascript.jscomp.Scope.Var var29 = scope26.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments30 = new com.google.javascript.jscomp.Scope.Arguments(scope26);
        com.google.javascript.jscomp.Scope.Var var31 = arguments30.getDeclaration();
        boolean boolean33 = arguments30.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = arguments30.getJSDocInfo();
        boolean boolean35 = arguments30.isLocal();
        boolean boolean36 = arguments30.isTypeInferred();
        java.lang.String str37 = arguments30.toString();
        com.google.javascript.jscomp.Scope scope38 = arguments30.getScope();
        boolean boolean39 = arguments30.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput40 = arguments30.getInput();
        int int41 = arguments30.index;
        com.google.javascript.jscomp.CompilerInput compilerInput42 = arguments30.getInput();
        com.google.javascript.jscomp.CompilerInput compilerInput43 = arguments30.input;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable44 = scope16.getReferences((com.google.javascript.jscomp.Scope.Var) arguments30);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        arguments30.resolveType(errorReporter45);
        boolean boolean47 = arguments6.equals((java.lang.Object) errorReporter45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments30", arguments6.equals(arguments30) ? arguments6.hashCode() == arguments30.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        java.lang.String str15 = arguments10.name;
        com.google.javascript.jscomp.Scope scope16 = arguments10.getScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope16.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope.Var var20 = scope16.getVar("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Var var21 = scope16.getArgumentsVar();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        com.google.javascript.jscomp.Scope.Var var29 = arguments28.getDeclaration();
        boolean boolean31 = arguments28.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = arguments28.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var33 = arguments28.getSymbol();
        boolean boolean34 = var33.isConst();
        boolean boolean35 = var33.isGlobal();
        com.google.javascript.rhino.Node node36 = var33.nameNode;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable37 = scope16.getReferences(var33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var21", arguments10.equals(var21) ? arguments10.hashCode() == var21.hashCode() : true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope2.getVars();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments27 = new com.google.javascript.jscomp.Scope.Arguments(scope23);
        com.google.javascript.jscomp.Scope.Var var28 = arguments27.getDeclaration();
        boolean boolean30 = arguments27.equals((java.lang.Object) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = arguments27.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        arguments27.resolveType(errorReporter32);
        com.google.javascript.rhino.Node node34 = arguments27.nameNode;
        com.google.javascript.rhino.Node node35 = arguments27.nameNode;
        com.google.javascript.rhino.Node node36 = arguments27.getNode();
        boolean boolean37 = arguments27.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable38 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments27", arguments11.equals(arguments27) ? arguments11.hashCode() == arguments27.hashCode() : true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int4 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("arguments");
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope2.getTypeOfThis();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments10", arguments6.equals(arguments10) ? arguments6.hashCode() == arguments10.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("Scope.Var arguments{null}", node15, jSType16, compilerInput17, true);
        com.google.javascript.jscomp.CompilerInput compilerInput20 = var19.getInput();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var19.", arguments10.equals(var19) == var19.equals(arguments10));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        boolean boolean15 = scope11.isDeclared("", true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope18.getVars();
        com.google.javascript.jscomp.Scope.Var var21 = scope18.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        boolean boolean23 = arguments22.isDefine();
        boolean boolean24 = arguments22.isGlobal();
        java.lang.String str25 = arguments22.name;
        java.lang.String str26 = arguments22.toString();
        com.google.javascript.jscomp.Scope.Var var27 = arguments22.getSymbol();
        int int28 = var27.index;
        com.google.javascript.jscomp.Scope.Var var29 = var27.getDeclaration();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope11.getScope(var27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var27", arguments6.equals(var27) ? arguments6.hashCode() == var27.hashCode() : true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        boolean boolean26 = scope2.isGlobal();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.jscomp.Scope scope29 = new com.google.javascript.jscomp.Scope(node27, objectType28);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope29.getParentScope();
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        com.google.javascript.jscomp.Scope scope33 = new com.google.javascript.jscomp.Scope(node31, objectType32);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor34 = scope33.getVars();
        com.google.javascript.jscomp.Scope.Var var36 = scope33.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments37 = new com.google.javascript.jscomp.Scope.Arguments(scope33);
        boolean boolean38 = arguments37.isDefine();
        boolean boolean39 = arguments37.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable40 = scope29.getReferences((com.google.javascript.jscomp.Scope.Var) arguments37);
        com.google.javascript.rhino.Node node41 = arguments37.getNode();
        com.google.javascript.jscomp.Scope.Var var42 = arguments37.getDeclaration();
        boolean boolean43 = arguments37.isDefine;
        boolean boolean45 = arguments37.equals((java.lang.Object) (short) -1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope46 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments37", arguments11.equals(arguments37) ? arguments11.hashCode() == arguments37.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        int int20 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node24, jSType25, compilerInput26, false);
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var28.", arguments10.equals(var28) == var28.equals(arguments10));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
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
        boolean boolean14 = scope11.isLocal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope11.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope11.declare("Scope.Var arguments{null}", node18, jSType19, compilerInput20, true);
        com.google.javascript.jscomp.Scope.Var var24 = scope11.getVar("hi!");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var22.", arguments6.equals(var22) == var22.equals(arguments6));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
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
        int int21 = arguments11.index;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor25 = scope24.getVars();
        com.google.javascript.jscomp.Scope.Var var27 = scope24.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments28 = new com.google.javascript.jscomp.Scope.Arguments(scope24);
        boolean boolean29 = arguments28.isDefine();
        boolean boolean30 = arguments28.isGlobal();
        java.lang.String str31 = arguments28.name;
        boolean boolean32 = arguments28.isTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType33 = arguments28.getType();
        java.lang.String str34 = arguments28.getName();
        boolean boolean35 = arguments28.isLocal();
        boolean boolean36 = arguments28.isNoShadow();
        boolean boolean37 = arguments11.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments28", arguments11.equals(arguments28) ? arguments11.hashCode() == arguments28.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        boolean boolean17 = scope10.isBottom();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var16.", arguments6.equals(var16) == var16.equals(arguments6));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = scope2.getAllSymbols();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var13", arguments10.equals(var13) ? arguments10.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine();
        boolean boolean8 = arguments6.isDefine;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        com.google.javascript.jscomp.Scope.Var var18 = scope15.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        boolean boolean20 = arguments19.isDefine();
        boolean boolean21 = arguments19.isGlobal();
        com.google.javascript.rhino.Node node22 = arguments19.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope11.getScope((com.google.javascript.jscomp.Scope.Var) arguments19);
        boolean boolean24 = arguments6.equals((java.lang.Object) scope11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments19", arguments6.equals(arguments19) ? arguments6.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isDefine;
        com.google.javascript.rhino.Node node6 = var4.getNameNode();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.jscomp.Scope scope10 = scope9.getGlobalScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        boolean boolean18 = arguments17.isDefine();
        boolean boolean19 = arguments17.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope9.getScope((com.google.javascript.jscomp.Scope.Var) arguments17);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        arguments17.resolveType(errorReporter21);
        boolean boolean23 = arguments17.isExtern();
        com.google.javascript.jscomp.Scope.Var var24 = arguments17.getSymbol();
        com.google.javascript.rhino.Node node25 = arguments17.getNode();
        boolean boolean26 = arguments17.isDefine();
        com.google.javascript.jscomp.Scope scope27 = arguments17.scope;
        boolean boolean28 = var4.equals((java.lang.Object) scope27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments17", var4.equals(arguments17) ? var4.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        int int14 = scope13.getVarCount();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope13.declare("<non-file>", node16, jSType17, compilerInput18);
        boolean boolean20 = var19.isDefine();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var19.", arguments6.equals(var19) == var19.equals(arguments6));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = arguments11.getJSDocInfo();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope25 = scope24.getParentScope();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor29 = scope28.getVars();
        com.google.javascript.jscomp.Scope.Var var31 = scope28.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments32 = new com.google.javascript.jscomp.Scope.Arguments(scope28);
        boolean boolean33 = arguments32.isDefine();
        boolean boolean34 = arguments32.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable35 = scope24.getReferences((com.google.javascript.jscomp.Scope.Var) arguments32);
        boolean boolean36 = arguments11.equals((java.lang.Object) arguments32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments32", arguments11.equals(arguments32) ? arguments11.hashCode() == arguments32.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
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
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope21.declare("hi!", node24, jSType25, compilerInput26, false);
        com.google.javascript.jscomp.Scope.Var var29 = scope21.getArgumentsVar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var28.", arguments11.equals(var28) == var28.equals(arguments11));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        boolean boolean14 = scope2.isGlobal();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        boolean boolean18 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        boolean boolean20 = scope2.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope2.declare("Scope.Var arguments{null}", node23, jSType24, compilerInput25);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope2.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments10 and var26.", arguments10.equals(var26) == var26.equals(arguments10));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var7 = arguments6.getDeclaration();
        boolean boolean9 = arguments6.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = arguments6.isConst();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        int int15 = scope13.getVarCount();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope13.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope13.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope18 = scope13.getGlobalScope();
        boolean boolean19 = arguments6.equals((java.lang.Object) scope18);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope18.declare("arguments", node21, jSType22, compilerInput23, true);
        boolean boolean26 = var25.isConst();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var25.", arguments6.equals(var25) == var25.equals(arguments6));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope19.getVars();
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope19);
        com.google.javascript.jscomp.Scope.Var var27 = scope19.getVar("<non-file>");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and arguments25", arguments10.equals(arguments25) ? arguments10.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        com.google.javascript.jscomp.Scope scope13 = arguments6.scope;
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope13.declare("Scope.Var arguments{null}", node16, jSType17, compilerInput18, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments14", arguments6.equals(arguments14) ? arguments6.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        com.google.javascript.rhino.jstype.JSType jSType14 = var13.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var13", arguments10.equals(var13) ? arguments10.hashCode() == var13.hashCode() : true);
    }
}

